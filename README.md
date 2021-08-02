## Address Test
### Lob.com
* **Longtitude/Latitude**

endpoint: ``` GET http://localhost:8070/api/v1/lobs/us_verifications ```
request example:
```
{
    "zip_code": "",
    "primary_line": "185 Berry Street",
    "city": "San Francisco",
    "state": "SA"
}
```
response example:
```
{
    "primaryNumber": "",
    "streetPredirection": "",
    "streetName": "",
    "streetSuffix": "",
    "streetPostdirection": "",
    "secondaryDesignator": "",
    "secondaryNumber": "",
    "pmbDesignator": "",
    "pmbNumber": "",
    "extraSecondaryDesignator": "",
    "extraSecondaryNumber": "",
    "city": "",
    "state": "",
    "zipCode": "",
    "zipCodePlus4": "",
    "zipCodeType": "",
    "deliveryPointBarcode": "",
    "addressType": "",
    "recordType": "",
    "defaultBuildingAddress": "false",
    "county": "",
    "countyFips": "",
    "carrierRoute": "",
    "carrierRouteType": ""
}
```

* **Autocomplete**

endpoint: ``` GET http://localhost:8070/api/v1/lobs/us_autocompletions ```
request example:
```
{
    "address_prefix": "1 sugg",
    "zip_code": "",
    "city": "",
    "state": ""
}
```
response example:
```
{
    "id": "us_auto_1630ccf3032b40c59773",
    "usVerificationRequests": [
        {
            "primary_line": "1 TELEPHONE RD",
            "zip_code": "72565",
            "city": "OXFORD",
            "state": "AR"
        },
        {
            "primary_line": "1 TELEGRAPH HILL RD S",
            "zip_code": "07733",
            "city": "HOLMDEL",
            "state": "NJ"
        },
        {
            "primary_line": "1 TELEGRAPH HILL BLVD",
            "zip_code": "94133",
            "city": "SAN FRANCISCO",
            "state": "CA"
        }
    ]
}
