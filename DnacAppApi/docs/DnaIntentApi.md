# DnaIntentApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDnaIntentDeleteApplication**](DnaIntentApi.md#deleteDnaIntentDeleteApplication) | **DELETE** /dna/intent/api/v1/delete-application | Delete Application
[**deleteDnaIntentDeleteApplicationSet**](DnaIntentApi.md#deleteDnaIntentDeleteApplicationSet) | **DELETE** /dna/intent/api/v1/delete-application-set | Delete Application Set
[**deleteDnaIntentDeleteSsid**](DnaIntentApi.md#deleteDnaIntentDeleteSsid) | **DELETE** /dna/intent/api/v1/delete-ssid/${deviceName}/${wirelessNetworkProfileName}/${ssidName}/${interfaceName} | Delete SSID
[**getDnaIntentApplicationCount**](DnaIntentApi.md#getDnaIntentApplicationCount) | **GET** /dna/intent/api/v1/application/count | Get Applications Count
[**getDnaIntentApplicationPolicy**](DnaIntentApi.md#getDnaIntentApplicationPolicy) | **GET** /dna/intent/api/v1/application-policy | Get Application Policies
[**getDnaIntentApplicationSetCount**](DnaIntentApi.md#getDnaIntentApplicationSetCount) | **GET** /dna/intent/api/v1/application-set/count | Get Application Sets Count
[**getDnaIntentApplicationSets**](DnaIntentApi.md#getDnaIntentApplicationSets) | **GET** /dna/intent/api/v1/application-sets | Get Application Sets
[**getDnaIntentApplications**](DnaIntentApi.md#getDnaIntentApplications) | **GET** /dna/intent/api/v1/applications | Get Applications
[**getDnaIntentClieDetail**](DnaIntentApi.md#getDnaIntentClieDetail) | **GET** /dna/intent/api/v1/client-detail | Client Detail
[**getDnaIntentClientHealth**](DnaIntentApi.md#getDnaIntentClientHealth) | **GET** /dna/intent/api/v1/client-health | Client Health
[**getDnaIntentNetworkDeviceDetail**](DnaIntentApi.md#getDnaIntentNetworkDeviceDetail) | **GET** /dna/intent/api/v1/network-device-detail | Network Device Detail
[**getDnaIntentNetworkHealth**](DnaIntentApi.md#getDnaIntentNetworkHealth) | **GET** /dna/intent/api/v1/network-health | Network Health
[**getDnaIntentSiteHierarchy**](DnaIntentApi.md#getDnaIntentSiteHierarchy) | **GET** /dna/intent/api/v1/site-hierarchy | Site Hierarchy
[**postDnaIntentCreateApplication**](DnaIntentApi.md#postDnaIntentCreateApplication) | **POST** /dna/intent/api/v1/create-application | Post Application
[**postDnaIntentCreateApplicationPolicy**](DnaIntentApi.md#postDnaIntentCreateApplicationPolicy) | **POST** /dna/intent/api/v1/create-application-policy | Post Application Policy Intent
[**postDnaIntentCreateApplicationSet**](DnaIntentApi.md#postDnaIntentCreateApplicationSet) | **POST** /dna/intent/api/v1/create-application-set | Post Application Set
[**postDnaIntentCreateSsid**](DnaIntentApi.md#postDnaIntentCreateSsid) | **POST** /dna/intent/api/v1/create-ssid | Create SSID
[**putDnaIntentUpdateApplication**](DnaIntentApi.md#putDnaIntentUpdateApplication) | **PUT** /dna/intent/api/v1/update-application | Edit Application


<a name="deleteDnaIntentDeleteApplication"></a>
# **deleteDnaIntentDeleteApplication**
> deleteDnaIntentDeleteApplication(applicationId, runsync, timeout)

Delete Application

Invoke the API to delete a custom application

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
String applicationId = ""; // String | 
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    apiInstance.deleteDnaIntentDeleteApplication(applicationId, runsync, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#deleteDnaIntentDeleteApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**|  | [default to ]
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDnaIntentDeleteApplicationSet"></a>
# **deleteDnaIntentDeleteApplicationSet**
> deleteDnaIntentDeleteApplicationSet(applicationSetId, runsync, timeout)

Delete Application Set

Invoke the API to delete a custom application

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
String applicationSetId = ""; // String | 
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    apiInstance.deleteDnaIntentDeleteApplicationSet(applicationSetId, runsync, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#deleteDnaIntentDeleteApplicationSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationSetId** | **String**|  | [default to ]
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDnaIntentDeleteSsid"></a>
# **deleteDnaIntentDeleteSsid**
> DeleteSSIDResponse deleteDnaIntentDeleteSsid(deviceName, wirelessNetworkProfileName, ssidName, interfaceName, runsync, timeout)

Delete SSID

De-provision WLC, also removes wireless network profile, SSID and dynamic interface

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
String deviceName = "deviceName_example"; // String | 
String wirelessNetworkProfileName = "wirelessNetworkProfileName_example"; // String | 
String ssidName = "ssidName_example"; // String | 
String interfaceName = "interfaceName_example"; // String | 
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    DeleteSSIDResponse result = apiInstance.deleteDnaIntentDeleteSsid(deviceName, wirelessNetworkProfileName, ssidName, interfaceName, runsync, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#deleteDnaIntentDeleteSsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceName** | **String**|  |
 **wirelessNetworkProfileName** | **String**|  |
 **ssidName** | **String**|  |
 **interfaceName** | **String**|  |
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

[**DeleteSSIDResponse**](DeleteSSIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentApplicationCount"></a>
# **getDnaIntentApplicationCount**
> getDnaIntentApplicationCount(count, runsync, timeout)

Get Applications Count

Invoke the API to return the number of defined applications

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
String count = "count_example"; // String | 
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    apiInstance.getDnaIntentApplicationCount(count, runsync, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentApplicationCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **String**|  |
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentApplicationPolicy"></a>
# **getDnaIntentApplicationPolicy**
> getDnaIntentApplicationPolicy(runsync, timeout, offset, limit, applicationPolicyNamespace)

Get Application Policies

Invoke the API to return all (or specific) application-policy(ies)

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
BigDecimal offset = new BigDecimal(); // BigDecimal | 
BigDecimal limit = new BigDecimal(); // BigDecimal | 
String applicationPolicyNamespace = ""; // String | 
try {
    apiInstance.getDnaIntentApplicationPolicy(runsync, timeout, offset, limit, applicationPolicyNamespace);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentApplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]
 **offset** | **BigDecimal**|  | [optional] [default to 1]
 **limit** | **BigDecimal**|  | [optional] [default to 500]
 **applicationPolicyNamespace** | **String**|  | [optional] [default to ]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentApplicationSetCount"></a>
# **getDnaIntentApplicationSetCount**
> getDnaIntentApplicationSetCount(count, runsync, timeout)

Get Application Sets Count

Invoke the API to return the number of defined application sets

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
String count = "count_example"; // String | 
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    apiInstance.getDnaIntentApplicationSetCount(count, runsync, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentApplicationSetCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **String**|  |
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentApplicationSets"></a>
# **getDnaIntentApplicationSets**
> getDnaIntentApplicationSets(runsync, timeout, offset, limit, applicationSetName)

Get Application Sets

Invoke the API to return all (or specific) defined application-set(s)

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
BigDecimal offset = new BigDecimal(); // BigDecimal | 
BigDecimal limit = new BigDecimal(); // BigDecimal | 
String applicationSetName = ""; // String | 
try {
    apiInstance.getDnaIntentApplicationSets(runsync, timeout, offset, limit, applicationSetName);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentApplicationSets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]
 **offset** | **BigDecimal**|  | [optional] [default to 1]
 **limit** | **BigDecimal**|  | [optional] [default to 500]
 **applicationSetName** | **String**|  | [optional] [default to ]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentApplications"></a>
# **getDnaIntentApplications**
> getDnaIntentApplications(runsync, timeout, offset, limit, applicationName)

Get Applications

Invoke the API to return the list of all (or specific) defined application(s)

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
BigDecimal offset = new BigDecimal(); // BigDecimal | 
BigDecimal limit = new BigDecimal(); // BigDecimal | 
String applicationName = ""; // String | 
try {
    apiInstance.getDnaIntentApplications(runsync, timeout, offset, limit, applicationName);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]
 **offset** | **BigDecimal**|  | [optional] [default to 1]
 **limit** | **BigDecimal**|  | [optional] [default to 500]
 **applicationName** | **String**|  | [optional] [default to ]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentClieDetail"></a>
# **getDnaIntentClieDetail**
> ClientDetailResponse getDnaIntentClieDetail(timestamp, macAddress, runsync, timeout)

Client Detail

Get Client Details for a single client

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
String timestamp = ""; // String | timestamp
String macAddress = ""; // String | MAC Address of the client
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    ClientDetailResponse result = apiInstance.getDnaIntentClieDetail(timestamp, macAddress, runsync, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentClieDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **String**| timestamp | [default to ]
 **macAddress** | **String**| MAC Address of the client | [default to ]
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

[**ClientDetailResponse**](ClientDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentClientHealth"></a>
# **getDnaIntentClientHealth**
> ClientHealthResponse getDnaIntentClientHealth(startTime, endTime, runsync, timeout)

Client Health

Get overall Client Health along with beak down on categories of wired and wireless

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
String startTime = ""; // String | Start Time
String endTime = ""; // String | End Time
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    ClientHealthResponse result = apiInstance.getDnaIntentClientHealth(startTime, endTime, runsync, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentClientHealth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **String**| Start Time | [default to ]
 **endTime** | **String**| End Time | [default to ]
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

[**ClientHealthResponse**](ClientHealthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentNetworkDeviceDetail"></a>
# **getDnaIntentNetworkDeviceDetail**
> NetworkDeviceDetailResponse getDnaIntentNetworkDeviceDetail(runsync, timeout, timestamp, searchBy, identifier)

Network Device Detail

Get Network Device Detail

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
String timestamp = ""; // String | timestamp
String searchBy = ""; // String | MAC Address or UUID or Name of the Device
String identifier = ""; // String | macAddress or uuid or nwDeviceName
try {
    NetworkDeviceDetailResponse result = apiInstance.getDnaIntentNetworkDeviceDetail(runsync, timeout, timestamp, searchBy, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentNetworkDeviceDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]
 **timestamp** | **String**| timestamp | [optional] [default to ]
 **searchBy** | **String**| MAC Address or UUID or Name of the Device | [optional] [default to ]
 **identifier** | **String**| macAddress or uuid or nwDeviceName | [optional] [default to ]

### Return type

[**NetworkDeviceDetailResponse**](NetworkDeviceDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentNetworkHealth"></a>
# **getDnaIntentNetworkHealth**
> getDnaIntentNetworkHealth(startTime, endTime, runsync, timeout)

Network Health

Network Devices and their health by category

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
String startTime = ""; // String | Start Time
String endTime = ""; // String | End Time
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    apiInstance.getDnaIntentNetworkHealth(startTime, endTime, runsync, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentNetworkHealth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **String**| Start Time | [default to ]
 **endTime** | **String**| End Time | [default to ]
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnaIntentSiteHierarchy"></a>
# **getDnaIntentSiteHierarchy**
> SiteHierarchyResponse getDnaIntentSiteHierarchy(timestamp, runsync, timeout)

Site Hierarchy

Site Hierarchy along with health Info

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
String timestamp = ""; // String | Timestamp 
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    SiteHierarchyResponse result = apiInstance.getDnaIntentSiteHierarchy(timestamp, runsync, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#getDnaIntentSiteHierarchy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **String**| Timestamp  | [default to ]
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

[**SiteHierarchyResponse**](SiteHierarchyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDnaIntentCreateApplication"></a>
# **postDnaIntentCreateApplication**
> postDnaIntentCreateApplication(runsync, timeout)

Post Application

Invoke the API to create a custom application

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    apiInstance.postDnaIntentCreateApplication(runsync, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#postDnaIntentCreateApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDnaIntentCreateApplicationPolicy"></a>
# **postDnaIntentCreateApplicationPolicy**
> postDnaIntentCreateApplicationPolicy(runsync, timeout)

Post Application Policy Intent

Invoke the API to create, modify or delete an application-policy

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    apiInstance.postDnaIntentCreateApplicationPolicy(runsync, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#postDnaIntentCreateApplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDnaIntentCreateApplicationSet"></a>
# **postDnaIntentCreateApplicationSet**
> postDnaIntentCreateApplicationSet(runsync, timeout)

Post Application Set

Invoke the API to create a custom application set

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    apiInstance.postDnaIntentCreateApplicationSet(runsync, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#postDnaIntentCreateApplicationSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDnaIntentCreateSsid"></a>
# **postDnaIntentCreateSsid**
> CreateSSIDResponse postDnaIntentCreateSsid(request, runsync, timeout)

Create SSID

Creates non fabric enterprise SSID, dynamic interface, Wireless Network Profile and provisions WLC and AP

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
CreateSSIDRequest request = new CreateSSIDRequest(); // CreateSSIDRequest | request
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    CreateSSIDResponse result = apiInstance.postDnaIntentCreateSsid(request, runsync, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#postDnaIntentCreateSsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateSSIDRequest**](CreateSSIDRequest.md)| request |
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

[**CreateSSIDResponse**](CreateSSIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putDnaIntentUpdateApplication"></a>
# **putDnaIntentUpdateApplication**
> putDnaIntentUpdateApplication(runsync, timeout)

Edit Application

Invoke the API to create a custom application

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DnaIntentApi;


DnaIntentApi apiInstance = new DnaIntentApi();
Boolean runsync = false; // Boolean | Enable this parameter to execute the API and return a response synchronously
BigDecimal timeout = new BigDecimal(); // BigDecimal | During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated
try {
    apiInstance.putDnaIntentUpdateApplication(runsync, timeout);
} catch (ApiException e) {
    System.err.println("Exception when calling DnaIntentApi#putDnaIntentUpdateApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runsync** | **Boolean**| Enable this parameter to execute the API and return a response synchronously | [optional] [default to false]
 **timeout** | **BigDecimal**| During synchronous execution, this defines the maximum time to wait for a response, before the API execution is terminated | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

