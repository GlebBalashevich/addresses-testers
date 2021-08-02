package com.balashevich.address.mapper;

import com.balashevich.address.dto.LobUsAutocompleteDto;
import com.balashevich.address.dto.LobUsVerificationDto;
import com.balashevich.address.dto.LobUsVerificationRequest;
import com.balashevich.address.model.LobUsAutocomplete;
import com.balashevich.address.model.LobUsVerification;
import com.lob.model.USAutocompletion;
import com.lob.model.USVerification;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LobMapper {

    LobUsVerification toLobUsVerification(USVerification.Components components);

    LobUsVerificationDto toLobUsVerificationDto(LobUsVerification usVerification);

    @Mapping(target = "usVerificationRequests", source = "suggestions")
    LobUsAutocomplete toLobUsAutocomplete(USAutocompletion usAutocompletion);

    LobUsAutocompleteDto toLobUsAutocompleteDto(LobUsAutocomplete usAutocomplete);

    LobUsVerificationRequest toLobUsVerification (USAutocompletion.Suggestion suggestion);

}
