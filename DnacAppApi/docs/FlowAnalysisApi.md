# FlowAnalysisApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFlowAnalysisByFlowAnalysisId**](FlowAnalysisApi.md#deleteFlowAnalysisByFlowAnalysisId) | **DELETE** /api/v1/flow-analysis/${flowAnalysisId} | Deletes a flow analysis request
[**getFlowAnalysis**](FlowAnalysisApi.md#getFlowAnalysis) | **GET** /api/v1/flow-analysis | Retrieves a summary of all flow analyses stored


<a name="deleteFlowAnalysisByFlowAnalysisId"></a>
# **deleteFlowAnalysisByFlowAnalysisId**
> TaskIdResult deleteFlowAnalysisByFlowAnalysisId(flowAnalysisId)

Deletes a flow analysis request

Deletes a flow analysis request by its id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.FlowAnalysisApi;


FlowAnalysisApi apiInstance = new FlowAnalysisApi();
String flowAnalysisId = "flowAnalysisId_example"; // String | Flow analysis request id
try {
    TaskIdResult result = apiInstance.deleteFlowAnalysisByFlowAnalysisId(flowAnalysisId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowAnalysisApi#deleteFlowAnalysisByFlowAnalysisId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowAnalysisId** | **String**| Flow analysis request id |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFlowAnalysis"></a>
# **getFlowAnalysis**
> FlowAnalysisListOutput getFlowAnalysis(periodicRefresh, sourceIP, destIP, sourcePort, destPort, gtCreateTime, ltCreateTime, protocol, status, taskId, lastUpdateTime, limit, offset, order, sortBy)

Retrieves a summary of all flow analyses stored

Retrieves a summary of all flow analyses stored. Filters the results by given parameters.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.FlowAnalysisApi;


FlowAnalysisApi apiInstance = new FlowAnalysisApi();
Boolean periodicRefresh = true; // Boolean | Is analysis periodically refreshed?
String sourceIP = "sourceIP_example"; // String | Source IP address
String destIP = "destIP_example"; // String | Destination IP adress
String sourcePort = "sourcePort_example"; // String | Source port
String destPort = "destPort_example"; // String | Destination port
String gtCreateTime = "gtCreateTime_example"; // String | Analyses requested after this time
String ltCreateTime = "ltCreateTime_example"; // String | Analyses requested before this time
String protocol = "protocol_example"; // String | Protocol
String status = "status_example"; // String | Status
String taskId = "taskId_example"; // String | Task ID
String lastUpdateTime = "lastUpdateTime_example"; // String | Last update time
String limit = "limit_example"; // String | Number of resources returned
String offset = "offset_example"; // String | Start index of resources returned (1-based)
String order = "order_example"; // String | Order by this field
String sortBy = "sortBy_example"; // String | Sort by this field
try {
    FlowAnalysisListOutput result = apiInstance.getFlowAnalysis(periodicRefresh, sourceIP, destIP, sourcePort, destPort, gtCreateTime, ltCreateTime, protocol, status, taskId, lastUpdateTime, limit, offset, order, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowAnalysisApi#getFlowAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **periodicRefresh** | **Boolean**| Is analysis periodically refreshed? | [optional]
 **sourceIP** | **String**| Source IP address | [optional]
 **destIP** | **String**| Destination IP adress | [optional]
 **sourcePort** | **String**| Source port | [optional]
 **destPort** | **String**| Destination port | [optional]
 **gtCreateTime** | **String**| Analyses requested after this time | [optional]
 **ltCreateTime** | **String**| Analyses requested before this time | [optional]
 **protocol** | **String**| Protocol | [optional]
 **status** | **String**| Status | [optional]
 **taskId** | **String**| Task ID | [optional]
 **lastUpdateTime** | **String**| Last update time | [optional]
 **limit** | **String**| Number of resources returned | [optional]
 **offset** | **String**| Start index of resources returned (1-based) | [optional]
 **order** | **String**| Order by this field | [optional]
 **sortBy** | **String**| Sort by this field | [optional]

### Return type

[**FlowAnalysisListOutput**](FlowAnalysisListOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

