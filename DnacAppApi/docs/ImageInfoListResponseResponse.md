
# ImageInfoListResponseResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicableDevicesForImage** | [**List&lt;ImageInfoListResponseApplicableDevicesForImage&gt;**](ImageInfoListResponseApplicableDevicesForImage.md) |  |  [optional]
**applicationType** | **String** |  |  [optional]
**createdTime** | **String** |  |  [optional]
**extendedAttributes** | **Object** |  |  [optional]
**family** | **String** |  |  [optional]
**feature** | **String** |  |  [optional]
**fileServiceId** | **String** |  |  [optional]
**fileSize** | **String** |  |  [optional]
**imageIntegrityStatus** | **String** |  |  [optional]
**imageName** | **String** |  |  [optional]
**imageSeries** | **List&lt;String&gt;** |  |  [optional]
**imageSource** | **String** |  |  [optional]
**imageType** | **String** |  |  [optional]
**imageUuid** | **String** |  |  [optional]
**importSourceType** | [**ImportSourceTypeEnum**](#ImportSourceTypeEnum) |  |  [optional]
**isTaggedGolden** | **Boolean** |  |  [optional]
**md5Checksum** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**profileInfo** | [**List&lt;ImageInfoListResponseProfileInfo&gt;**](ImageInfoListResponseProfileInfo.md) |  |  [optional]
**shaCheckSum** | **String** |  |  [optional]
**vendor** | **String** |  |  [optional]
**version** | **String** |  |  [optional]


<a name="ImportSourceTypeEnum"></a>
## Enum: ImportSourceTypeEnum
Name | Value
---- | -----
DEVICE | &quot;DEVICE&quot;
REMOTEURL | &quot;REMOTEURL&quot;
CCO | &quot;CCO&quot;
FILESYSTEM | &quot;FILESYSTEM&quot;



