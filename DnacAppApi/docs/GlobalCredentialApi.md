# GlobalCredentialApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteGlobalCredentialByGlobalCredentialId**](GlobalCredentialApi.md#deleteGlobalCredentialByGlobalCredentialId) | **DELETE** /api/v1/global-credential/${globalCredentialId} | Retrieves global credential by ID
[**getGlobalCredential**](GlobalCredentialApi.md#getGlobalCredential) | **GET** /api/v1/global-credential | Retrieves global credential for the given credential sub type
[**getGlobalCredentialById**](GlobalCredentialApi.md#getGlobalCredentialById) | **GET** /api/v1/global-credential/${id} | Retrieves credential sub type for the given credential Id
[**postGlobalCredentialCli**](GlobalCredentialApi.md#postGlobalCredentialCli) | **POST** /api/v1/global-credential/cli | Creates global CLI credential
[**postGlobalCredentialHttpRead**](GlobalCredentialApi.md#postGlobalCredentialHttpRead) | **POST** /api/v1/global-credential/http-read | Creates global HTTP read credentials
[**postGlobalCredentialHttpWrite**](GlobalCredentialApi.md#postGlobalCredentialHttpWrite) | **POST** /api/v1/global-credential/http-write | Creates global HTTP write credentials
[**postGlobalCredentialNetconf**](GlobalCredentialApi.md#postGlobalCredentialNetconf) | **POST** /api/v1/global-credential/netconf | Creates global netconf credential
[**postGlobalCredentialSnmpv2ReadCommunity**](GlobalCredentialApi.md#postGlobalCredentialSnmpv2ReadCommunity) | **POST** /api/v1/global-credential/snmpv2-read-community | Creates global SNMP read community
[**postGlobalCredentialSnmpv2WriteCommunity**](GlobalCredentialApi.md#postGlobalCredentialSnmpv2WriteCommunity) | **POST** /api/v1/global-credential/snmpv2-write-community | Creates global SNMP write community
[**postGlobalCredentialSnmpv3**](GlobalCredentialApi.md#postGlobalCredentialSnmpv3) | **POST** /api/v1/global-credential/snmpv3 | Creates global SNMPv3 credential
[**putGlobalCredentialByGlobalCredentialId**](GlobalCredentialApi.md#putGlobalCredentialByGlobalCredentialId) | **PUT** /api/v1/global-credential/${globalCredentialId} | Update global credential for network devices in site(s)
[**putGlobalCredentialCli**](GlobalCredentialApi.md#putGlobalCredentialCli) | **PUT** /api/v1/global-credential/cli | Updates global CLI credential
[**putGlobalCredentialHttpRead**](GlobalCredentialApi.md#putGlobalCredentialHttpRead) | **PUT** /api/v1/global-credential/http-read | Updates global HTTP Read credential
[**putGlobalCredentialHttpWrite**](GlobalCredentialApi.md#putGlobalCredentialHttpWrite) | **PUT** /api/v1/global-credential/http-write | Updates global HTTP Write credential
[**putGlobalCredentialNetconf**](GlobalCredentialApi.md#putGlobalCredentialNetconf) | **PUT** /api/v1/global-credential/netconf | Updates global netconf credential
[**putGlobalCredentialSnmpv2ReadCommunity**](GlobalCredentialApi.md#putGlobalCredentialSnmpv2ReadCommunity) | **PUT** /api/v1/global-credential/snmpv2-read-community | Updates global SNMP read community
[**putGlobalCredentialSnmpv2WriteCommunity**](GlobalCredentialApi.md#putGlobalCredentialSnmpv2WriteCommunity) | **PUT** /api/v1/global-credential/snmpv2-write-community | Updates global SNMP write community
[**putGlobalCredentialSnmpv3**](GlobalCredentialApi.md#putGlobalCredentialSnmpv3) | **PUT** /api/v1/global-credential/snmpv3 | Updates global SNMPv3 credential


<a name="deleteGlobalCredentialByGlobalCredentialId"></a>
# **deleteGlobalCredentialByGlobalCredentialId**
> TaskIdResult deleteGlobalCredentialByGlobalCredentialId(globalCredentialId)

Retrieves global credential by ID

This method is used to delete global credential for the given ID

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
String globalCredentialId = "globalCredentialId_example"; // String | ID of global-credential
try {
    TaskIdResult result = apiInstance.deleteGlobalCredentialByGlobalCredentialId(globalCredentialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#deleteGlobalCredentialByGlobalCredentialId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **globalCredentialId** | **String**| ID of global-credential |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGlobalCredential"></a>
# **getGlobalCredential**
> GlobalCredentialListResult getGlobalCredential(credentialSubType, sortBy, order)

Retrieves global credential for the given credential sub type

This method is used to get global credential for the given credential sub type

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
String credentialSubType = "credentialSubType_example"; // String | Credential type as CLI / SNMPV2_READ_COMMUNITY / SNMPV2_WRITE_COMMUNITY / SNMPV3 / HTTP_WRITE / HTTP_READ / NETCONF
String sortBy = "sortBy_example"; // String | sortBy
String order = "order_example"; // String | order
try {
    GlobalCredentialListResult result = apiInstance.getGlobalCredential(credentialSubType, sortBy, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#getGlobalCredential");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentialSubType** | **String**| Credential type as CLI / SNMPV2_READ_COMMUNITY / SNMPV2_WRITE_COMMUNITY / SNMPV3 / HTTP_WRITE / HTTP_READ / NETCONF | [optional]
 **sortBy** | **String**| sortBy | [optional]
 **order** | **String**| order | [optional]

### Return type

[**GlobalCredentialListResult**](GlobalCredentialListResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGlobalCredentialById"></a>
# **getGlobalCredentialById**
> GlobalCredentialSubTypeResult getGlobalCredentialById(id)

Retrieves credential sub type for the given credential Id

This method is used to get credential sub type for the given Id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
String id = "id_example"; // String | Global Credential ID
try {
    GlobalCredentialSubTypeResult result = apiInstance.getGlobalCredentialById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#getGlobalCredentialById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Global Credential ID |

### Return type

[**GlobalCredentialSubTypeResult**](GlobalCredentialSubTypeResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGlobalCredentialCli"></a>
# **postGlobalCredentialCli**
> TaskIdResult postGlobalCredentialCli(request)

Creates global CLI credential

This method is used to add global CLI credential

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
CLICredentialDTO request = new CLICredentialDTO(); // CLICredentialDTO | request
try {
    TaskIdResult result = apiInstance.postGlobalCredentialCli(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#postGlobalCredentialCli");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CLICredentialDTO**](CLICredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGlobalCredentialHttpRead"></a>
# **postGlobalCredentialHttpRead**
> TaskIdResult postGlobalCredentialHttpRead(request)

Creates global HTTP read credentials

This method is used to add HTTP read credentials

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
HTTPReadCredentialDTO request = new HTTPReadCredentialDTO(); // HTTPReadCredentialDTO | request
try {
    TaskIdResult result = apiInstance.postGlobalCredentialHttpRead(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#postGlobalCredentialHttpRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**HTTPReadCredentialDTO**](HTTPReadCredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGlobalCredentialHttpWrite"></a>
# **postGlobalCredentialHttpWrite**
> TaskIdResult postGlobalCredentialHttpWrite(request)

Creates global HTTP write credentials

This method is used to add global HTTP write credentials

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
HTTPWriteCredentialDTO request = new HTTPWriteCredentialDTO(); // HTTPWriteCredentialDTO | request
try {
    TaskIdResult result = apiInstance.postGlobalCredentialHttpWrite(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#postGlobalCredentialHttpWrite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**HTTPWriteCredentialDTO**](HTTPWriteCredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGlobalCredentialNetconf"></a>
# **postGlobalCredentialNetconf**
> TaskIdResult postGlobalCredentialNetconf(request)

Creates global netconf credential

This method is used to add global netconf credential

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
NetconfCredentialDTO request = new NetconfCredentialDTO(); // NetconfCredentialDTO | request
try {
    TaskIdResult result = apiInstance.postGlobalCredentialNetconf(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#postGlobalCredentialNetconf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**NetconfCredentialDTO**](NetconfCredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGlobalCredentialSnmpv2ReadCommunity"></a>
# **postGlobalCredentialSnmpv2ReadCommunity**
> TaskIdResult postGlobalCredentialSnmpv2ReadCommunity(request)

Creates global SNMP read community

This method is used to add global SNMP read community

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
SNMPvReadCommunityDTO request = new SNMPvReadCommunityDTO(); // SNMPvReadCommunityDTO | request
try {
    TaskIdResult result = apiInstance.postGlobalCredentialSnmpv2ReadCommunity(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#postGlobalCredentialSnmpv2ReadCommunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SNMPvReadCommunityDTO**](SNMPvReadCommunityDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGlobalCredentialSnmpv2WriteCommunity"></a>
# **postGlobalCredentialSnmpv2WriteCommunity**
> TaskIdResult postGlobalCredentialSnmpv2WriteCommunity(request)

Creates global SNMP write community

This method is used to add global SNMP write community

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
SNMPvWriteCommunityDTO request = new SNMPvWriteCommunityDTO(); // SNMPvWriteCommunityDTO | request
try {
    TaskIdResult result = apiInstance.postGlobalCredentialSnmpv2WriteCommunity(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#postGlobalCredentialSnmpv2WriteCommunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SNMPvWriteCommunityDTO**](SNMPvWriteCommunityDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGlobalCredentialSnmpv3"></a>
# **postGlobalCredentialSnmpv3**
> TaskIdResult postGlobalCredentialSnmpv3(request)

Creates global SNMPv3 credential

This method is used to add global SNMPv3 credential

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
SNMPvCredentialDTO request = new SNMPvCredentialDTO(); // SNMPvCredentialDTO | request
try {
    TaskIdResult result = apiInstance.postGlobalCredentialSnmpv3(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#postGlobalCredentialSnmpv3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SNMPvCredentialDTO**](SNMPvCredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putGlobalCredentialByGlobalCredentialId"></a>
# **putGlobalCredentialByGlobalCredentialId**
> TaskIdResult putGlobalCredentialByGlobalCredentialId(request, globalCredentialId)

Update global credential for network devices in site(s)

Update global credential for network devices in site(s)

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
SitesInfoDTO request = new SitesInfoDTO(); // SitesInfoDTO | request
String globalCredentialId = "globalCredentialId_example"; // String | Global credential Uuid
try {
    TaskIdResult result = apiInstance.putGlobalCredentialByGlobalCredentialId(request, globalCredentialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#putGlobalCredentialByGlobalCredentialId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SitesInfoDTO**](SitesInfoDTO.md)| request |
 **globalCredentialId** | **String**| Global credential Uuid |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putGlobalCredentialCli"></a>
# **putGlobalCredentialCli**
> TaskIdResult putGlobalCredentialCli(request)

Updates global CLI credential

This method is used to update global CLI credential

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
CLICredentialDTO request = new CLICredentialDTO(); // CLICredentialDTO | request
try {
    TaskIdResult result = apiInstance.putGlobalCredentialCli(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#putGlobalCredentialCli");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CLICredentialDTO**](CLICredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putGlobalCredentialHttpRead"></a>
# **putGlobalCredentialHttpRead**
> TaskIdResult putGlobalCredentialHttpRead(request)

Updates global HTTP Read credential

This method is used to update global HTTP Read credential

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
HTTPReadCredentialDTO request = new HTTPReadCredentialDTO(); // HTTPReadCredentialDTO | request
try {
    TaskIdResult result = apiInstance.putGlobalCredentialHttpRead(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#putGlobalCredentialHttpRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**HTTPReadCredentialDTO**](HTTPReadCredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putGlobalCredentialHttpWrite"></a>
# **putGlobalCredentialHttpWrite**
> TaskIdResult putGlobalCredentialHttpWrite(request)

Updates global HTTP Write credential

This method is used to update global HTTP Write credential

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
HTTPWriteCredentialDTO request = new HTTPWriteCredentialDTO(); // HTTPWriteCredentialDTO | request
try {
    TaskIdResult result = apiInstance.putGlobalCredentialHttpWrite(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#putGlobalCredentialHttpWrite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**HTTPWriteCredentialDTO**](HTTPWriteCredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putGlobalCredentialNetconf"></a>
# **putGlobalCredentialNetconf**
> TaskIdResult putGlobalCredentialNetconf(request)

Updates global netconf credential

This method is used to update global netconf credential

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
NetconfCredentialDTO request = new NetconfCredentialDTO(); // NetconfCredentialDTO | request
try {
    TaskIdResult result = apiInstance.putGlobalCredentialNetconf(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#putGlobalCredentialNetconf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**NetconfCredentialDTO**](NetconfCredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putGlobalCredentialSnmpv2ReadCommunity"></a>
# **putGlobalCredentialSnmpv2ReadCommunity**
> TaskIdResult putGlobalCredentialSnmpv2ReadCommunity(request)

Updates global SNMP read community

This method is used to update global SNMP read community

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
SNMPvReadCommunityDTO request = new SNMPvReadCommunityDTO(); // SNMPvReadCommunityDTO | request
try {
    TaskIdResult result = apiInstance.putGlobalCredentialSnmpv2ReadCommunity(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#putGlobalCredentialSnmpv2ReadCommunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SNMPvReadCommunityDTO**](SNMPvReadCommunityDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putGlobalCredentialSnmpv2WriteCommunity"></a>
# **putGlobalCredentialSnmpv2WriteCommunity**
> TaskIdResult putGlobalCredentialSnmpv2WriteCommunity(request)

Updates global SNMP write community

This method is used to update global SNMP write community

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
SNMPvWriteCommunityDTO request = new SNMPvWriteCommunityDTO(); // SNMPvWriteCommunityDTO | request
try {
    TaskIdResult result = apiInstance.putGlobalCredentialSnmpv2WriteCommunity(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#putGlobalCredentialSnmpv2WriteCommunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SNMPvWriteCommunityDTO**](SNMPvWriteCommunityDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putGlobalCredentialSnmpv3"></a>
# **putGlobalCredentialSnmpv3**
> TaskIdResult putGlobalCredentialSnmpv3(request)

Updates global SNMPv3 credential

This method is used to update global SNMPv3 credential

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.GlobalCredentialApi;


GlobalCredentialApi apiInstance = new GlobalCredentialApi();
SNMPvCredentialDTO request = new SNMPvCredentialDTO(); // SNMPvCredentialDTO | request
try {
    TaskIdResult result = apiInstance.putGlobalCredentialSnmpv3(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCredentialApi#putGlobalCredentialSnmpv3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SNMPvCredentialDTO**](SNMPvCredentialDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

