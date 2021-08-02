package com.balashevich.address.controller;

import com.balashevich.address.dto.LobUsAutocompleteDto;
import com.balashevich.address.dto.LobUsAutocompleteRequest;
import com.balashevich.address.dto.LobUsVerificationDto;
import com.balashevich.address.dto.LobUsVerificationRequest;
import com.balashevich.address.service.LobService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/lobs", produces = MediaType.APPLICATION_JSON_VALUE)
public class LobController {

    private final LobService lobService;

    @GetMapping("/us_verifications")
    public LobUsVerificationDto retrieveUsVerification(
            @RequestBody LobUsVerificationRequest verificationRequest) {
        return lobService.retrieveUsVerification(verificationRequest);
    }

    @GetMapping("/us_autocompletions")
    public LobUsAutocompleteDto retrieveUsAutocomplete(
            @RequestBody LobUsAutocompleteRequest autocompleteRequest) {
        return lobService.retrieveUsAutocomplete(autocompleteRequest);
    }
}
