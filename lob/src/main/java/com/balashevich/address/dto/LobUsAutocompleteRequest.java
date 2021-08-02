package com.balashevich.address.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LobUsAutocompleteRequest {

    @JsonProperty(value = "address_prefix")
    private String addressPrefix;

    @JsonProperty(value = "zip_code")
    private String zipCode;

    @JsonProperty(value = "city")
    private String city;

    @JsonProperty(value = "state")
    private String state;
}
