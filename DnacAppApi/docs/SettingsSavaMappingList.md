
# SettingsSavaMappingList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoSyncPeriod** | **Integer** |  |  [optional]
**ccoUser** | **String** |  |  [optional]
**expiry** | **Integer** |  |  [optional]
**lastSync** | **Integer** |  |  [optional]
**profile** | [**SAVAMappingProfile**](SAVAMappingProfile.md) |  |  [optional]
**smartAccountId** | **String** |  |  [optional]
**syncResult** | [**SAVAMappingSyncResult**](SAVAMappingSyncResult.md) |  |  [optional]
**syncResultStr** | **String** |  |  [optional]
**syncStartTime** | **Integer** |  |  [optional]
**syncStatus** | [**SyncStatusEnum**](#SyncStatusEnum) |  |  [optional]
**tenantId** | **String** |  |  [optional]
**token** | **String** |  |  [optional]
**virtualAccountId** | **String** |  |  [optional]


<a name="SyncStatusEnum"></a>
## Enum: SyncStatusEnum
Name | Value
---- | -----
NOT_SYNCED | &quot;NOT_SYNCED&quot;
SYNCING | &quot;SYNCING&quot;
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;



