package com.balashevich.address.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LobUsVerificationDto {

    private String primaryNumber;

    private String streetPredirection;

    private String streetName;

    private String streetSuffix;

    private String streetPostdirection;

    private String secondaryDesignator;

    private String secondaryNumber;

    private String pmbDesignator;

    private String pmbNumber;

    private String extraSecondaryDesignator;

    private String extraSecondaryNumber;

    private String city;

    private String state;

    private String zipCode;

    private String zipCodePlus4;

    private String zipCodeType;

    private String deliveryPointBarcode;

    private String addressType;

    private String recordType;

    private String defaultBuildingAddress;

    private String county;

    private String countyFips;

    private String carrierRoute;

    private String carrierRouteType;

    private String latitude;

    private String longitude;
}
