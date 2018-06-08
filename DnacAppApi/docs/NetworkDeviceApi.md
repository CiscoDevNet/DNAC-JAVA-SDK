# NetworkDeviceApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteNetworkDeviceById**](NetworkDeviceApi.md#deleteNetworkDeviceById) | **DELETE** /api/v1/network-device/${id} | Delete network device by ID
[**getNetworkDevice**](NetworkDeviceApi.md#getNetworkDevice) | **GET** /api/v1/network-device | Retrieves all network devices
[**getNetworkDeviceAutocomplete**](NetworkDeviceApi.md#getNetworkDeviceAutocomplete) | **GET** /api/v1/network-device/autocomplete | Retrieves all network devices
[**getNetworkDeviceBriefById**](NetworkDeviceApi.md#getNetworkDeviceBriefById) | **GET** /api/v1/network-device/${id}/brief | Retrieves network device brief by ID
[**getNetworkDeviceById**](NetworkDeviceApi.md#getNetworkDeviceById) | **GET** /api/v1/network-device/${id} | Retrieves network device by ID
[**getNetworkDeviceCollectionScheduleById**](NetworkDeviceApi.md#getNetworkDeviceCollectionScheduleById) | **GET** /api/v1/network-device/${id}/collection-schedule | Retrieves the collection interval specified by device ID
[**getNetworkDeviceCollectionScheduleGlobal**](NetworkDeviceApi.md#getNetworkDeviceCollectionScheduleGlobal) | **GET** /api/v1/network-device/collection-schedule/global | Retrieves the collection interval of all devices
[**getNetworkDeviceConfig**](NetworkDeviceApi.md#getNetworkDeviceConfig) | **GET** /api/v1/network-device/config | Retrieves device config list
[**getNetworkDeviceConfigByNetworkDeviceId**](NetworkDeviceApi.md#getNetworkDeviceConfigByNetworkDeviceId) | **GET** /api/v1/network-device/${networkDeviceId}/config | Retrieves device config
[**getNetworkDeviceConfigCount**](NetworkDeviceApi.md#getNetworkDeviceConfigCount) | **GET** /api/v1/network-device/config/count | Retrieves config count
[**getNetworkDeviceCount**](NetworkDeviceApi.md#getNetworkDeviceCount) | **GET** /api/v1/network-device/count | Retrieves network device count
[**getNetworkDeviceFunctionalCapability**](NetworkDeviceApi.md#getNetworkDeviceFunctionalCapability) | **GET** /api/v1/network-device/functional-capability | Retrieves all functional-capability of devices
[**getNetworkDeviceFunctionalCapabilityById**](NetworkDeviceApi.md#getNetworkDeviceFunctionalCapabilityById) | **GET** /api/v1/network-device/functional-capability/${id} | Gets the functional capability by id
[**getNetworkDeviceFunctionalCcapabilityAutocomplete**](NetworkDeviceApi.md#getNetworkDeviceFunctionalCcapabilityAutocomplete) | **GET** /api/v1/network-device/functional-capability/autocomplete | Retrieve the values of given fields
[**getNetworkDeviceIpAddressByIpAddress**](NetworkDeviceApi.md#getNetworkDeviceIpAddressByIpAddress) | **GET** /api/v1/network-device/ip-address/${ipAddress} | Retrieves network device by IP address
[**getNetworkDeviceMerakiOrganizationById**](NetworkDeviceApi.md#getNetworkDeviceMerakiOrganizationById) | **GET** /api/v1/network-device/${id}/meraki-organization | Get the organizations chosen while adding the meraki dashboard
[**getNetworkDeviceModule**](NetworkDeviceApi.md#getNetworkDeviceModule) | **GET** /api/v1/network-device/module | Gives all the modules associated with given device id
[**getNetworkDeviceModuleById**](NetworkDeviceApi.md#getNetworkDeviceModuleById) | **GET** /api/v1/network-device/module/${id} | Gives Module info by its id
[**getNetworkDeviceModuleCount**](NetworkDeviceApi.md#getNetworkDeviceModuleCount) | **GET** /api/v1/network-device/module/count | Gives total number of Modules
[**getNetworkDevicePollerCliLegitReads**](NetworkDeviceApi.md#getNetworkDevicePollerCliLegitReads) | **GET** /api/v1/network-device-poller/cli/legit-reads | Get all keywords of CLIs accepted by command runner
[**getNetworkDeviceRange**](NetworkDeviceApi.md#getNetworkDeviceRange) | **GET** /api/v1/network-device/${startIndex}/${recordsToReturn} | Retrieves network device by range
[**getNetworkDeviceSerialNumberBySerialNumber**](NetworkDeviceApi.md#getNetworkDeviceSerialNumberBySerialNumber) | **GET** /api/v1/network-device/serial-number/${serialNumber} | Retrieves network device by serial number
[**getNetworkDeviceTenantinfoMacaddress**](NetworkDeviceApi.md#getNetworkDeviceTenantinfoMacaddress) | **GET** /api/v1/network-device/tenantinfo/macaddress | Updates certificate validation status and returns tenantId
[**getNetworkDeviceVlanById**](NetworkDeviceApi.md#getNetworkDeviceVlanById) | **GET** /api/v1/network-device/${id}/vlan | Retrieves list of VLAN data that are associated with interface for a device
[**getNetworkDeviceWirelessInfoById**](NetworkDeviceApi.md#getNetworkDeviceWirelessInfoById) | **GET** /api/v1/network-device/${id}/wireless-info | Retrieves wireless lan conrtoller info by Device ID
[**postNetworkDevice**](NetworkDeviceApi.md#postNetworkDevice) | **POST** /api/v1/network-device | Network device POST api
[**postNetworkDeviceFile**](NetworkDeviceApi.md#postNetworkDeviceFile) | **POST** /api/v1/network-device/file | Export network-device to file
[**postNetworkDevicePollerCliReadRequest**](NetworkDeviceApi.md#postNetworkDevicePollerCliReadRequest) | **POST** /api/v1/network-device-poller/cli/read-request | Run read-only commands on devices to get their real-time configuration
[**putNetworkDevice**](NetworkDeviceApi.md#putNetworkDevice) | **PUT** /api/v1/network-device | Network device sync api
[**putNetworkDeviceBrief**](NetworkDeviceApi.md#putNetworkDeviceBrief) | **PUT** /api/v1/network-device/brief | Updates network device role
[**putNetworkDeviceSync**](NetworkDeviceApi.md#putNetworkDeviceSync) | **PUT** /api/v1/network-device/sync | Network device sync api


<a name="deleteNetworkDeviceById"></a>
# **deleteNetworkDeviceById**
> TaskIdResult deleteNetworkDeviceById(id, isForceDelete)

Delete network device by ID

Removes the network device for the given ID

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String id = "id_example"; // String | Device ID
Boolean isForceDelete = true; // Boolean | isForceDelete
try {
    TaskIdResult result = apiInstance.deleteNetworkDeviceById(id, isForceDelete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#deleteNetworkDeviceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Device ID |
 **isForceDelete** | **Boolean**| isForceDelete | [optional]

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDevice"></a>
# **getNetworkDevice**
> NetworkDeviceListResult getNetworkDevice(hostname, managementIpAddress, macAddress, locationName, serialNumber, location, family, type, series, collectionStatus, collectionInterval, notSyncedForMinutes, errorCode, errorDescription, softwareVersion, softwareType, platformId, role, reachabilityStatus, upTime, associatedWlcIp, licenseName, licenseType, licenseStatus, modulename, moduleequpimenttype, moduleservicestate, modulevendorequipmenttype, modulepartnumber, moduleoperationstatecode, id)

Retrieves all network devices

Gets the list of first 500 network devices sorted lexicographically based on host name. It can be filtered using management IP address, mac address, hostname and location name. If id param is provided, it will be returning the list of network-devices for the given id&#39;s and other request params will be ignored. In case of autocomplete request, returns the list of specified attributes.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
List<String> hostname = Arrays.asList("hostname_example"); // List<String> | hostname
List<String> managementIpAddress = Arrays.asList("managementIpAddress_example"); // List<String> | managementIpAddress
List<String> macAddress = Arrays.asList("macAddress_example"); // List<String> | macAddress
List<String> locationName = Arrays.asList("locationName_example"); // List<String> | locationName
List<String> serialNumber = Arrays.asList("serialNumber_example"); // List<String> | serialNumber
List<String> location = Arrays.asList("location_example"); // List<String> | location
List<String> family = Arrays.asList("family_example"); // List<String> | family
List<String> type = Arrays.asList("type_example"); // List<String> | type
List<String> series = Arrays.asList("series_example"); // List<String> | series
List<String> collectionStatus = Arrays.asList("collectionStatus_example"); // List<String> | collectionStatus
List<String> collectionInterval = Arrays.asList("collectionInterval_example"); // List<String> | collectionInterval
List<String> notSyncedForMinutes = Arrays.asList("notSyncedForMinutes_example"); // List<String> | notSyncedForMinutes
List<String> errorCode = Arrays.asList("errorCode_example"); // List<String> | errorCode
List<String> errorDescription = Arrays.asList("errorDescription_example"); // List<String> | errorDescription
List<String> softwareVersion = Arrays.asList("softwareVersion_example"); // List<String> | softwareVersion
List<String> softwareType = Arrays.asList("softwareType_example"); // List<String> | softwareType
List<String> platformId = Arrays.asList("platformId_example"); // List<String> | platformId
List<String> role = Arrays.asList("role_example"); // List<String> | role
List<String> reachabilityStatus = Arrays.asList("reachabilityStatus_example"); // List<String> | reachabilityStatus
List<String> upTime = Arrays.asList("upTime_example"); // List<String> | upTime
List<String> associatedWlcIp = Arrays.asList("associatedWlcIp_example"); // List<String> | associatedWlcIp
List<String> licenseName = Arrays.asList("licenseName_example"); // List<String> | licenseName
List<String> licenseType = Arrays.asList("licenseType_example"); // List<String> | licenseType
List<String> licenseStatus = Arrays.asList("licenseStatus_example"); // List<String> | licenseStatus
List<String> modulename = Arrays.asList("modulename_example"); // List<String> | moduleName
List<String> moduleequpimenttype = Arrays.asList("moduleequpimenttype_example"); // List<String> | moduleEqupimentType
List<String> moduleservicestate = Arrays.asList("moduleservicestate_example"); // List<String> | moduleServiceState
List<String> modulevendorequipmenttype = Arrays.asList("modulevendorequipmenttype_example"); // List<String> | moduleVendorEquipmentType
List<String> modulepartnumber = Arrays.asList("modulepartnumber_example"); // List<String> | modulePartNumber
List<String> moduleoperationstatecode = Arrays.asList("moduleoperationstatecode_example"); // List<String> | moduleOperationStateCode
String id = "id_example"; // String | Accepts comma separated id's and return list of network-devices for the given id's. If invalid or not-found id's are provided, null entry will be returned in the list.
try {
    NetworkDeviceListResult result = apiInstance.getNetworkDevice(hostname, managementIpAddress, macAddress, locationName, serialNumber, location, family, type, series, collectionStatus, collectionInterval, notSyncedForMinutes, errorCode, errorDescription, softwareVersion, softwareType, platformId, role, reachabilityStatus, upTime, associatedWlcIp, licenseName, licenseType, licenseStatus, modulename, moduleequpimenttype, moduleservicestate, modulevendorequipmenttype, modulepartnumber, moduleoperationstatecode, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostname** | [**List&lt;String&gt;**](String.md)| hostname | [optional]
 **managementIpAddress** | [**List&lt;String&gt;**](String.md)| managementIpAddress | [optional]
 **macAddress** | [**List&lt;String&gt;**](String.md)| macAddress | [optional]
 **locationName** | [**List&lt;String&gt;**](String.md)| locationName | [optional]
 **serialNumber** | [**List&lt;String&gt;**](String.md)| serialNumber | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| location | [optional]
 **family** | [**List&lt;String&gt;**](String.md)| family | [optional]
 **type** | [**List&lt;String&gt;**](String.md)| type | [optional]
 **series** | [**List&lt;String&gt;**](String.md)| series | [optional]
 **collectionStatus** | [**List&lt;String&gt;**](String.md)| collectionStatus | [optional]
 **collectionInterval** | [**List&lt;String&gt;**](String.md)| collectionInterval | [optional]
 **notSyncedForMinutes** | [**List&lt;String&gt;**](String.md)| notSyncedForMinutes | [optional]
 **errorCode** | [**List&lt;String&gt;**](String.md)| errorCode | [optional]
 **errorDescription** | [**List&lt;String&gt;**](String.md)| errorDescription | [optional]
 **softwareVersion** | [**List&lt;String&gt;**](String.md)| softwareVersion | [optional]
 **softwareType** | [**List&lt;String&gt;**](String.md)| softwareType | [optional]
 **platformId** | [**List&lt;String&gt;**](String.md)| platformId | [optional]
 **role** | [**List&lt;String&gt;**](String.md)| role | [optional]
 **reachabilityStatus** | [**List&lt;String&gt;**](String.md)| reachabilityStatus | [optional]
 **upTime** | [**List&lt;String&gt;**](String.md)| upTime | [optional]
 **associatedWlcIp** | [**List&lt;String&gt;**](String.md)| associatedWlcIp | [optional]
 **licenseName** | [**List&lt;String&gt;**](String.md)| licenseName | [optional]
 **licenseType** | [**List&lt;String&gt;**](String.md)| licenseType | [optional]
 **licenseStatus** | [**List&lt;String&gt;**](String.md)| licenseStatus | [optional]
 **modulename** | [**List&lt;String&gt;**](String.md)| moduleName | [optional]
 **moduleequpimenttype** | [**List&lt;String&gt;**](String.md)| moduleEqupimentType | [optional]
 **moduleservicestate** | [**List&lt;String&gt;**](String.md)| moduleServiceState | [optional]
 **modulevendorequipmenttype** | [**List&lt;String&gt;**](String.md)| moduleVendorEquipmentType | [optional]
 **modulepartnumber** | [**List&lt;String&gt;**](String.md)| modulePartNumber | [optional]
 **moduleoperationstatecode** | [**List&lt;String&gt;**](String.md)| moduleOperationStateCode | [optional]
 **id** | **String**| Accepts comma separated id&#39;s and return list of network-devices for the given id&#39;s. If invalid or not-found id&#39;s are provided, null entry will be returned in the list. | [optional]

### Return type

[**NetworkDeviceListResult**](NetworkDeviceListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceAutocomplete"></a>
# **getNetworkDeviceAutocomplete**
> RetrievesAllNetworkDevicesResponse getNetworkDeviceAutocomplete(vrfName, managementIpAddress, hostname, macAddress, family, collectionStatus, collectionInterval, softwareVersion, softwareType, reachabilityStatus, reachabilityFailureReason, errorCode, platformId, series, type, serialNumber, upTime, role, roleSource, associatedWlcIp, offset, limit)

Retrieves all network devices

Gets the list of first 500 network devices sorted lexicographically based on host name. It can be filtered using management IP address, mac address, hostname and location name. If id param is provided, it will be returning the list of network-devices for the given id&#39;s and other request params will be ignored. In case of autocomplete request, returns the list of specified attributes.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String vrfName = "vrfName_example"; // String | vrfName
String managementIpAddress = "managementIpAddress_example"; // String | managementIpAddress
String hostname = "hostname_example"; // String | hostname
String macAddress = "macAddress_example"; // String | macAddress
String family = "family_example"; // String | family
String collectionStatus = "collectionStatus_example"; // String | collectionStatus
String collectionInterval = "collectionInterval_example"; // String | collectionInterval
String softwareVersion = "softwareVersion_example"; // String | softwareVersion
String softwareType = "softwareType_example"; // String | softwareType
String reachabilityStatus = "reachabilityStatus_example"; // String | reachabilityStatus
String reachabilityFailureReason = "reachabilityFailureReason_example"; // String | reachabilityFailureReason
String errorCode = "errorCode_example"; // String | errorCode
String platformId = "platformId_example"; // String | platformId
String series = "series_example"; // String | series
String type = "type_example"; // String | type
String serialNumber = "serialNumber_example"; // String | serialNumber
String upTime = "upTime_example"; // String | upTime
String role = "role_example"; // String | role
String roleSource = "roleSource_example"; // String | roleSource
String associatedWlcIp = "associatedWlcIp_example"; // String | associatedWlcIp
String offset = "offset_example"; // String | offset
String limit = "limit_example"; // String | limit
try {
    RetrievesAllNetworkDevicesResponse result = apiInstance.getNetworkDeviceAutocomplete(vrfName, managementIpAddress, hostname, macAddress, family, collectionStatus, collectionInterval, softwareVersion, softwareType, reachabilityStatus, reachabilityFailureReason, errorCode, platformId, series, type, serialNumber, upTime, role, roleSource, associatedWlcIp, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceAutocomplete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vrfName** | **String**| vrfName | [optional]
 **managementIpAddress** | **String**| managementIpAddress | [optional]
 **hostname** | **String**| hostname | [optional]
 **macAddress** | **String**| macAddress | [optional]
 **family** | **String**| family | [optional]
 **collectionStatus** | **String**| collectionStatus | [optional]
 **collectionInterval** | **String**| collectionInterval | [optional]
 **softwareVersion** | **String**| softwareVersion | [optional]
 **softwareType** | **String**| softwareType | [optional]
 **reachabilityStatus** | **String**| reachabilityStatus | [optional]
 **reachabilityFailureReason** | **String**| reachabilityFailureReason | [optional]
 **errorCode** | **String**| errorCode | [optional]
 **platformId** | **String**| platformId | [optional]
 **series** | **String**| series | [optional]
 **type** | **String**| type | [optional]
 **serialNumber** | **String**| serialNumber | [optional]
 **upTime** | **String**| upTime | [optional]
 **role** | **String**| role | [optional]
 **roleSource** | **String**| roleSource | [optional]
 **associatedWlcIp** | **String**| associatedWlcIp | [optional]
 **offset** | **String**| offset | [optional]
 **limit** | **String**| limit | [optional]

### Return type

[**RetrievesAllNetworkDevicesResponse**](RetrievesAllNetworkDevicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceBriefById"></a>
# **getNetworkDeviceBriefById**
> NetworkDeviceBriefNIOResult getNetworkDeviceBriefById(id)

Retrieves network device brief by ID

Gets brief network device info such as hostname, management IP address for the given device ID

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String id = "id_example"; // String | Device ID
try {
    NetworkDeviceBriefNIOResult result = apiInstance.getNetworkDeviceBriefById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceBriefById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Device ID |

### Return type

[**NetworkDeviceBriefNIOResult**](NetworkDeviceBriefNIOResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceById"></a>
# **getNetworkDeviceById**
> NetworkDeviceResult getNetworkDeviceById(id)

Retrieves network device by ID

Gets the network device for the given device ID

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String id = "id_example"; // String | Device ID
try {
    NetworkDeviceResult result = apiInstance.getNetworkDeviceById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Device ID |

### Return type

[**NetworkDeviceResult**](NetworkDeviceResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceCollectionScheduleById"></a>
# **getNetworkDeviceCollectionScheduleById**
> CountResult getNetworkDeviceCollectionScheduleById(id)

Retrieves the collection interval specified by device ID

Retrieves collection interval by device id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String id = "id_example"; // String | Device ID
try {
    CountResult result = apiInstance.getNetworkDeviceCollectionScheduleById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceCollectionScheduleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Device ID |

### Return type

[**CountResult**](CountResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceCollectionScheduleGlobal"></a>
# **getNetworkDeviceCollectionScheduleGlobal**
> CountResult getNetworkDeviceCollectionScheduleGlobal()

Retrieves the collection interval of all devices

Retrieves collection interval of all devices

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
try {
    CountResult result = apiInstance.getNetworkDeviceCollectionScheduleGlobal();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceCollectionScheduleGlobal");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountResult**](CountResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceConfig"></a>
# **getNetworkDeviceConfig**
> RawCliInfoNIOListResult getNetworkDeviceConfig()

Retrieves device config list

Gets the config for all devices

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
try {
    RawCliInfoNIOListResult result = apiInstance.getNetworkDeviceConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RawCliInfoNIOListResult**](RawCliInfoNIOListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceConfigByNetworkDeviceId"></a>
# **getNetworkDeviceConfigByNetworkDeviceId**
> SuccessResult getNetworkDeviceConfigByNetworkDeviceId(networkDeviceId)

Retrieves device config

Gets the device config by device ID

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String networkDeviceId = "networkDeviceId_example"; // String | networkDeviceId
try {
    SuccessResult result = apiInstance.getNetworkDeviceConfigByNetworkDeviceId(networkDeviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceConfigByNetworkDeviceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkDeviceId** | **String**| networkDeviceId |

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceConfigCount"></a>
# **getNetworkDeviceConfigCount**
> CountResult getNetworkDeviceConfigCount()

Retrieves config count

Gets the count of device configs

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
try {
    CountResult result = apiInstance.getNetworkDeviceConfigCount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceConfigCount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountResult**](CountResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceCount"></a>
# **getNetworkDeviceCount**
> CountResult getNetworkDeviceCount()

Retrieves network device count

Gets the count of network devices filtered by management IP address, mac address, hostname and location name

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
try {
    CountResult result = apiInstance.getNetworkDeviceCount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceCount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountResult**](CountResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceFunctionalCapability"></a>
# **getNetworkDeviceFunctionalCapability**
> FunctionalCapabilityListResult getNetworkDeviceFunctionalCapability(deviceId, functionName)

Retrieves all functional-capability of devices

Gets the functional-capability for given devices

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String deviceId = "deviceId_example"; // String | Accepts comma separated deviceid's and return list of functional-capabilities for the given id's. If invalid or not-found id's are provided, null entry will be returned in the list.
List<String> functionName = Arrays.asList("functionName_example"); // List<String> | functionName
try {
    FunctionalCapabilityListResult result = apiInstance.getNetworkDeviceFunctionalCapability(deviceId, functionName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceFunctionalCapability");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Accepts comma separated deviceid&#39;s and return list of functional-capabilities for the given id&#39;s. If invalid or not-found id&#39;s are provided, null entry will be returned in the list. | [optional]
 **functionName** | [**List&lt;String&gt;**](String.md)| functionName | [optional]

### Return type

[**FunctionalCapabilityListResult**](FunctionalCapabilityListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceFunctionalCapabilityById"></a>
# **getNetworkDeviceFunctionalCapabilityById**
> FunctionalCapabilityResult getNetworkDeviceFunctionalCapabilityById(id)

Gets the functional capability by id

Retrieve functional capability with given id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String id = "id_example"; // String | Device ID
try {
    FunctionalCapabilityResult result = apiInstance.getNetworkDeviceFunctionalCapabilityById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceFunctionalCapabilityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Device ID |

### Return type

[**FunctionalCapabilityResult**](FunctionalCapabilityResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceFunctionalCcapabilityAutocomplete"></a>
# **getNetworkDeviceFunctionalCcapabilityAutocomplete**
> SuccessResultList getNetworkDeviceFunctionalCcapabilityAutocomplete(functionName)

Retrieve the values of given fields

Gets the field values based on given filter

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
List<String> functionName = Arrays.asList("functionName_example"); // List<String> | functionName
try {
    SuccessResultList result = apiInstance.getNetworkDeviceFunctionalCcapabilityAutocomplete(functionName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceFunctionalCcapabilityAutocomplete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **functionName** | [**List&lt;String&gt;**](String.md)| functionName | [optional]

### Return type

[**SuccessResultList**](SuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceIpAddressByIpAddress"></a>
# **getNetworkDeviceIpAddressByIpAddress**
> NetworkDeviceResult getNetworkDeviceIpAddressByIpAddress(ipAddress)

Retrieves network device by IP address

Gets the network device with the given IP address

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String ipAddress = "ipAddress_example"; // String | Device IP address
try {
    NetworkDeviceResult result = apiInstance.getNetworkDeviceIpAddressByIpAddress(ipAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceIpAddressByIpAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | **String**| Device IP address |

### Return type

[**NetworkDeviceResult**](NetworkDeviceResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceMerakiOrganizationById"></a>
# **getNetworkDeviceMerakiOrganizationById**
> SuccessResultList getNetworkDeviceMerakiOrganizationById(id)

Get the organizations chosen while adding the meraki dashboard

This method is used to get the selected organizations for the meraki dashboard

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String id = "id_example"; // String | id
try {
    SuccessResultList result = apiInstance.getNetworkDeviceMerakiOrganizationById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceMerakiOrganizationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**SuccessResultList**](SuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceModule"></a>
# **getNetworkDeviceModule**
> ModuleListResult getNetworkDeviceModule(deviceId, limit, offset, nameList, vendorEquipmentTypeList, partNumberList, operationalStateCodeList)

Gives all the modules associated with given device id

Get modules of the given device id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String deviceId = "deviceId_example"; // String | deviceId
String limit = "limit_example"; // String | limit
String offset = "offset_example"; // String | offset
List<String> nameList = Arrays.asList("nameList_example"); // List<String> | nameList
List<String> vendorEquipmentTypeList = Arrays.asList("vendorEquipmentTypeList_example"); // List<String> | vendorEquipmentTypeList
List<String> partNumberList = Arrays.asList("partNumberList_example"); // List<String> | partNumberList
List<String> operationalStateCodeList = Arrays.asList("operationalStateCodeList_example"); // List<String> | operationalStateCodeList
try {
    ModuleListResult result = apiInstance.getNetworkDeviceModule(deviceId, limit, offset, nameList, vendorEquipmentTypeList, partNumberList, operationalStateCodeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |
 **limit** | **String**| limit | [optional]
 **offset** | **String**| offset | [optional]
 **nameList** | [**List&lt;String&gt;**](String.md)| nameList | [optional]
 **vendorEquipmentTypeList** | [**List&lt;String&gt;**](String.md)| vendorEquipmentTypeList | [optional]
 **partNumberList** | [**List&lt;String&gt;**](String.md)| partNumberList | [optional]
 **operationalStateCodeList** | [**List&lt;String&gt;**](String.md)| operationalStateCodeList | [optional]

### Return type

[**ModuleListResult**](ModuleListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceModuleById"></a>
# **getNetworkDeviceModuleById**
> ModuleResult getNetworkDeviceModuleById(id)

Gives Module info by its id

Get module by id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String id = "id_example"; // String | id
try {
    ModuleResult result = apiInstance.getNetworkDeviceModuleById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceModuleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**ModuleResult**](ModuleResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceModuleCount"></a>
# **getNetworkDeviceModuleCount**
> CountResult getNetworkDeviceModuleCount(deviceId, nameList, vendorEquipmentTypeList, partNumberList, operationalStateCodeList)

Gives total number of Modules

Get Module Count

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String deviceId = "deviceId_example"; // String | deviceId
List<String> nameList = Arrays.asList("nameList_example"); // List<String> | nameList
List<String> vendorEquipmentTypeList = Arrays.asList("vendorEquipmentTypeList_example"); // List<String> | vendorEquipmentTypeList
List<String> partNumberList = Arrays.asList("partNumberList_example"); // List<String> | partNumberList
List<String> operationalStateCodeList = Arrays.asList("operationalStateCodeList_example"); // List<String> | operationalStateCodeList
try {
    CountResult result = apiInstance.getNetworkDeviceModuleCount(deviceId, nameList, vendorEquipmentTypeList, partNumberList, operationalStateCodeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceModuleCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |
 **nameList** | [**List&lt;String&gt;**](String.md)| nameList | [optional]
 **vendorEquipmentTypeList** | [**List&lt;String&gt;**](String.md)| vendorEquipmentTypeList | [optional]
 **partNumberList** | [**List&lt;String&gt;**](String.md)| partNumberList | [optional]
 **operationalStateCodeList** | [**List&lt;String&gt;**](String.md)| operationalStateCodeList | [optional]

### Return type

[**CountResult**](CountResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDevicePollerCliLegitReads"></a>
# **getNetworkDevicePollerCliLegitReads**
> LegitCliKeyResult getNetworkDevicePollerCliLegitReads()

Get all keywords of CLIs accepted by command runner

Get valid keywords

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
try {
    LegitCliKeyResult result = apiInstance.getNetworkDevicePollerCliLegitReads();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDevicePollerCliLegitReads");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LegitCliKeyResult**](LegitCliKeyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceRange"></a>
# **getNetworkDeviceRange**
> NetworkDeviceListResult getNetworkDeviceRange(startIndex, recordsToReturn)

Retrieves network device by range

Gets the list of network devices for the given range

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
Integer startIndex = 56; // Integer | Start index
Integer recordsToReturn = 56; // Integer | Number of records to return
try {
    NetworkDeviceListResult result = apiInstance.getNetworkDeviceRange(startIndex, recordsToReturn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startIndex** | **Integer**| Start index |
 **recordsToReturn** | **Integer**| Number of records to return |

### Return type

[**NetworkDeviceListResult**](NetworkDeviceListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceSerialNumberBySerialNumber"></a>
# **getNetworkDeviceSerialNumberBySerialNumber**
> NetworkDeviceResult getNetworkDeviceSerialNumberBySerialNumber(serialNumber)

Retrieves network device by serial number

Gets the network device with the given serial number

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String serialNumber = "serialNumber_example"; // String | Device serial number
try {
    NetworkDeviceResult result = apiInstance.getNetworkDeviceSerialNumberBySerialNumber(serialNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceSerialNumberBySerialNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | **String**| Device serial number |

### Return type

[**NetworkDeviceResult**](NetworkDeviceResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceTenantinfoMacaddress"></a>
# **getNetworkDeviceTenantinfoMacaddress**
> RegisterNetworkDeviceResult getNetworkDeviceTenantinfoMacaddress(serialNumber, macaddress)

Updates certificate validation status and returns tenantId

Registers a device for WSA notification

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String serialNumber = "serialNumber_example"; // String | Serial number of the device
String macaddress = "macaddress_example"; // String | Mac addres of the device
try {
    RegisterNetworkDeviceResult result = apiInstance.getNetworkDeviceTenantinfoMacaddress(serialNumber, macaddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceTenantinfoMacaddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | **String**| Serial number of the device | [optional]
 **macaddress** | **String**| Mac addres of the device | [optional]

### Return type

[**RegisterNetworkDeviceResult**](RegisterNetworkDeviceResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceVlanById"></a>
# **getNetworkDeviceVlanById**
> VlanListResult getNetworkDeviceVlanById(id, interfaceType)

Retrieves list of VLAN data that are associated with interface for a device

getDeviceVLANData

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String id = "id_example"; // String | deviceUUID
String interfaceType = "interfaceType_example"; // String | Vlan assocaited with sub-interface
try {
    VlanListResult result = apiInstance.getNetworkDeviceVlanById(id, interfaceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceVlanById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| deviceUUID |
 **interfaceType** | **String**| Vlan assocaited with sub-interface | [optional]

### Return type

[**VlanListResult**](VlanListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceWirelessInfoById"></a>
# **getNetworkDeviceWirelessInfoById**
> WirelessInfoResult getNetworkDeviceWirelessInfoById(id)

Retrieves wireless lan conrtoller info by Device ID

Gets the wireless lan controller info using the given device ID

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
String id = "id_example"; // String | Device ID
try {
    WirelessInfoResult result = apiInstance.getNetworkDeviceWirelessInfoById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#getNetworkDeviceWirelessInfoById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Device ID |

### Return type

[**WirelessInfoResult**](WirelessInfoResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postNetworkDevice"></a>
# **postNetworkDevice**
> TaskIdResult postNetworkDevice(request)

Network device POST api

Adds the device with given credential

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
InventoryDeviceInfo request = new InventoryDeviceInfo(); // InventoryDeviceInfo | request
try {
    TaskIdResult result = apiInstance.postNetworkDevice(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#postNetworkDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**InventoryDeviceInfo**](InventoryDeviceInfo.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postNetworkDeviceFile"></a>
# **postNetworkDeviceFile**
> TaskIdResult postNetworkDeviceFile(request)

Export network-device to file

Export the selected network-device to a file

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
ExportDeviceDTO request = new ExportDeviceDTO(); // ExportDeviceDTO | request
try {
    TaskIdResult result = apiInstance.postNetworkDeviceFile(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#postNetworkDeviceFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ExportDeviceDTO**](ExportDeviceDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postNetworkDevicePollerCliReadRequest"></a>
# **postNetworkDevicePollerCliReadRequest**
> TaskIdResult postNetworkDevicePollerCliReadRequest(request)

Run read-only commands on devices to get their real-time configuration

Submit request for read-only CLIs

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
CommandRunnerDTO request = new CommandRunnerDTO(); // CommandRunnerDTO | request
try {
    TaskIdResult result = apiInstance.postNetworkDevicePollerCliReadRequest(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#postNetworkDevicePollerCliReadRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CommandRunnerDTO**](CommandRunnerDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putNetworkDevice"></a>
# **putNetworkDevice**
> TaskIdResult putNetworkDevice(request)

Network device sync api

Sync the devices provided as input

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
InventoryDeviceInfo request = new InventoryDeviceInfo(); // InventoryDeviceInfo | request
try {
    TaskIdResult result = apiInstance.putNetworkDevice(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#putNetworkDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**InventoryDeviceInfo**](InventoryDeviceInfo.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putNetworkDeviceBrief"></a>
# **putNetworkDeviceBrief**
> TaskIdResult putNetworkDeviceBrief(request)

Updates network device role

Updates the role of the device as access, core, distribution, border router

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
NetworkDeviceBriefNIO request = new NetworkDeviceBriefNIO(); // NetworkDeviceBriefNIO | request
try {
    TaskIdResult result = apiInstance.putNetworkDeviceBrief(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#putNetworkDeviceBrief");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**NetworkDeviceBriefNIO**](NetworkDeviceBriefNIO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putNetworkDeviceSync"></a>
# **putNetworkDeviceSync**
> TaskIdResult putNetworkDeviceSync(request, forceSync)

Network device sync api

Sync&#39;s the devices. If forceSync param is false (default) then the sync would run in normal priority thread. If forceSync param is true then the sync would run in high priority thread if avaiable, else the sync will fail. Result can be seen in the child task of each device

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;


NetworkDeviceApi apiInstance = new NetworkDeviceApi();
NetworkDeviceSyncApiRequest request = new NetworkDeviceSyncApiRequest(); // NetworkDeviceSyncApiRequest | request
Boolean forceSync = true; // Boolean | forceSync
try {
    TaskIdResult result = apiInstance.putNetworkDeviceSync(request, forceSync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDeviceApi#putNetworkDeviceSync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**NetworkDeviceSyncApiRequest**](NetworkDeviceSyncApiRequest.md)| request |
 **forceSync** | **Boolean**| forceSync | [optional]

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

