# TemplateProgrammerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTemplateProgrammerProjectByProjectId**](TemplateProgrammerApi.md#deleteTemplateProgrammerProjectByProjectId) | **DELETE** /api/v1/template-programmer/project/${projectId} | Deletes the project
[**deleteTemplateProgrammerTemplateByTemplateId**](TemplateProgrammerApi.md#deleteTemplateProgrammerTemplateByTemplateId) | **DELETE** /api/v1/template-programmer/template/${templateId} | Deletes the template
[**getTemplateProgrammerProject**](TemplateProgrammerApi.md#getTemplateProgrammerProject) | **GET** /api/v1/template-programmer/project | Gets a list of projects
[**getTemplateProgrammerTemplate**](TemplateProgrammerApi.md#getTemplateProgrammerTemplate) | **GET** /api/v1/template-programmer/template | Gets the templates available depending on the criteria
[**getTemplateProgrammerTemplateDeployStatusByDeploymentId**](TemplateProgrammerApi.md#getTemplateProgrammerTemplateDeployStatusByDeploymentId) | **GET** /api/v1/template-programmer/template/deploy/status/${deploymentId} | Status of template deployment
[**getTemplateProgrammerTemplateVersionByTempleteId**](TemplateProgrammerApi.md#getTemplateProgrammerTemplateVersionByTempleteId) | **GET** /api/v1/template-programmer/template/version/${templateId} | Gets all the versions of a given template
[**postTemplateProgrammerProject**](TemplateProgrammerApi.md#postTemplateProgrammerProject) | **POST** /api/v1/template-programmer/project | Create Project
[**postTemplateProgrammerProjectTemplateByProjectId**](TemplateProgrammerApi.md#postTemplateProgrammerProjectTemplateByProjectId) | **POST** /api/v1/template-programmer/project/${projectId}/template | Create Template
[**postTemplateProgrammerTemplateDeploy**](TemplateProgrammerApi.md#postTemplateProgrammerTemplateDeploy) | **POST** /api/v1/template-programmer/template/deploy | Deploy Template
[**postTemplateProgrammerTemplateVersion**](TemplateProgrammerApi.md#postTemplateProgrammerTemplateVersion) | **POST** /api/v1/template-programmer/template/version | Version Template
[**putTemplateProgrammerProject**](TemplateProgrammerApi.md#putTemplateProgrammerProject) | **PUT** /api/v1/template-programmer/project | Update Project
[**putTemplateProgrammerTemplate**](TemplateProgrammerApi.md#putTemplateProgrammerTemplate) | **PUT** /api/v1/template-programmer/template | Update Template
[**putTemplateProgrammerTemplatePreview**](TemplateProgrammerApi.md#putTemplateProgrammerTemplatePreview) | **PUT** /api/v1/template-programmer/template/preview | Preview Template
[**templateProgrammerTemplateByTemplateId**](TemplateProgrammerApi.md#templateProgrammerTemplateByTemplateId) | **GET** /api/v1/template-programmer/template/${templateId} | Gets details of a given template


<a name="deleteTemplateProgrammerProjectByProjectId"></a>
# **deleteTemplateProgrammerProjectByProjectId**
> TaskIdResult deleteTemplateProgrammerProjectByProjectId(projectId)

Deletes the project

Deletes the project

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
String projectId = "projectId_example"; // String | projectId
try {
    TaskIdResult result = apiInstance.deleteTemplateProgrammerProjectByProjectId(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#deleteTemplateProgrammerProjectByProjectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTemplateProgrammerTemplateByTemplateId"></a>
# **deleteTemplateProgrammerTemplateByTemplateId**
> TaskIdResult deleteTemplateProgrammerTemplateByTemplateId(templateId)

Deletes the template

Deletes the template

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
String templateId = "templateId_example"; // String | templateId
try {
    TaskIdResult result = apiInstance.deleteTemplateProgrammerTemplateByTemplateId(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#deleteTemplateProgrammerTemplateByTemplateId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| templateId |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplateProgrammerProject"></a>
# **getTemplateProgrammerProject**
> CollectionProjectDTO getTemplateProgrammerProject(name)

Gets a list of projects

List the projects

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
String name = "name_example"; // String | Name of project to be searched
try {
    CollectionProjectDTO result = apiInstance.getTemplateProgrammerProject(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#getTemplateProgrammerProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of project to be searched | [optional]

### Return type

[**CollectionProjectDTO**](CollectionProjectDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplateProgrammerTemplate"></a>
# **getTemplateProgrammerTemplate**
> CollectionTemplateInfo getTemplateProgrammerTemplate(projectId, softwareType, softwareVersion, productFamily, productSeries, productType, includeHead, filterConflictingTemplates)

Gets the templates available depending on the criteria

Gets the templates available depending on the criteria

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
String projectId = "projectId_example"; // String | projectId
String softwareType = "softwareType_example"; // String | softwareType
String softwareVersion = "softwareVersion_example"; // String | softwareVersion
String productFamily = "productFamily_example"; // String | productFamily
String productSeries = "productSeries_example"; // String | productSeries
String productType = "productType_example"; // String | productType
Boolean includeHead = true; // Boolean | includeHead
Boolean filterConflictingTemplates = true; // Boolean | filterConflictingTemplates
try {
    CollectionTemplateInfo result = apiInstance.getTemplateProgrammerTemplate(projectId, softwareType, softwareVersion, productFamily, productSeries, productType, includeHead, filterConflictingTemplates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#getTemplateProgrammerTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId | [optional]
 **softwareType** | **String**| softwareType | [optional]
 **softwareVersion** | **String**| softwareVersion | [optional]
 **productFamily** | **String**| productFamily | [optional]
 **productSeries** | **String**| productSeries | [optional]
 **productType** | **String**| productType | [optional]
 **includeHead** | **Boolean**| includeHead | [optional]
 **filterConflictingTemplates** | **Boolean**| filterConflictingTemplates | [optional]

### Return type

[**CollectionTemplateInfo**](CollectionTemplateInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplateProgrammerTemplateDeployStatusByDeploymentId"></a>
# **getTemplateProgrammerTemplateDeployStatusByDeploymentId**
> TemplateDeploymentStatusDTO getTemplateProgrammerTemplateDeployStatusByDeploymentId(deploymentId)

Status of template deployment

API to retrieve the status of template deployment.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
String deploymentId = "deploymentId_example"; // String | deploymentId
try {
    TemplateDeploymentStatusDTO result = apiInstance.getTemplateProgrammerTemplateDeployStatusByDeploymentId(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#getTemplateProgrammerTemplateDeployStatusByDeploymentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| deploymentId |

### Return type

[**TemplateDeploymentStatusDTO**](TemplateDeploymentStatusDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplateProgrammerTemplateVersionByTempleteId"></a>
# **getTemplateProgrammerTemplateVersionByTempleteId**
> CollectionTemplateInfo getTemplateProgrammerTemplateVersionByTempleteId(templateId)

Gets all the versions of a given template

Get all the versions of template

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
String templateId = "templateId_example"; // String | templateId
try {
    CollectionTemplateInfo result = apiInstance.getTemplateProgrammerTemplateVersionByTempleteId(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#getTemplateProgrammerTemplateVersionByTempleteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| templateId |

### Return type

[**CollectionTemplateInfo**](CollectionTemplateInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTemplateProgrammerProject"></a>
# **postTemplateProgrammerProject**
> TaskIdResult postTemplateProgrammerProject(request)

Create Project

This API is used to create a new project.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
ProjectDTO request = new ProjectDTO(); // ProjectDTO | request
try {
    TaskIdResult result = apiInstance.postTemplateProgrammerProject(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#postTemplateProgrammerProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ProjectDTO**](ProjectDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTemplateProgrammerProjectTemplateByProjectId"></a>
# **postTemplateProgrammerProjectTemplateByProjectId**
> TaskIdResult postTemplateProgrammerProjectTemplateByProjectId(request, projectId)

Create Template

API to create a template.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
TemplateDTO request = new TemplateDTO(); // TemplateDTO | request
String projectId = "projectId_example"; // String | projectId
try {
    TaskIdResult result = apiInstance.postTemplateProgrammerProjectTemplateByProjectId(request, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#postTemplateProgrammerProjectTemplateByProjectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TemplateDTO**](TemplateDTO.md)| request |
 **projectId** | **String**| projectId |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTemplateProgrammerTemplateDeploy"></a>
# **postTemplateProgrammerTemplateDeploy**
> TemplateDeploymentStatusDTO postTemplateProgrammerTemplateDeploy(request)

Deploy Template

API to deploy a template.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
TemplateDeploymentInfo request = new TemplateDeploymentInfo(); // TemplateDeploymentInfo | request
try {
    TemplateDeploymentStatusDTO result = apiInstance.postTemplateProgrammerTemplateDeploy(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#postTemplateProgrammerTemplateDeploy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TemplateDeploymentInfo**](TemplateDeploymentInfo.md)| request |

### Return type

[**TemplateDeploymentStatusDTO**](TemplateDeploymentStatusDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTemplateProgrammerTemplateVersion"></a>
# **postTemplateProgrammerTemplateVersion**
> TaskIdResult postTemplateProgrammerTemplateVersion(request)

Version Template

API to version the current contents of the template.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
TemplateVersionRequestDTO request = new TemplateVersionRequestDTO(); // TemplateVersionRequestDTO | request
try {
    TaskIdResult result = apiInstance.postTemplateProgrammerTemplateVersion(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#postTemplateProgrammerTemplateVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TemplateVersionRequestDTO**](TemplateVersionRequestDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putTemplateProgrammerProject"></a>
# **putTemplateProgrammerProject**
> TaskIdResult putTemplateProgrammerProject(request)

Update Project

This API is used to update an existing project.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
ProjectDTO request = new ProjectDTO(); // ProjectDTO | request
try {
    TaskIdResult result = apiInstance.putTemplateProgrammerProject(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#putTemplateProgrammerProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ProjectDTO**](ProjectDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putTemplateProgrammerTemplate"></a>
# **putTemplateProgrammerTemplate**
> TaskIdResult putTemplateProgrammerTemplate(request)

Update Template

API to update a template.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
TemplateDTO request = new TemplateDTO(); // TemplateDTO | request
try {
    TaskIdResult result = apiInstance.putTemplateProgrammerTemplate(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#putTemplateProgrammerTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TemplateDTO**](TemplateDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putTemplateProgrammerTemplatePreview"></a>
# **putTemplateProgrammerTemplatePreview**
> TemplatePreviewResponseDTO putTemplateProgrammerTemplatePreview(request)

Preview Template

API to preview a template.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
TemplatePreviewRequestDTO request = new TemplatePreviewRequestDTO(); // TemplatePreviewRequestDTO | request
try {
    TemplatePreviewResponseDTO result = apiInstance.putTemplateProgrammerTemplatePreview(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#putTemplateProgrammerTemplatePreview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TemplatePreviewRequestDTO**](TemplatePreviewRequestDTO.md)| request |

### Return type

[**TemplatePreviewResponseDTO**](TemplatePreviewResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templateProgrammerTemplateByTemplateId"></a>
# **templateProgrammerTemplateByTemplateId**
> TemplateDTO templateProgrammerTemplateByTemplateId(templateId)

Gets details of a given template

Details of the template

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TemplateProgrammerApi;


TemplateProgrammerApi apiInstance = new TemplateProgrammerApi();
String templateId = "templateId_example"; // String | templateId
try {
    TemplateDTO result = apiInstance.templateProgrammerTemplateByTemplateId(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateProgrammerApi#templateProgrammerTemplateByTemplateId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| templateId |

### Return type

[**TemplateDTO**](TemplateDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

