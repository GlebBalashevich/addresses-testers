package com.balashevich.address.service;

import java.io.IOException;

import com.balashevich.address.dto.LobUsAutocompleteRequest;
import com.balashevich.address.dto.LobUsVerificationRequest;
import com.balashevich.address.exception.LobException;
import com.balashevich.address.mapper.LobMapper;
import com.balashevich.address.model.LobUsAutocomplete;
import com.balashevich.address.model.LobUsVerification;
import com.balashevich.address.util.ErrorCode;
import com.lob.exception.APIException;
import com.lob.exception.AuthenticationException;
import com.lob.exception.InvalidRequestException;
import com.lob.exception.RateLimitException;
import com.lob.model.USAutocompletion;
import com.lob.model.USVerification;
import com.lob.net.LobResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class LobApi {

    private final LobMapper lobMapper;

    public LobUsVerification getUsVerification(LobUsVerificationRequest verificationRequest) {
        USVerification usVerification;

        try {
            LobResponse<USVerification> response = new USVerification.RequestBuilder()
                    .setPrimaryLine(verificationRequest.getPrimaryLine())
                    .setZipCode(verificationRequest.getZipCode())
                    .setCity(verificationRequest.getCity())
                    .setState(verificationRequest.getState())
                    .verify();
            usVerification = response.getResponseBody();
        } catch (APIException | IOException | AuthenticationException | InvalidRequestException | RateLimitException e) {
            log.error("Error when retrieving Us Verification data from lob");
            throw new LobException("Error when retrieving Us Verification data from lob",
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    ErrorCode.LOB_EXCEPTION);
        }

        return lobMapper.toLobUsVerification(usVerification.getComponents());
    }

    public LobUsAutocomplete getUsAutocomplete(LobUsAutocompleteRequest autocompleteRequest) {
        USAutocompletion usAutocompletion;

        try {
            LobResponse<USAutocompletion> response = new USAutocompletion.RequestBuilder()
                    .setAddressPrefix(autocompleteRequest.getAddressPrefix())
                    .setZipCode(autocompleteRequest.getZipCode())
                    .setCity(autocompleteRequest.getCity())
                    .setState(autocompleteRequest.getState())
                    .autocomplete();
            usAutocompletion = response.getResponseBody();
        } catch (APIException | RateLimitException | AuthenticationException | InvalidRequestException | IOException e) {
            log.error("Error when retrieving Us Autocomplete data from lob");
            e.printStackTrace();
            throw new LobException("Error when retrieving Us Autocomplete data from lob",
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    ErrorCode.LOB_EXCEPTION);
        }

        return lobMapper.toLobUsAutocomplete(usAutocompletion);
    }

}
