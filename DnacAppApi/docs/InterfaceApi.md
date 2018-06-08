# InterfaceApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInterface**](InterfaceApi.md#getInterface) | **GET** /api/v1/interface | Retrieves all interfaces
[**getInterfaceById**](InterfaceApi.md#getInterfaceById) | **GET** /api/v1/interface/${id} | Retrieves interface by ID
[**getInterfaceCount**](InterfaceApi.md#getInterfaceCount) | **GET** /api/v1/interface/count | Retrieves interface count
[**getInterfaceIpAddressByIpAddress**](InterfaceApi.md#getInterfaceIpAddressByIpAddress) | **GET** /api/v1/interface/ip-address/${ipAddress} | Retrieves interfaces by IP address
[**getInterfaceIsis**](InterfaceApi.md#getInterfaceIsis) | **GET** /api/v1/interface/isis | Retrieves ISIS interfaces
[**getInterfaceNetworkDeviceByDeviceId**](InterfaceApi.md#getInterfaceNetworkDeviceByDeviceId) | **GET** /api/v1/interface/network-device/${deviceId} | Retrieves device interfaces
[**getInterfaceNetworkDeviceCountByDeviceId**](InterfaceApi.md#getInterfaceNetworkDeviceCountByDeviceId) | **GET** /api/v1/interface/network-device/${deviceId}/count | Retrieves device interface count
[**getInterfaceNetworkDeviceInterfaceNameByDeviceId**](InterfaceApi.md#getInterfaceNetworkDeviceInterfaceNameByDeviceId) | **GET** /api/v1/interface/network-device/${deviceId}/interface-name | Retrieves interface for the given device and interface name
[**getInterfaceOspf**](InterfaceApi.md#getInterfaceOspf) | **GET** /api/v1/interface/ospf | Retrieves OSPF interfaces
[**getNetworkDeviceByDeviceIdRange**](InterfaceApi.md#getNetworkDeviceByDeviceIdRange) | **GET** /api/v1/interface/network-device/${deviceId}/${startIndex}/${recordsToReturn} | Retrieves device interfaces in the given range


<a name="getInterface"></a>
# **getInterface**
> DeviceIfListResult getInterface()

Retrieves all interfaces

Gets all available interfaces with a maximum limit of 500

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
try {
    DeviceIfListResult result = apiInstance.getInterface();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getInterface");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeviceIfListResult**](DeviceIfListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInterfaceById"></a>
# **getInterfaceById**
> DeviceIfResult getInterfaceById(id)

Retrieves interface by ID

Gets the interface for the given interface ID

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
String id = "id_example"; // String | Interface ID
try {
    DeviceIfResult result = apiInstance.getInterfaceById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getInterfaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Interface ID |

### Return type

[**DeviceIfResult**](DeviceIfResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInterfaceCount"></a>
# **getInterfaceCount**
> CountResult getInterfaceCount()

Retrieves interface count

Gets the count of interfaces for all devices

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
try {
    CountResult result = apiInstance.getInterfaceCount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getInterfaceCount");
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

<a name="getInterfaceIpAddressByIpAddress"></a>
# **getInterfaceIpAddressByIpAddress**
> DeviceIfListResult getInterfaceIpAddressByIpAddress(ipAddress)

Retrieves interfaces by IP address

Gets list of interfaces with the given IP address

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
String ipAddress = "ipAddress_example"; // String | IP address of the interface
try {
    DeviceIfListResult result = apiInstance.getInterfaceIpAddressByIpAddress(ipAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getInterfaceIpAddressByIpAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | **String**| IP address of the interface |

### Return type

[**DeviceIfListResult**](DeviceIfListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInterfaceIsis"></a>
# **getInterfaceIsis**
> DeviceIfListResult getInterfaceIsis()

Retrieves ISIS interfaces

Gets the interfaces that has ISIS enabled

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
try {
    DeviceIfListResult result = apiInstance.getInterfaceIsis();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getInterfaceIsis");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeviceIfListResult**](DeviceIfListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInterfaceNetworkDeviceByDeviceId"></a>
# **getInterfaceNetworkDeviceByDeviceId**
> DeviceIfListResult getInterfaceNetworkDeviceByDeviceId(deviceId)

Retrieves device interfaces

Gets list of interfaces for the given device

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
String deviceId = "deviceId_example"; // String | Device ID
try {
    DeviceIfListResult result = apiInstance.getInterfaceNetworkDeviceByDeviceId(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getInterfaceNetworkDeviceByDeviceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID |

### Return type

[**DeviceIfListResult**](DeviceIfListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInterfaceNetworkDeviceCountByDeviceId"></a>
# **getInterfaceNetworkDeviceCountByDeviceId**
> CountResult getInterfaceNetworkDeviceCountByDeviceId(deviceId)

Retrieves device interface count

Gets the interface count for the given device

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
String deviceId = "deviceId_example"; // String | Device ID
try {
    CountResult result = apiInstance.getInterfaceNetworkDeviceCountByDeviceId(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getInterfaceNetworkDeviceCountByDeviceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID |

### Return type

[**CountResult**](CountResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInterfaceNetworkDeviceInterfaceNameByDeviceId"></a>
# **getInterfaceNetworkDeviceInterfaceNameByDeviceId**
> DeviceIfResult getInterfaceNetworkDeviceInterfaceNameByDeviceId(deviceId, name)

Retrieves interface for the given device and interface name

Gets the interface for the given device ID and for the given interface name

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
String deviceId = "deviceId_example"; // String | Device ID
String name = "name_example"; // String | Interface name
try {
    DeviceIfResult result = apiInstance.getInterfaceNetworkDeviceInterfaceNameByDeviceId(deviceId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getInterfaceNetworkDeviceInterfaceNameByDeviceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID |
 **name** | **String**| Interface name |

### Return type

[**DeviceIfResult**](DeviceIfResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInterfaceOspf"></a>
# **getInterfaceOspf**
> DeviceIfListResult getInterfaceOspf()

Retrieves OSPF interfaces

Gets the interfaces that has OSPF enabled

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
try {
    DeviceIfListResult result = apiInstance.getInterfaceOspf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getInterfaceOspf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeviceIfListResult**](DeviceIfListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDeviceByDeviceIdRange"></a>
# **getNetworkDeviceByDeviceIdRange**
> DeviceIfListResult getNetworkDeviceByDeviceIdRange(deviceId, startIndex, recordsToReturn)

Retrieves device interfaces in the given range

Gets the list of interfaces for the device for the specified range

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.InterfaceApi;


InterfaceApi apiInstance = new InterfaceApi();
String deviceId = "deviceId_example"; // String | Device ID
Integer startIndex = 56; // Integer | Start index
Integer recordsToReturn = 56; // Integer | Number of records to return
try {
    DeviceIfListResult result = apiInstance.getNetworkDeviceByDeviceIdRange(deviceId, startIndex, recordsToReturn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterfaceApi#getNetworkDeviceByDeviceIdRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID |
 **startIndex** | **Integer**| Start index |
 **recordsToReturn** | **Integer**| Number of records to return |

### Return type

[**DeviceIfListResult**](DeviceIfListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

