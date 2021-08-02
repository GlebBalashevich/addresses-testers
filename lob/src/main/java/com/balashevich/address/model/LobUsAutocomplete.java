package com.balashevich.address.model;

import java.util.List;

import com.balashevich.address.dto.LobUsVerificationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LobUsAutocomplete {

    private String id;

    private List<LobUsVerificationRequest> usVerificationRequests;
}
