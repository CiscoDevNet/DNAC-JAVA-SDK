# ImageApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getImageImportation**](ImageApi.md#getImageImportation) | **GET** /api/v1/image/importation | Get image details with filter
[**postImageActivationDevice**](ImageApi.md#postImageActivationDevice) | **POST** /api/v1/image/activation/device | Trigger activation on a device
[**postImageDistribution**](ImageApi.md#postImageDistribution) | **POST** /api/v1/image/distribution | Trigger distribution of an image
[**postImageImportationSourceFile**](ImageApi.md#postImageImportationSourceFile) | **POST** /api/v1/image/importation/source/file | Import an image from local file system
[**postImageImportationSourceUrl**](ImageApi.md#postImageImportationSourceUrl) | **POST** /api/v1/image/importation/source/url | Trigger now or schedule import of an image from a URL


<a name="getImageImportation"></a>
# **getImageImportation**
> ImageInfoListResponse getImageImportation(imageUuid, name, family, applicationType, imageIntegrityStatus, version, imageSeries, imageName, isTaggedGolden, isCCORecommended, isCCOLatest, createdTime, imageSizeGreaterThan, imageSizeLesserThan, sortBy, sortOrder, limit, offset)

Get image details with filter

Get image details based on filter criteria, use % for like operations. Example: filterByName &#x3D; cat3k%

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.ImageApi;


ImageApi apiInstance = new ImageApi();
String imageUuid = "imageUuid_example"; // String | imageUuid
String name = "name_example"; // String | name
String family = "family_example"; // String | family
String applicationType = "applicationType_example"; // String | applicationType
String imageIntegrityStatus = "imageIntegrityStatus_example"; // String | imageIntegrityStatus - FAILURE, UNKNOWN, VERIFIED
String version = "version_example"; // String | software Image Version
String imageSeries = "imageSeries_example"; // String | image Series
String imageName = "imageName_example"; // String | image Name
Boolean isTaggedGolden = true; // Boolean | is Tagged Golden
Boolean isCCORecommended = true; // Boolean | is recommended from cisco.com
Boolean isCCOLatest = true; // Boolean | is latest from cisco.com
Integer createdTime = 56; // Integer | time in milliseconds (epoch format)
Integer imageSizeGreaterThan = 56; // Integer | size in bytes
Integer imageSizeLesserThan = 56; // Integer | size in bytes
String sortBy = "sortBy_example"; // String | sort results by this field
String sortOrder = "sortOrder_example"; // String | sort order - 'asc' or 'des'. Default is asc
Integer limit = 56; // Integer | limit
Integer offset = 56; // Integer | offset
try {
    ImageInfoListResponse result = apiInstance.getImageImportation(imageUuid, name, family, applicationType, imageIntegrityStatus, version, imageSeries, imageName, isTaggedGolden, isCCORecommended, isCCOLatest, createdTime, imageSizeGreaterThan, imageSizeLesserThan, sortBy, sortOrder, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#getImageImportation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageUuid** | **String**| imageUuid | [optional]
 **name** | **String**| name | [optional]
 **family** | **String**| family | [optional]
 **applicationType** | **String**| applicationType | [optional]
 **imageIntegrityStatus** | **String**| imageIntegrityStatus - FAILURE, UNKNOWN, VERIFIED | [optional]
 **version** | **String**| software Image Version | [optional]
 **imageSeries** | **String**| image Series | [optional]
 **imageName** | **String**| image Name | [optional]
 **isTaggedGolden** | **Boolean**| is Tagged Golden | [optional]
 **isCCORecommended** | **Boolean**| is recommended from cisco.com | [optional]
 **isCCOLatest** | **Boolean**| is latest from cisco.com | [optional]
 **createdTime** | **Integer**| time in milliseconds (epoch format) | [optional]
 **imageSizeGreaterThan** | **Integer**| size in bytes | [optional]
 **imageSizeLesserThan** | **Integer**| size in bytes | [optional]
 **sortBy** | **String**| sort results by this field | [optional]
 **sortOrder** | **String**| sort order - &#39;asc&#39; or &#39;des&#39;. Default is asc | [optional]
 **limit** | **Integer**| limit | [optional]
 **offset** | **Integer**| offset | [optional]

### Return type

[**ImageInfoListResponse**](ImageInfoListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postImageActivationDevice"></a>
# **postImageActivationDevice**
> TaskIdResult postImageActivationDevice(request, clientType, clientUrl, scheduleValidate)

Trigger activation on a device

Performs activation of an image on a given device.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.ImageApi;


ImageApi apiInstance = new ImageApi();
ActivateDTO request = new ActivateDTO(); // ActivateDTO | request
String clientType = "clientType_example"; // String | Client-type (Optional)
String clientUrl = "clientUrl_example"; // String | Client-url (Optional)
Boolean scheduleValidate = true; // Boolean | scheduleValidate, validates data before schedule (Optional)
try {
    TaskIdResult result = apiInstance.postImageActivationDevice(request, clientType, clientUrl, scheduleValidate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#postImageActivationDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ActivateDTO**](ActivateDTO.md)| request |
 **clientType** | **String**| Client-type (Optional) | [optional]
 **clientUrl** | **String**| Client-url (Optional) | [optional]
 **scheduleValidate** | **Boolean**| scheduleValidate, validates data before schedule (Optional) | [optional]

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postImageDistribution"></a>
# **postImageDistribution**
> TaskIdResult postImageDistribution(request)

Trigger distribution of an image

Performs distribution of an image to a given device.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.ImageApi;


ImageApi apiInstance = new ImageApi();
DistributeDTO request = new DistributeDTO(); // DistributeDTO | request
try {
    TaskIdResult result = apiInstance.postImageDistribution(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#postImageDistribution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DistributeDTO**](DistributeDTO.md)| request |

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postImageImportationSourceFile"></a>
# **postImageImportationSourceFile**
> TaskIdResult postImageImportationSourceFile(isThirdParty, thirdPartyVendor, thirdPartyImageFamily, thirdPartyApplicationType)

Import an image from local file system

Imports an image to SWIM image repository from local file system. The image files with extensions bin, img, tar, smu, pie, aes, iso, ova, tar_gz and qcow2 are supported. Set siteUuid as -1 to tag as golden image.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.ImageApi;


ImageApi apiInstance = new ImageApi();
Boolean isThirdParty = true; // Boolean | Third party Image check
String thirdPartyVendor = "thirdPartyVendor_example"; // String | Third Party Vendor
String thirdPartyImageFamily = "thirdPartyImageFamily_example"; // String | Third Party image family
String thirdPartyApplicationType = "thirdPartyApplicationType_example"; // String | Third Party Application Type
try {
    TaskIdResult result = apiInstance.postImageImportationSourceFile(isThirdParty, thirdPartyVendor, thirdPartyImageFamily, thirdPartyApplicationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#postImageImportationSourceFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isThirdParty** | **Boolean**| Third party Image check | [optional]
 **thirdPartyVendor** | **String**| Third Party Vendor | [optional]
 **thirdPartyImageFamily** | **String**| Third Party image family | [optional]
 **thirdPartyApplicationType** | **String**| Third Party Application Type | [optional]

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postImageImportationSourceUrl"></a>
# **postImageImportationSourceUrl**
> TaskIdResult postImageImportationSourceUrl(request, scheduleAt, scheduleDesc, scheduleOrigin)

Trigger now or schedule import of an image from a URL

Imports an image to SWIM image repository, source is any ftp or http URL. The image files with extensions bin, img, tar, smu, pie, aes, iso, ova, tar_gz and qcow2 are supported. Set siteUuid as -1 to tag as golden image.

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.ImageApi;


ImageApi apiInstance = new ImageApi();
ImageImportFromUrlDTO request = new ImageImportFromUrlDTO(); // ImageImportFromUrlDTO | request
String scheduleAt = "scheduleAt_example"; // String | Epoch Time (The number of milli-seconds since January 1 1970 UTC) at which the distribution should be scheduled (Optional) 
String scheduleDesc = "scheduleDesc_example"; // String | Custom Description (Optional)
String scheduleOrigin = "scheduleOrigin_example"; // String | Originator of this call (Optional)
try {
    TaskIdResult result = apiInstance.postImageImportationSourceUrl(request, scheduleAt, scheduleDesc, scheduleOrigin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#postImageImportationSourceUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ImageImportFromUrlDTO**](ImageImportFromUrlDTO.md)| request |
 **scheduleAt** | **String**| Epoch Time (The number of milli-seconds since January 1 1970 UTC) at which the distribution should be scheduled (Optional)  | [optional]
 **scheduleDesc** | **String**| Custom Description (Optional) | [optional]
 **scheduleOrigin** | **String**| Originator of this call (Optional) | [optional]

### Return type

[**TaskIdResult**](TaskIdResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

