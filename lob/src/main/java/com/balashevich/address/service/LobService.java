package com.balashevich.address.service;

import com.balashevich.address.dto.LobUsAutocompleteDto;
import com.balashevich.address.dto.LobUsAutocompleteRequest;
import com.balashevich.address.dto.LobUsVerificationDto;
import com.balashevich.address.dto.LobUsVerificationRequest;
import com.balashevich.address.mapper.LobMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LobService {

    private final LobApi lobApi;

    private final LobMapper lobMapper;

    public LobUsVerificationDto retrieveUsVerification(LobUsVerificationRequest verificationRequest) {
        return lobMapper.toLobUsVerificationDto(lobApi.getUsVerification(verificationRequest));
    }

    public LobUsAutocompleteDto retrieveUsAutocomplete(LobUsAutocompleteRequest autocompleteRequest) {
        return lobMapper.toLobUsAutocompleteDto(lobApi.getUsAutocomplete(autocompleteRequest));
    }

}
