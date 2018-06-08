# MiscApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFlowAnalysisByFlowAnalysisId**](MiscApi.md#getFlowAnalysisByFlowAnalysisId) | **GET** /api/v1/flow-analysis/${flowAnalysisId} | Retrieves result of a previously requested flow analysis
[**getSnmpProperty**](MiscApi.md#getSnmpProperty) | **GET** /api/v1/snmp-property | Retrieves SNMP properties
[**postAuthToken**](MiscApi.md#postAuthToken) | **POST** /api/system/v1/auth/token | Generate Token
[**postFlowAnalysis**](MiscApi.md#postFlowAnalysis) | **POST** /api/v1/flow-analysis | Initiates a new flow analysis
[**postSnmpProperty**](MiscApi.md#postSnmpProperty) | **POST** /api/v1/snmp-property | Creates or updates SNMP properties


<a name="getFlowAnalysisByFlowAnalysisId"></a>
# **getFlowAnalysisByFlowAnalysisId**
> PathResponseResult getFlowAnalysisByFlowAnalysisId(flowAnalysisId)

Retrieves result of a previously requested flow analysis

Retrieves result of a previously requested flow analysis by its Flow Analysis id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.MiscApi;


MiscApi apiInstance = new MiscApi();
String flowAnalysisId = "flowAnalysisId_example"; // String | Flow analysis request id
try {
    PathResponseResult result = apiInstance.getFlowAnalysisByFlowAnalysisId(flowAnalysisId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#getFlowAnalysisByFlowAnalysisId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowAnalysisId** | **String**| Flow analysis request id |

### Return type

[**PathResponseResult**](PathResponseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnmpProperty"></a>
# **getSnmpProperty**
> SystemPropertyListResult getSnmpProperty()

Retrieves SNMP properties

This method is used to get SNMP properties

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.MiscApi;


MiscApi apiInstance = new MiscApi();
try {
    SystemPropertyListResult result = apiInstance.getSnmpProperty();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#getSnmpProperty");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemPropertyListResult**](SystemPropertyListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAuthToken"></a>
# **postAuthToken**
> GenerateTokenResponse postAuthToken(request, authorization)

Generate Token

This method is used to generate token.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.MiscApi;


MiscApi apiInstance = new MiscApi();
GenerateTokenRequest request = new GenerateTokenRequest(); // GenerateTokenRequest | request
String authorization = "Basic YWRtaW46TWFnbGV2MTIz"; // String | <username:password> of 64 based encoded string
try {
    GenerateTokenResponse result = apiInstance.postAuthToken(request, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#postAuthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GenerateTokenRequest**](GenerateTokenRequest.md)| request |
 **authorization** | **String**| &lt;username:password&gt; of 64 based encoded string | [default to Basic YWRtaW46TWFnbGV2MTIz]

### Return type

[**GenerateTokenResponse**](GenerateTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFlowAnalysis"></a>
# **postFlowAnalysis**
> FlowAnalysisRequestResultOutput postFlowAnalysis(request)

Initiates a new flow analysis

Initiates a new flow analysis with periodic refresh and stat collection options. Returns a request id and a task id to get results and follow progress.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.MiscApi;


MiscApi apiInstance = new MiscApi();
FlowAnalysisRequest request = new FlowAnalysisRequest(); // FlowAnalysisRequest | request
try {
    FlowAnalysisRequestResultOutput result = apiInstance.postFlowAnalysis(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#postFlowAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**FlowAnalysisRequest**](FlowAnalysisRequest.md)| request |

### Return type

[**FlowAnalysisRequestResultOutput**](FlowAnalysisRequestResultOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSnmpProperty"></a>
# **postSnmpProperty**
> TaskIdResult postSnmpProperty(request)

Creates or updates SNMP properties

This method is used to add SNMP properties

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.MiscApi;


MiscApi apiInstance = new MiscApi();
SystemPropertyNameAndIntValueDTO request = new SystemPropertyNameAndIntValueDTO(); // SystemPropertyNameAndIntValueDTO | request
try {
    TaskIdResult result = apiInstance.postSnmpProperty(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#postSnmpProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SystemPropertyNameAndIntValueDTO**](SystemPropertyNameAndIntValueDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

