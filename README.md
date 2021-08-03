## Address Test
### Lob.com
* **Longtitude/Latitude**

endpoint: ``` GET http://localhost:8070/api/v1/lobs/us_verifications ```
request example:
```
{
    "zip_code": "07039",
    "primary_line": "Walnut St 191 ",
    "city": "",
    "state": ""
}
```
response example:
```
{
    "primaryNumber": "191",
    "streetPredirection": "",
    "streetName": "WALNUT",
    "streetSuffix": "ST",
    "streetPostdirection": "",
    "secondaryDesignator": "",
    "secondaryNumber": "",
    "pmbDesignator": "",
    "pmbNumber": "",
    "extraSecondaryDesignator": "",
    "extraSecondaryNumber": "",
    "city": "LIVINGSTON",
    "state": "NJ",
    "zipCode": "07039",
    "zipCodePlus4": "5005",
    "zipCodeType": "standard",
    "deliveryPointBarcode": "070395005911",
    "addressType": "residential",
    "recordType": "street",
    "defaultBuildingAddress": "false",
    "county": "ESSEX",
    "countyFips": "34013",
    "carrierRoute": "C038",
    "carrierRouteType": "city_delivery",
    "latitude": "40.785327",
    "longitude": "-74.349098"
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
