package com.balashevich.address.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LobUsVerification {

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
