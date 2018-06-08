# DiscoveryApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDiscovery**](DiscoveryApi.md#deleteDiscovery) | **DELETE** /api/v1/discovery | Deletes all discovery
[**deleteDiscoveryById**](DiscoveryApi.md#deleteDiscoveryById) | **DELETE** /api/v1/discovery/${id} | Deletes the discovery specified by id
[**deleteDiscoveryRange**](DiscoveryApi.md#deleteDiscoveryRange) | **DELETE** /api/v1/discovery/${startIndex}/${recordsToDelete} | Deletes the discovery in the given range
[**getDiscoveryAutoCompleteById**](DiscoveryApi.md#getDiscoveryAutoCompleteById) | **GET** /api/v1/discovery/${id}/autoComplete | Retrieve autoComplete values from a discovery based on id
[**getDiscoveryById**](DiscoveryApi.md#getDiscoveryById) | **GET** /api/v1/discovery/${id} | Retrieves the discovery specified by id
[**getDiscoveryCount**](DiscoveryApi.md#getDiscoveryCount) | **GET** /api/v1/discovery/count | Retrieves the number of discoveries
[**getDiscoveryJob**](DiscoveryApi.md#getDiscoveryJob) | **GET** /api/v1/discovery/job | Retrieves the list of discovery jobs for the given IP
[**getDiscoveryJobById**](DiscoveryApi.md#getDiscoveryJobById) | **GET** /api/v1/discovery/${id}/job | Retrieves list of discovery jobs for the specified discovery id
[**getDiscoveryNetworkDeviceByIdRange**](DiscoveryApi.md#getDiscoveryNetworkDeviceByIdRange) | **GET** /api/v1/discovery/${id}/network-device/${startIndex}/${recordsToReturn} | Retrieves the range of network devices discovered for the given discovery
[**getDiscoveryNetworkDeviceCountById**](DiscoveryApi.md#getDiscoveryNetworkDeviceCountById) | **GET** /api/v1/discovery/${id}/network-device/count | Retrieves the number of network devices discovered in the discovery specified by id
[**getDiscoveryNetworkNetworkDeviceById**](DiscoveryApi.md#getDiscoveryNetworkNetworkDeviceById) | **GET** /api/v1/discovery/${id}/network-device | Retrieves the network devices discovered in the discovery specified by id
[**getDiscoveryRange**](DiscoveryApi.md#getDiscoveryRange) | **GET** /api/v1/discovery/${startIndex}/${recordsToReturn} | Retrieves the discovery in the given range
[**getDiscoverySummaryById**](DiscoveryApi.md#getDiscoverySummaryById) | **GET** /api/v1/discovery/${id}/summary | Retrieve network devices from a discovery on given filters
[**postDiscovery**](DiscoveryApi.md#postDiscovery) | **POST** /api/v1/discovery | Starts a new discovery process and returns a task-id
[**putDiscovery**](DiscoveryApi.md#putDiscovery) | **PUT** /api/v1/discovery | Updates an existing discovery specified by id - only for starting/stopping the discovery


<a name="deleteDiscovery"></a>
# **deleteDiscovery**
> TaskIdResult deleteDiscovery()

Deletes all discovery

Stops all the discoveries and removes them

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
try {
    TaskIdResult result = apiInstance.deleteDiscovery();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#deleteDiscovery");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDiscoveryById"></a>
# **deleteDiscoveryById**
> TaskIdResult deleteDiscoveryById(id)

Deletes the discovery specified by id

Stops the discovery for the given ID and removes it

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String id = "id_example"; // String | Discovery ID
try {
    TaskIdResult result = apiInstance.deleteDiscoveryById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#deleteDiscoveryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Discovery ID |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDiscoveryRange"></a>
# **deleteDiscoveryRange**
> TaskIdResult deleteDiscoveryRange(startIndex, recordsToDelete)

Deletes the discovery in the given range

Stops discovery for the given range and removes them

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
Integer startIndex = 56; // Integer | Start index
Integer recordsToDelete = 56; // Integer | Number of records to delete
try {
    TaskIdResult result = apiInstance.deleteDiscoveryRange(startIndex, recordsToDelete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#deleteDiscoveryRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startIndex** | **Integer**| Start index |
 **recordsToDelete** | **Integer**| Number of records to delete |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscoveryAutoCompleteById"></a>
# **getDiscoveryAutoCompleteById**
> SuccessResultList getDiscoveryAutoCompleteById(id, taskId, ipAddress, pingStatus, snmpStatus, cliStatus, netconfStatus, httpStatus)

Retrieve autoComplete values from a discovery based on id

Gets the autoComplete values from a discovery job

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String id = "id_example"; // String | id
String taskId = "taskId_example"; // String | taskId
String ipAddress = "ipAddress_example"; // String | ipAddress
String pingStatus = "pingStatus_example"; // String | pingStatus
String snmpStatus = "snmpStatus_example"; // String | snmpStatus
String cliStatus = "cliStatus_example"; // String | cliStatus
String netconfStatus = "netconfStatus_example"; // String | netconfStatus
String httpStatus = "httpStatus_example"; // String | httpStatus
try {
    SuccessResultList result = apiInstance.getDiscoveryAutoCompleteById(id, taskId, ipAddress, pingStatus, snmpStatus, cliStatus, netconfStatus, httpStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoveryAutoCompleteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **taskId** | **String**| taskId | [optional]
 **ipAddress** | **String**| ipAddress | [optional]
 **pingStatus** | **String**| pingStatus | [optional]
 **snmpStatus** | **String**| snmpStatus | [optional]
 **cliStatus** | **String**| cliStatus | [optional]
 **netconfStatus** | **String**| netconfStatus | [optional]
 **httpStatus** | **String**| httpStatus | [optional]

### Return type

[**SuccessResultList**](SuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscoveryById"></a>
# **getDiscoveryById**
> DiscoveryNIOResult getDiscoveryById(id)

Retrieves the discovery specified by id

Gets discovery by ID

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String id = "id_example"; // String | Discovery ID
try {
    DiscoveryNIOResult result = apiInstance.getDiscoveryById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoveryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Discovery ID |

### Return type

[**DiscoveryNIOResult**](DiscoveryNIOResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscoveryCount"></a>
# **getDiscoveryCount**
> CountResult getDiscoveryCount()

Retrieves the number of discoveries

Gets the count of all available discovery jobs

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
try {
    CountResult result = apiInstance.getDiscoveryCount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoveryCount");
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

<a name="getDiscoveryJob"></a>
# **getDiscoveryJob**
> DiscoveryJobNIOListResult getDiscoveryJob(ipAddress, offset, limit, name)

Retrieves the list of discovery jobs for the given IP

Gets the list of discovery jobs for the given IP

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String ipAddress = "ipAddress_example"; // String | ipAddress
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String name = "name_example"; // String | name
try {
    DiscoveryJobNIOListResult result = apiInstance.getDiscoveryJob(ipAddress, offset, limit, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoveryJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | **String**| ipAddress |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **name** | **String**| name | [optional]

### Return type

[**DiscoveryJobNIOListResult**](DiscoveryJobNIOListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscoveryJobById"></a>
# **getDiscoveryJobById**
> DiscoveryJobNIOListResult getDiscoveryJobById(id, offset, limit, ipAddress)

Retrieves list of discovery jobs for the specified discovery id

Gets the list of discovery jobs for the given id. The result can optionally be filtered based on IP

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String id = "id_example"; // String | Discovery ID
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String ipAddress = "ipAddress_example"; // String | ipAddress
try {
    DiscoveryJobNIOListResult result = apiInstance.getDiscoveryJobById(id, offset, limit, ipAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoveryJobById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Discovery ID |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **ipAddress** | **String**| ipAddress | [optional]

### Return type

[**DiscoveryJobNIOListResult**](DiscoveryJobNIOListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscoveryNetworkDeviceByIdRange"></a>
# **getDiscoveryNetworkDeviceByIdRange**
> NetworkDeviceNIOListResult getDiscoveryNetworkDeviceByIdRange(id, startIndex, recordsToReturn, taskId)

Retrieves the range of network devices discovered for the given discovery

Gets the network devices discovered for the given discovery and for the given range. The maximum number of records that could be retrieved is 500

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String id = "id_example"; // String | Discovery ID
Integer startIndex = 56; // Integer | Start index
Integer recordsToReturn = 56; // Integer | Number of records to return
String taskId = "taskId_example"; // String | taskId
try {
    NetworkDeviceNIOListResult result = apiInstance.getDiscoveryNetworkDeviceByIdRange(id, startIndex, recordsToReturn, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoveryNetworkDeviceByIdRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Discovery ID |
 **startIndex** | **Integer**| Start index |
 **recordsToReturn** | **Integer**| Number of records to return |
 **taskId** | **String**| taskId | [optional]

### Return type

[**NetworkDeviceNIOListResult**](NetworkDeviceNIOListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscoveryNetworkDeviceCountById"></a>
# **getDiscoveryNetworkDeviceCountById**
> CountResult getDiscoveryNetworkDeviceCountById(id, taskId)

Retrieves the number of network devices discovered in the discovery specified by id

Gets the count of network devices discovered in the given discovery

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String id = "id_example"; // String | Discovery ID
String taskId = "taskId_example"; // String | taskId
try {
    CountResult result = apiInstance.getDiscoveryNetworkDeviceCountById(id, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoveryNetworkDeviceCountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Discovery ID |
 **taskId** | **String**| taskId | [optional]

### Return type

[**CountResult**](CountResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscoveryNetworkNetworkDeviceById"></a>
# **getDiscoveryNetworkNetworkDeviceById**
> NetworkDeviceNIOListResult getDiscoveryNetworkNetworkDeviceById(id, taskId)

Retrieves the network devices discovered in the discovery specified by id

Gets the network devices discovered for the given discovery

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String id = "id_example"; // String | id
String taskId = "taskId_example"; // String | taskId
try {
    NetworkDeviceNIOListResult result = apiInstance.getDiscoveryNetworkNetworkDeviceById(id, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoveryNetworkNetworkDeviceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **taskId** | **String**| taskId | [optional]

### Return type

[**NetworkDeviceNIOListResult**](NetworkDeviceNIOListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscoveryRange"></a>
# **getDiscoveryRange**
> DiscoveryNIOListResult getDiscoveryRange(startIndex, recordsToReturn)

Retrieves the discovery in the given range

Gets the discovery for the range specified

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
Integer startIndex = 56; // Integer | Start index
Integer recordsToReturn = 56; // Integer | Number of records to return
try {
    DiscoveryNIOListResult result = apiInstance.getDiscoveryRange(startIndex, recordsToReturn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoveryRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startIndex** | **Integer**| Start index |
 **recordsToReturn** | **Integer**| Number of records to return |

### Return type

[**DiscoveryNIOListResult**](DiscoveryNIOListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscoverySummaryById"></a>
# **getDiscoverySummaryById**
> CountResult getDiscoverySummaryById(id, taskId, sortBy, sortOrder, ipAddress, pingStatus, snmpStatus, cliStatus, netconfStatus, httpStatus)

Retrieve network devices from a discovery on given filters

Gets the network devices from a discovery job based on given filters

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String id = "id_example"; // String | id
String taskId = "taskId_example"; // String | taskId
String sortBy = "sortBy_example"; // String | sortBy
String sortOrder = "sortOrder_example"; // String | sortOrder
List<String> ipAddress = Arrays.asList("ipAddress_example"); // List<String> | ipAddress
List<String> pingStatus = Arrays.asList("pingStatus_example"); // List<String> | pingStatus
List<String> snmpStatus = Arrays.asList("snmpStatus_example"); // List<String> | snmpStatus
List<String> cliStatus = Arrays.asList("cliStatus_example"); // List<String> | cliStatus
List<String> netconfStatus = Arrays.asList("netconfStatus_example"); // List<String> | netconfStatus
List<String> httpStatus = Arrays.asList("httpStatus_example"); // List<String> | httpStatus
try {
    CountResult result = apiInstance.getDiscoverySummaryById(id, taskId, sortBy, sortOrder, ipAddress, pingStatus, snmpStatus, cliStatus, netconfStatus, httpStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getDiscoverySummaryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **taskId** | **String**| taskId | [optional]
 **sortBy** | **String**| sortBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **ipAddress** | [**List&lt;String&gt;**](String.md)| ipAddress | [optional]
 **pingStatus** | [**List&lt;String&gt;**](String.md)| pingStatus | [optional]
 **snmpStatus** | [**List&lt;String&gt;**](String.md)| snmpStatus | [optional]
 **cliStatus** | [**List&lt;String&gt;**](String.md)| cliStatus | [optional]
 **netconfStatus** | [**List&lt;String&gt;**](String.md)| netconfStatus | [optional]
 **httpStatus** | [**List&lt;String&gt;**](String.md)| httpStatus | [optional]

### Return type

[**CountResult**](CountResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDiscovery"></a>
# **postDiscovery**
> TaskIdResult postDiscovery(request)

Starts a new discovery process and returns a task-id

Initiates discovery with the given parameters

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
InventoryRequest request = new InventoryRequest(); // InventoryRequest | request
try {
    TaskIdResult result = apiInstance.postDiscovery(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#postDiscovery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**InventoryRequest**](InventoryRequest.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putDiscovery"></a>
# **putDiscovery**
> TaskIdResult putDiscovery(request)

Updates an existing discovery specified by id - only for starting/stopping the discovery

Stops or starts an existing discovery

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
DiscoveryNIO request = new DiscoveryNIO(); // DiscoveryNIO | request
try {
    TaskIdResult result = apiInstance.putDiscovery(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#putDiscovery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DiscoveryNIO**](DiscoveryNIO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

