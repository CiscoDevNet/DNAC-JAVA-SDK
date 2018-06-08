# TaskApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTask**](TaskApi.md#getTask) | **GET** /api/v1/task | Get filtered tasks
[**getTaskByTaskId**](TaskApi.md#getTaskByTaskId) | **GET** /api/v1/task/${taskId} | getTruststoreFileCount
[**getTaskCount**](TaskApi.md#getTaskCount) | **GET** /api/v1/task/count | Get task count
[**getTaskOperationByOperationIdRange**](TaskApi.md#getTaskOperationByOperationIdRange) | **GET** /api/v1/task/operation/${operationId}/${offset}/${limit} | getTaskByOperationId
[**getTaskTreeByTaskId**](TaskApi.md#getTaskTreeByTaskId) | **GET** /api/v1/task/${taskId}/tree | Get Task Tree


<a name="getTask"></a>
# **getTask**
> TaskDTOListResponse getTask(startTime, endTime, data, errorCode, serviceType, username, progress, isError, failureReason, parentId, offset, limit, sortBy, order)

Get filtered tasks

This method is used to retrieve task(s) based on various filters

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String startTime = "startTime_example"; // String | This is the epoch start time from which tasks need to be fetched
String endTime = "endTime_example"; // String | This is the epoch end time upto which audit records need to be fetched
String data = "data_example"; // String | Fetch tasks that contains this data
String errorCode = "errorCode_example"; // String | Fetch tasks that have this error code
String serviceType = "serviceType_example"; // String | Fetch tasks with this service type
String username = "username_example"; // String | Fetch tasks with this username
String progress = "progress_example"; // String | Fetch tasks that contains this progress
String isError = "isError_example"; // String | Fetch tasks ended as success or failure. Valid values: true, false
String failureReason = "failureReason_example"; // String | Fetch tasks that contains this failure reason
String parentId = "parentId_example"; // String | Fetch tasks that have this parent Id
String offset = "offset_example"; // String | offset
String limit = "limit_example"; // String | limit
String sortBy = "sortBy_example"; // String | Sort results by this field
String order = "order_example"; // String | Sort order - asc or dsc
try {
    TaskDTOListResponse result = apiInstance.getTask(startTime, endTime, data, errorCode, serviceType, username, progress, isError, failureReason, parentId, offset, limit, sortBy, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **String**| This is the epoch start time from which tasks need to be fetched | [optional]
 **endTime** | **String**| This is the epoch end time upto which audit records need to be fetched | [optional]
 **data** | **String**| Fetch tasks that contains this data | [optional]
 **errorCode** | **String**| Fetch tasks that have this error code | [optional]
 **serviceType** | **String**| Fetch tasks with this service type | [optional]
 **username** | **String**| Fetch tasks with this username | [optional]
 **progress** | **String**| Fetch tasks that contains this progress | [optional]
 **isError** | **String**| Fetch tasks ended as success or failure. Valid values: true, false | [optional]
 **failureReason** | **String**| Fetch tasks that contains this failure reason | [optional]
 **parentId** | **String**| Fetch tasks that have this parent Id | [optional]
 **offset** | **String**| offset | [optional]
 **limit** | **String**| limit | [optional]
 **sortBy** | **String**| Sort results by this field | [optional]
 **order** | **String**| Sort order - asc or dsc | [optional]

### Return type

[**TaskDTOListResponse**](TaskDTOListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskByTaskId"></a>
# **getTaskByTaskId**
> TaskDTOResponse getTaskByTaskId(taskId)

getTruststoreFileCount

This method is used to retrieve a task based on their id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String taskId = "taskId_example"; // String | UUID of the Task
try {
    TaskDTOResponse result = apiInstance.getTaskByTaskId(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTaskByTaskId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| UUID of the Task |

### Return type

[**TaskDTOResponse**](TaskDTOResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskCount"></a>
# **getTaskCount**
> CountResult getTaskCount(startTime, endTime, data, errorCode, serviceType, username, progress, isError, failureReason, parentId)

Get task count

This method is used to retrieve task count

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String startTime = "startTime_example"; // String | This is the epoch start time from which tasks need to be fetched
String endTime = "endTime_example"; // String | This is the epoch end time upto which audit records need to be fetched
String data = "data_example"; // String | Fetch tasks that contains this data
String errorCode = "errorCode_example"; // String | Fetch tasks that have this error code
String serviceType = "serviceType_example"; // String | Fetch tasks with this service type
String username = "username_example"; // String | Fetch tasks with this username
String progress = "progress_example"; // String | Fetch tasks that contains this progress
String isError = "isError_example"; // String | Fetch tasks ended as success or failure. Valid values: true, false
String failureReason = "failureReason_example"; // String | Fetch tasks that contains this failure reason
String parentId = "parentId_example"; // String | Fetch tasks that have this parent Id
try {
    CountResult result = apiInstance.getTaskCount(startTime, endTime, data, errorCode, serviceType, username, progress, isError, failureReason, parentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTaskCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **String**| This is the epoch start time from which tasks need to be fetched | [optional]
 **endTime** | **String**| This is the epoch end time upto which audit records need to be fetched | [optional]
 **data** | **String**| Fetch tasks that contains this data | [optional]
 **errorCode** | **String**| Fetch tasks that have this error code | [optional]
 **serviceType** | **String**| Fetch tasks with this service type | [optional]
 **username** | **String**| Fetch tasks with this username | [optional]
 **progress** | **String**| Fetch tasks that contains this progress | [optional]
 **isError** | **String**| Fetch tasks ended as success or failure. Valid values: true, false | [optional]
 **failureReason** | **String**| Fetch tasks that contains this failure reason | [optional]
 **parentId** | **String**| Fetch tasks that have this parent Id | [optional]

### Return type

[**CountResult**](CountResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskOperationByOperationIdRange"></a>
# **getTaskOperationByOperationIdRange**
> TaskDTOListResponse getTaskOperationByOperationIdRange(operationId, offset, limit)

getTaskByOperationId

This method is used to find root tasks assoicated to an operationid 

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String operationId = "operationId_example"; // String | operationId
Integer offset = 56; // Integer | Index, minimum value is 0
Integer limit = 56; // Integer | The maximum value of {limit} supported is 500. <br/> Base 1 indexing for {limit}, minimum value is 1
try {
    TaskDTOListResponse result = apiInstance.getTaskOperationByOperationIdRange(operationId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTaskOperationByOperationIdRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operationId** | **String**| operationId |
 **offset** | **Integer**| Index, minimum value is 0 |
 **limit** | **Integer**| The maximum value of {limit} supported is 500. &lt;br/&gt; Base 1 indexing for {limit}, minimum value is 1 |

### Return type

[**TaskDTOListResponse**](TaskDTOListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskTreeByTaskId"></a>
# **getTaskTreeByTaskId**
> TaskDTOListResponse getTaskTreeByTaskId(taskId)

Get Task Tree

This method is used to retrieve a task with its children tasks based on their id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String taskId = "taskId_example"; // String | UUID of the Task
try {
    TaskDTOListResponse result = apiInstance.getTaskTreeByTaskId(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTaskTreeByTaskId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| UUID of the Task |

### Return type

[**TaskDTOListResponse**](TaskDTOListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

