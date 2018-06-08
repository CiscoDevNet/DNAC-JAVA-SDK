
# SNMPvCredentialDTOInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authPassword** | **String** |  |  [optional]
**authType** | [**AuthTypeEnum**](#AuthTypeEnum) |  |  [optional]
**comments** | **String** |  |  [optional]
**credentialType** | [**CredentialTypeEnum**](#CredentialTypeEnum) |  |  [optional]
**description** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**instanceTenantId** | **String** |  |  [optional]
**instanceUuid** | **String** |  |  [optional]
**privacyPassword** | **String** |  |  [optional]
**privacyType** | [**PrivacyTypeEnum**](#PrivacyTypeEnum) |  |  [optional]
**snmpMode** | [**SnmpModeEnum**](#SnmpModeEnum) |  |  [optional]
**username** | **String** |  |  [optional]


<a name="AuthTypeEnum"></a>
## Enum: AuthTypeEnum
Name | Value
---- | -----
SHA | &quot;SHA&quot;
MD5 | &quot;MD5&quot;


<a name="CredentialTypeEnum"></a>
## Enum: CredentialTypeEnum
Name | Value
---- | -----
GLOBAL | &quot;GLOBAL&quot;
APP | &quot;APP&quot;


<a name="PrivacyTypeEnum"></a>
## Enum: PrivacyTypeEnum
Name | Value
---- | -----
DES | &quot;DES&quot;
AES128 | &quot;AES128&quot;


<a name="SnmpModeEnum"></a>
## Enum: SnmpModeEnum
Name | Value
---- | -----
AUTHPRIV | &quot;AUTHPRIV&quot;
AUTHNOPRIV | &quot;AUTHNOPRIV&quot;
NOAUTHNOPRIV | &quot;NOAUTHNOPRIV&quot;



