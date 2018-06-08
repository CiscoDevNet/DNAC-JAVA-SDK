# OnboardingApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOnboardingPnpDeviceById**](OnboardingApi.md#deleteOnboardingPnpDeviceById) | **DELETE** /api/v1/onboarding/pnp-device/${id} | Delete Device
[**deleteOnboardingPnpSettingsVacct**](OnboardingApi.md#deleteOnboardingPnpSettingsVacct) | **DELETE** /api/v1/onboarding/pnp-settings/vacct | Deregister Virtual Account
[**deleteOnboardingPnpWorkflowById**](OnboardingApi.md#deleteOnboardingPnpWorkflowById) | **DELETE** /api/v1/onboarding/pnp-workflow/${id} | Delete Workflow
[**getOnboardingPnpDevice**](OnboardingApi.md#getOnboardingPnpDevice) | **GET** /api/v1/onboarding/pnp-device | List devices
[**getOnboardingPnpDeviceById**](OnboardingApi.md#getOnboardingPnpDeviceById) | **GET** /api/v1/onboarding/pnp-device/${id} | Get Device by ID
[**getOnboardingPnpDeviceCcount**](OnboardingApi.md#getOnboardingPnpDeviceCcount) | **GET** /api/v1/onboarding/pnp-device/count | Get Device Count
[**getOnboardingPnpDeviceDashboardCount**](OnboardingApi.md#getOnboardingPnpDeviceDashboardCount) | **GET** /api/v1/onboarding/pnp-device/dashboard/count | Get Categorized Device Count
[**getOnboardingPnpDeviceHistory**](OnboardingApi.md#getOnboardingPnpDeviceHistory) | **GET** /api/v1/onboarding/pnp-device/history | Get Device History
[**getOnboardingPnpDeviceSacctVacctSyncResultByDomainAndName**](OnboardingApi.md#getOnboardingPnpDeviceSacctVacctSyncResultByDomainAndName) | **GET** /api/v1/onboarding/pnp-device/sacct/${domain}/vacct/${name}/sync-result | Get Sync Result for Virtual Account
[**getOnboardingPnpSettings**](OnboardingApi.md#getOnboardingPnpSettings) | **GET** /api/v1/onboarding/pnp-settings | View Settings
[**getOnboardingPnpSettingsSacct**](OnboardingApi.md#getOnboardingPnpSettingsSacct) | **GET** /api/v1/onboarding/pnp-settings/sacct | Get Smart Account List
[**getOnboardingPnpSettingsSacctVacctByDomain**](OnboardingApi.md#getOnboardingPnpSettingsSacctVacctByDomain) | **GET** /api/v1/onboarding/pnp-settings/sacct/${domain}/vacct | Get Virtual Account List
[**getOnboardingPnpWorkflow**](OnboardingApi.md#getOnboardingPnpWorkflow) | **GET** /api/v1/onboarding/pnp-workflow | List Workflows
[**getOnboardingPnpWorkflowById**](OnboardingApi.md#getOnboardingPnpWorkflowById) | **GET** /api/v1/onboarding/pnp-workflow/${id} | Get Workflow
[**getOnboardingPnpWorkflowCount**](OnboardingApi.md#getOnboardingPnpWorkflowCount) | **GET** /api/v1/onboarding/pnp-workflow/count | Get Workflow Count
[**postOnboardingPnpDevice**](OnboardingApi.md#postOnboardingPnpDevice) | **POST** /api/v1/onboarding/pnp-device | Create Device
[**postOnboardingPnpDeviceClaim**](OnboardingApi.md#postOnboardingPnpDeviceClaim) | **POST** /api/v1/onboarding/pnp-device/claim | Claim Device(s)
[**postOnboardingPnpDeviceImport**](OnboardingApi.md#postOnboardingPnpDeviceImport) | **POST** /api/v1/onboarding/pnp-device/import | Import Many Devices
[**postOnboardingPnpDeviceProvision**](OnboardingApi.md#postOnboardingPnpDeviceProvision) | **POST** /api/v1/onboarding/pnp-device/provision | Provision Device
[**postOnboardingPnpDeviceReset**](OnboardingApi.md#postOnboardingPnpDeviceReset) | **POST** /api/v1/onboarding/pnp-device/reset | Reset Device
[**postOnboardingPnpDeviceUnclaim**](OnboardingApi.md#postOnboardingPnpDeviceUnclaim) | **POST** /api/v1/onboarding/pnp-device/unclaim | Un-Claim Device
[**postOnboardingPnpDeviceVacctSync**](OnboardingApi.md#postOnboardingPnpDeviceVacctSync) | **POST** /api/v1/onboarding/pnp-device/vacct-sync | Sync Virtual Account Devices
[**postOnboardingPnpSettingsSavacct**](OnboardingApi.md#postOnboardingPnpSettingsSavacct) | **POST** /api/v1/onboarding/pnp-settings/savacct | Add Virtual Account
[**postOnboardingPnpWorkflow**](OnboardingApi.md#postOnboardingPnpWorkflow) | **POST** /api/v1/onboarding/pnp-workflow | Create Workflow
[**putOnboardingPnpDeviceById**](OnboardingApi.md#putOnboardingPnpDeviceById) | **PUT** /api/v1/onboarding/pnp-device/${id} | Update Device
[**putOnboardingPnpSettings**](OnboardingApi.md#putOnboardingPnpSettings) | **PUT** /api/v1/onboarding/pnp-settings | Update Settings
[**putOnboardingPnpSettingsSavacct**](OnboardingApi.md#putOnboardingPnpSettingsSavacct) | **PUT** /api/v1/onboarding/pnp-settings/savacct | Edit PnP Server Profile
[**putOnboardingPnpWorkflowById**](OnboardingApi.md#putOnboardingPnpWorkflowById) | **PUT** /api/v1/onboarding/pnp-workflow/${id} | Update Workflow


<a name="deleteOnboardingPnpDeviceById"></a>
# **deleteOnboardingPnpDeviceById**
> DeleteDeviceResponse deleteOnboardingPnpDeviceById(id)

Delete Device

This API is used to delete the specified device from the database.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
String id = "id_example"; // String | id
try {
    DeleteDeviceResponse result = apiInstance.deleteOnboardingPnpDeviceById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#deleteOnboardingPnpDeviceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**DeleteDeviceResponse**](DeleteDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOnboardingPnpSettingsVacct"></a>
# **deleteOnboardingPnpSettingsVacct**
> DeregisterVirtualAccountResponse deleteOnboardingPnpSettingsVacct(domain, name)

Deregister Virtual Account

This API is used to deregister the specified smart account &amp; virtual account info and the associated device information from the PnP System &amp; database. The devices associated with the deregistered virtual account are removed from the PnP database as well. The deregistered smart &amp; virtual account info is returned in the response.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
String domain = "domain_example"; // String | Smart Account Domain
String name = "name_example"; // String | Virtual Account Name
try {
    DeregisterVirtualAccountResponse result = apiInstance.deleteOnboardingPnpSettingsVacct(domain, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#deleteOnboardingPnpSettingsVacct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| Smart Account Domain |
 **name** | **String**| Virtual Account Name |

### Return type

[**DeregisterVirtualAccountResponse**](DeregisterVirtualAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOnboardingPnpWorkflowById"></a>
# **deleteOnboardingPnpWorkflowById**
> DeleteWorkflowResponse deleteOnboardingPnpWorkflowById(id)

Delete Workflow

Delete a workflow given its id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
String id = "id_example"; // String | id
try {
    DeleteWorkflowResponse result = apiInstance.deleteOnboardingPnpWorkflowById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#deleteOnboardingPnpWorkflowById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**DeleteWorkflowResponse**](DeleteWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpDevice"></a>
# **getOnboardingPnpDevice**
> ListDevicesResponse getOnboardingPnpDevice(limit, offset, sort, sortOrder, serialNumber, state, onbState, cmState, name, pid, source, projectId, workflowId, projectName, workflowName, smartAccountId, virtualAccountId, lastContact)

List devices

This API is used to get the list of devices that match the provided filter. Pagination and sorting are also supported. If a limit is not specified, it will default to return 50 devices.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
Integer limit = 56; // Integer | Limits number of results
Integer offset = 56; // Integer | Index of first result
List<String> sort = Arrays.asList("sort_example"); // List<String> | Comma seperated list of fields to sort on
String sortOrder = "sortOrder_example"; // String | Sort Order Ascending (asc) or Descending (des)
List<String> serialNumber = Arrays.asList("serialNumber_example"); // List<String> | Device Serial Number
List<String> state = Arrays.asList("state_example"); // List<String> | Device State
List<String> onbState = Arrays.asList("onbState_example"); // List<String> | Device Onboarding State
List<String> cmState = Arrays.asList("cmState_example"); // List<String> | Device Connection Manager State
List<String> name = Arrays.asList("name_example"); // List<String> | Device Name
List<String> pid = Arrays.asList("pid_example"); // List<String> | Device ProductId
List<String> source = Arrays.asList("source_example"); // List<String> | Device Source
List<String> projectId = Arrays.asList("projectId_example"); // List<String> | Device Project Id
List<String> workflowId = Arrays.asList("workflowId_example"); // List<String> | Device Workflow Id
List<String> projectName = Arrays.asList("projectName_example"); // List<String> | Device Project Name
List<String> workflowName = Arrays.asList("workflowName_example"); // List<String> | Device Workflow Name
List<String> smartAccountId = Arrays.asList("smartAccountId_example"); // List<String> | Device Smart Account
List<String> virtualAccountId = Arrays.asList("virtualAccountId_example"); // List<String> | Device Virtual Account
Boolean lastContact = true; // Boolean | Device Has Contacted lastContact > 0
try {
    ListDevicesResponse result = apiInstance.getOnboardingPnpDevice(limit, offset, sort, sortOrder, serialNumber, state, onbState, cmState, name, pid, source, projectId, workflowId, projectName, workflowName, smartAccountId, virtualAccountId, lastContact);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits number of results | [optional]
 **offset** | **Integer**| Index of first result | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Comma seperated list of fields to sort on | [optional]
 **sortOrder** | **String**| Sort Order Ascending (asc) or Descending (des) | [optional]
 **serialNumber** | [**List&lt;String&gt;**](String.md)| Device Serial Number | [optional]
 **state** | [**List&lt;String&gt;**](String.md)| Device State | [optional]
 **onbState** | [**List&lt;String&gt;**](String.md)| Device Onboarding State | [optional]
 **cmState** | [**List&lt;String&gt;**](String.md)| Device Connection Manager State | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Device Name | [optional]
 **pid** | [**List&lt;String&gt;**](String.md)| Device ProductId | [optional]
 **source** | [**List&lt;String&gt;**](String.md)| Device Source | [optional]
 **projectId** | [**List&lt;String&gt;**](String.md)| Device Project Id | [optional]
 **workflowId** | [**List&lt;String&gt;**](String.md)| Device Workflow Id | [optional]
 **projectName** | [**List&lt;String&gt;**](String.md)| Device Project Name | [optional]
 **workflowName** | [**List&lt;String&gt;**](String.md)| Device Workflow Name | [optional]
 **smartAccountId** | [**List&lt;String&gt;**](String.md)| Device Smart Account | [optional]
 **virtualAccountId** | [**List&lt;String&gt;**](String.md)| Device Virtual Account | [optional]
 **lastContact** | **Boolean**| Device Has Contacted lastContact &gt; 0 | [optional]

### Return type

[**ListDevicesResponse**](ListDevicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpDeviceById"></a>
# **getOnboardingPnpDeviceById**
> GetDeviceByIDResponse getOnboardingPnpDeviceById(id)

Get Device by ID

Get device details of the device with input device id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
String id = "id_example"; // String | id
try {
    GetDeviceByIDResponse result = apiInstance.getOnboardingPnpDeviceById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpDeviceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**GetDeviceByIDResponse**](GetDeviceByIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpDeviceCcount"></a>
# **getOnboardingPnpDeviceCcount**
> GetDeviceCountResponse getOnboardingPnpDeviceCcount(serialNumber, state, onbState, cmState, name, pid, source, projectId, workflowId, projectName, workflowName, smartAccountId, virtualAccountId, lastContact)

Get Device Count

This API is used to get the number of the devices matching provided filters. This is useful for pageination.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
List<String> serialNumber = Arrays.asList("serialNumber_example"); // List<String> | Device Serial Number
List<String> state = Arrays.asList("state_example"); // List<String> | Device State
List<String> onbState = Arrays.asList("onbState_example"); // List<String> | Device Onboarding State
List<String> cmState = Arrays.asList("cmState_example"); // List<String> | Device Connection Manager State
List<String> name = Arrays.asList("name_example"); // List<String> | Device Name
List<String> pid = Arrays.asList("pid_example"); // List<String> | Device ProductId
List<String> source = Arrays.asList("source_example"); // List<String> | Device Source
List<String> projectId = Arrays.asList("projectId_example"); // List<String> | Device Project Id
List<String> workflowId = Arrays.asList("workflowId_example"); // List<String> | Device Workflow Id
List<String> projectName = Arrays.asList("projectName_example"); // List<String> | Device Project Name
List<String> workflowName = Arrays.asList("workflowName_example"); // List<String> | Device Workflow Name
List<String> smartAccountId = Arrays.asList("smartAccountId_example"); // List<String> | Device Smart Account
List<String> virtualAccountId = Arrays.asList("virtualAccountId_example"); // List<String> | Device Virtual Account
Boolean lastContact = true; // Boolean | Device Has Contacted lastContact > 0
try {
    GetDeviceCountResponse result = apiInstance.getOnboardingPnpDeviceCcount(serialNumber, state, onbState, cmState, name, pid, source, projectId, workflowId, projectName, workflowName, smartAccountId, virtualAccountId, lastContact);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpDeviceCcount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | [**List&lt;String&gt;**](String.md)| Device Serial Number | [optional]
 **state** | [**List&lt;String&gt;**](String.md)| Device State | [optional]
 **onbState** | [**List&lt;String&gt;**](String.md)| Device Onboarding State | [optional]
 **cmState** | [**List&lt;String&gt;**](String.md)| Device Connection Manager State | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Device Name | [optional]
 **pid** | [**List&lt;String&gt;**](String.md)| Device ProductId | [optional]
 **source** | [**List&lt;String&gt;**](String.md)| Device Source | [optional]
 **projectId** | [**List&lt;String&gt;**](String.md)| Device Project Id | [optional]
 **workflowId** | [**List&lt;String&gt;**](String.md)| Device Workflow Id | [optional]
 **projectName** | [**List&lt;String&gt;**](String.md)| Device Project Name | [optional]
 **workflowName** | [**List&lt;String&gt;**](String.md)| Device Workflow Name | [optional]
 **smartAccountId** | [**List&lt;String&gt;**](String.md)| Device Smart Account | [optional]
 **virtualAccountId** | [**List&lt;String&gt;**](String.md)| Device Virtual Account | [optional]
 **lastContact** | **Boolean**| Device Has Contacted lastContact &gt; 0 | [optional]

### Return type

[**GetDeviceCountResponse**](GetDeviceCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpDeviceDashboardCount"></a>
# **getOnboardingPnpDeviceDashboardCount**
> GetCategorizedDeviceCountResponse getOnboardingPnpDeviceDashboardCount(category)

Get Categorized Device Count

Get Categorized Device Count

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
String category = "category_example"; // String | Valid Values: state, errorState, onbState or source
try {
    GetCategorizedDeviceCountResponse result = apiInstance.getOnboardingPnpDeviceDashboardCount(category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpDeviceDashboardCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**| Valid Values: state, errorState, onbState or source |

### Return type

[**GetCategorizedDeviceCountResponse**](GetCategorizedDeviceCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpDeviceHistory"></a>
# **getOnboardingPnpDeviceHistory**
> GetDeviceHistoryResponse getOnboardingPnpDeviceHistory(serialNumber, sort, sortOrder)

Get Device History

Retrieves history for a specific device. Serial Number is a required parameter

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
String serialNumber = "serialNumber_example"; // String | Device Serial Number
List<String> sort = Arrays.asList("sort_example"); // List<String> | Comma seperated list of fields to sort on
String sortOrder = "sortOrder_example"; // String | Sort Order Ascending (asc) or Descending (des)
try {
    GetDeviceHistoryResponse result = apiInstance.getOnboardingPnpDeviceHistory(serialNumber, sort, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpDeviceHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | **String**| Device Serial Number |
 **sort** | [**List&lt;String&gt;**](String.md)| Comma seperated list of fields to sort on | [optional]
 **sortOrder** | **String**| Sort Order Ascending (asc) or Descending (des) | [optional]

### Return type

[**GetDeviceHistoryResponse**](GetDeviceHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpDeviceSacctVacctSyncResultByDomainAndName"></a>
# **getOnboardingPnpDeviceSacctVacctSyncResultByDomainAndName**
> GetSyncResultForVirtualAccountResponse getOnboardingPnpDeviceSacctVacctSyncResultByDomainAndName(domain, name)

Get Sync Result for Virtual Account

This API is used to get the device sync info from the given smart account &amp; virtual account with the PnP database. The SAVAMapping object which has the list of devices synced since the last sync is returned in the response.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
String domain = "domain_example"; // String | Smart Account Domain
String name = "name_example"; // String | Virtual Account Name
try {
    GetSyncResultForVirtualAccountResponse result = apiInstance.getOnboardingPnpDeviceSacctVacctSyncResultByDomainAndName(domain, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpDeviceSacctVacctSyncResultByDomainAndName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| Smart Account Domain |
 **name** | **String**| Virtual Account Name |

### Return type

[**GetSyncResultForVirtualAccountResponse**](GetSyncResultForVirtualAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpSettings"></a>
# **getOnboardingPnpSettings**
> ViewSettingsResponse getOnboardingPnpSettings()

View Settings

Get this user&#39;s list of global PnP settings

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
try {
    ViewSettingsResponse result = apiInstance.getOnboardingPnpSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ViewSettingsResponse**](ViewSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpSettingsSacct"></a>
# **getOnboardingPnpSettingsSacct**
> GetSmartAccountListResponse getOnboardingPnpSettingsSacct()

Get Smart Account List

This API is used to get list of Smart Accounts. The list of smart account domains is returned in the response.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
try {
    GetSmartAccountListResponse result = apiInstance.getOnboardingPnpSettingsSacct();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpSettingsSacct");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSmartAccountListResponse**](GetSmartAccountListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpSettingsSacctVacctByDomain"></a>
# **getOnboardingPnpSettingsSacctVacctByDomain**
> GetVirtualAccountListResponse getOnboardingPnpSettingsSacctVacctByDomain(domain)

Get Virtual Account List

This API is used to get list of Virtual Accounts associated with the specified Smart Account. The list of virtual account names is returned in the response.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
String domain = "domain_example"; // String | Smart Account Domain
try {
    GetVirtualAccountListResponse result = apiInstance.getOnboardingPnpSettingsSacctVacctByDomain(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpSettingsSacctVacctByDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| Smart Account Domain |

### Return type

[**GetVirtualAccountListResponse**](GetVirtualAccountListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpWorkflow"></a>
# **getOnboardingPnpWorkflow**
> ListWorkflowsResponse getOnboardingPnpWorkflow(limit, offset, sort, sortOrder, type, name)

List Workflows

This API is used to get the list of workflows that match the provided filter. Pagination and sorting are also supported. If a limit is not specified, it will default to return 50 workflows.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
Integer limit = 56; // Integer | Limits number of results
Integer offset = 56; // Integer | Index of first result
List<String> sort = Arrays.asList("sort_example"); // List<String> | Comma seperated lost of fields to sort on
String sortOrder = "sortOrder_example"; // String | Sort Order Ascending (asc) or Descending (des)
List<String> type = Arrays.asList("type_example"); // List<String> | Workflow Type
List<String> name = Arrays.asList("name_example"); // List<String> | Workflow Name
try {
    ListWorkflowsResponse result = apiInstance.getOnboardingPnpWorkflow(limit, offset, sort, sortOrder, type, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits number of results | [optional]
 **offset** | **Integer**| Index of first result | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Comma seperated lost of fields to sort on | [optional]
 **sortOrder** | **String**| Sort Order Ascending (asc) or Descending (des) | [optional]
 **type** | [**List&lt;String&gt;**](String.md)| Workflow Type | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Workflow Name | [optional]

### Return type

[**ListWorkflowsResponse**](ListWorkflowsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpWorkflowById"></a>
# **getOnboardingPnpWorkflowById**
> GetWorkflowResponse getOnboardingPnpWorkflowById(id)

Get Workflow

Get a workflow given its id

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
String id = "id_example"; // String | id
try {
    GetWorkflowResponse result = apiInstance.getOnboardingPnpWorkflowById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpWorkflowById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**GetWorkflowResponse**](GetWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnboardingPnpWorkflowCount"></a>
# **getOnboardingPnpWorkflowCount**
> GetWorkflowCountResponse getOnboardingPnpWorkflowCount(name)

Get Workflow Count

This API is used to get the number of the workflows.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Workflow Name
try {
    GetWorkflowCountResponse result = apiInstance.getOnboardingPnpWorkflowCount(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingPnpWorkflowCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**List&lt;String&gt;**](String.md)| Workflow Name | [optional]

### Return type

[**GetWorkflowCountResponse**](GetWorkflowCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOnboardingPnpDevice"></a>
# **postOnboardingPnpDevice**
> CreateDeviceResponse postOnboardingPnpDevice(request)

Create Device

This API is used to add a Planned device to the PnP database. A Planned device is a device that the customer has bought and/or is planning to manage.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
Device request = new Device(); // Device | request
try {
    CreateDeviceResponse result = apiInstance.postOnboardingPnpDevice(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#postOnboardingPnpDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Device**](Device.md)| request |

### Return type

[**CreateDeviceResponse**](CreateDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOnboardingPnpDeviceClaim"></a>
# **postOnboardingPnpDeviceClaim**
> ClaimDevicesResponse postOnboardingPnpDeviceClaim(request)

Claim Device(s)

This API is used to assign a project &amp; workflow (i.e. claim) one of more devices.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
ClaimDeviceRequest request = new ClaimDeviceRequest(); // ClaimDeviceRequest | request
try {
    ClaimDevicesResponse result = apiInstance.postOnboardingPnpDeviceClaim(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#postOnboardingPnpDeviceClaim");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ClaimDeviceRequest**](ClaimDeviceRequest.md)| request |

### Return type

[**ClaimDevicesResponse**](ClaimDevicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOnboardingPnpDeviceImport"></a>
# **postOnboardingPnpDeviceImport**
> ImportManyDevicesResponse postOnboardingPnpDeviceImport(request)

Import Many Devices

This API is used to import a list of Planned devices to the PnP database. A Planned device is a device that the customer has bought and/or is planning to manage.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
Device request = new Device(); // Device | request
try {
    ImportManyDevicesResponse result = apiInstance.postOnboardingPnpDeviceImport(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#postOnboardingPnpDeviceImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Device**](Device.md)| request |

### Return type

[**ImportManyDevicesResponse**](ImportManyDevicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOnboardingPnpDeviceProvision"></a>
# **postOnboardingPnpDeviceProvision**
> ProvisionDeviceResponse postOnboardingPnpDeviceProvision(request)

Provision Device

This API is used push one or more devices to Provisoned state and add them to inventory.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
PushProvisionRequest request = new PushProvisionRequest(); // PushProvisionRequest | request
try {
    ProvisionDeviceResponse result = apiInstance.postOnboardingPnpDeviceProvision(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#postOnboardingPnpDeviceProvision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PushProvisionRequest**](PushProvisionRequest.md)| request |

### Return type

[**ProvisionDeviceResponse**](ProvisionDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOnboardingPnpDeviceReset"></a>
# **postOnboardingPnpDeviceReset**
> ResetDeviceResponse postOnboardingPnpDeviceReset(request)

Reset Device

This API is used to recover a device from a Workflow Execution Error state.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
ResetRequest request = new ResetRequest(); // ResetRequest | request
try {
    ResetDeviceResponse result = apiInstance.postOnboardingPnpDeviceReset(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#postOnboardingPnpDeviceReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ResetRequest**](ResetRequest.md)| request |

### Return type

[**ResetDeviceResponse**](ResetDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOnboardingPnpDeviceUnclaim"></a>
# **postOnboardingPnpDeviceUnclaim**
> UnClaimDeviceResponse postOnboardingPnpDeviceUnclaim(request)

Un-Claim Device

This API is used to unassign the project and workflow from one or more device.A device can only be unclaimed if it has not begun provisioning.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
UnclaimRequest request = new UnclaimRequest(); // UnclaimRequest | request
try {
    UnClaimDeviceResponse result = apiInstance.postOnboardingPnpDeviceUnclaim(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#postOnboardingPnpDeviceUnclaim");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UnclaimRequest**](UnclaimRequest.md)| request |

### Return type

[**UnClaimDeviceResponse**](UnClaimDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOnboardingPnpDeviceVacctSync"></a>
# **postOnboardingPnpDeviceVacctSync**
> SyncVirtualAccountDevicesResponse postOnboardingPnpDeviceVacctSync(request)

Sync Virtual Account Devices

This API is used to sync the device info from the given smart account &amp; virtual account with the PnP database. The list of synced devices is returned in the response.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
SAVAMapping request = new SAVAMapping(); // SAVAMapping | request
try {
    SyncVirtualAccountDevicesResponse result = apiInstance.postOnboardingPnpDeviceVacctSync(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#postOnboardingPnpDeviceVacctSync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SAVAMapping**](SAVAMapping.md)| request |

### Return type

[**SyncVirtualAccountDevicesResponse**](SyncVirtualAccountDevicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOnboardingPnpSettingsSavacct"></a>
# **postOnboardingPnpSettingsSavacct**
> AddVirtualAccountResponse postOnboardingPnpSettingsSavacct(request)

Add Virtual Account

This API is used to register a Smart Account, Virtual Account and the relevant server profile info with the PnP System &amp; database. The devices present in the registered virtual account are synced with the PnP database as well. The new profile is returned in the response.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
SAVAMapping request = new SAVAMapping(); // SAVAMapping | request
try {
    AddVirtualAccountResponse result = apiInstance.postOnboardingPnpSettingsSavacct(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#postOnboardingPnpSettingsSavacct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SAVAMapping**](SAVAMapping.md)| request |

### Return type

[**AddVirtualAccountResponse**](AddVirtualAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOnboardingPnpWorkflow"></a>
# **postOnboardingPnpWorkflow**
> CreateWorkflowResponse postOnboardingPnpWorkflow(request)

Create Workflow

This API is used to add a PnP Workflow along with the relevant tasks in the workflow into the PnP database.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
Workflow request = new Workflow(); // Workflow | request
try {
    CreateWorkflowResponse result = apiInstance.postOnboardingPnpWorkflow(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#postOnboardingPnpWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Workflow**](Workflow.md)| request |

### Return type

[**CreateWorkflowResponse**](CreateWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putOnboardingPnpDeviceById"></a>
# **putOnboardingPnpDeviceById**
> UpdateDeviceResponse putOnboardingPnpDeviceById(request, id)

Update Device

This API is used to update device details of a device that exists in the PnP database.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
Device request = new Device(); // Device | request
String id = "id_example"; // String | id
try {
    UpdateDeviceResponse result = apiInstance.putOnboardingPnpDeviceById(request, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#putOnboardingPnpDeviceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Device**](Device.md)| request |
 **id** | **String**| id |

### Return type

[**UpdateDeviceResponse**](UpdateDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putOnboardingPnpSettings"></a>
# **putOnboardingPnpSettings**
> UpdateSettingsResponse putOnboardingPnpSettings(request)

Update Settings

Change this user&#39;s list of global PnP settings

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
Settings request = new Settings(); // Settings | request
try {
    UpdateSettingsResponse result = apiInstance.putOnboardingPnpSettings(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#putOnboardingPnpSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Settings**](Settings.md)| request |

### Return type

[**UpdateSettingsResponse**](UpdateSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putOnboardingPnpSettingsSavacct"></a>
# **putOnboardingPnpSettingsSavacct**
> EditPnPServerProfileResponse putOnboardingPnpSettingsSavacct(request)

Edit PnP Server Profile

This API is used to edit the PnP Server profile in a registered Virtual Account in the PnP database.The edited smart &amp; virtual account info is returned in the response.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
SAVAMapping request = new SAVAMapping(); // SAVAMapping | request
try {
    EditPnPServerProfileResponse result = apiInstance.putOnboardingPnpSettingsSavacct(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#putOnboardingPnpSettingsSavacct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SAVAMapping**](SAVAMapping.md)| request |

### Return type

[**EditPnPServerProfileResponse**](EditPnPServerProfileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putOnboardingPnpWorkflowById"></a>
# **putOnboardingPnpWorkflowById**
> UpdateWorkflowResponse putOnboardingPnpWorkflowById(request, id)

Update Workflow

Update an existing workflow

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.OnboardingApi;


OnboardingApi apiInstance = new OnboardingApi();
Workflow request = new Workflow(); // Workflow | request
String id = "id_example"; // String | id
try {
    UpdateWorkflowResponse result = apiInstance.putOnboardingPnpWorkflowById(request, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#putOnboardingPnpWorkflowById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Workflow**](Workflow.md)| request |
 **id** | **String**| id |

### Return type

[**UpdateWorkflowResponse**](UpdateWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

