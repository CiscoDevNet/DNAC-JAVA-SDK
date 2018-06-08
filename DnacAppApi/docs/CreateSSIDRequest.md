
# CreateSSIDRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interfaceName** | **String** |  |  [optional]
**vlanId** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**ssidName** | **String** |  |  [optional]
**wlanType** | **String** |  |  [optional]
**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) |  |  [optional]
**authenticationServer** | **String** |  |  [optional]
**passpharse** | **String** |  |  [optional]
**trafficType** | [**TrafficTypeEnum**](#TrafficTypeEnum) |  |  [optional]
**radioPolicy** | [**RadioPolicyEnum**](#RadioPolicyEnum) |  |  [optional]
**fastTransition** | [**FastTransitionEnum**](#FastTransitionEnum) |  |  [optional]
**enableFastlane** | **Boolean** |  |  [optional]
**enableMACFilering** | **Boolean** |  |  [optional]
**enableBroadcastSSID** | **Boolean** |  |  [optional]
**enableWLANBandSelection** | **Boolean** |  |  [optional]
**wirelessNetworkProfileName** | **String** |  |  [optional]
**sitesNameHierarchyToMapTheProfile** | **String** |  |  [optional]
**deviceName** | **String** |  |  [optional]
**siteNameHierarchyToMapDevicePhysicalLocation** | **String** |  |  [optional]
**managedAPLocations** | **String** |  |  [optional]
**interfaceIPAddress** | **String** |  |  [optional]
**interfaceNetMaskInCIDRFormat** | **String** |  |  [optional]
**interfaceGatewayIPAddress** | **String** |  |  [optional]
**interfaceLAGPortNumber** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**siteNameHierarchyToMapAPPhysicalLocation** | **String** |  |  [optional]
**apNames** | **String** |  |  [optional]
**rfProfile** | [**RfProfileEnum**](#RfProfileEnum) |  |  [optional]


<a name="AuthenticationTypeEnum"></a>
## Enum: AuthenticationTypeEnum
Name | Value
---- | -----
WPA2_ENTERPRISE | &quot;wpa2_enterprise&quot;
WPA2_PERSONAL | &quot;wpa2_personal&quot;
OPEN | &quot;open&quot;


<a name="TrafficTypeEnum"></a>
## Enum: TrafficTypeEnum
Name | Value
---- | -----
VOICEDATA | &quot;voicedata&quot;
DATA | &quot;data&quot;


<a name="RadioPolicyEnum"></a>
## Enum: RadioPolicyEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;


<a name="FastTransitionEnum"></a>
## Enum: FastTransitionEnum
Name | Value
---- | -----
ADAPTIVE | &quot;ADAPTIVE&quot;
ENABLE | &quot;ENABLE&quot;
DISABLE | &quot;DISABLE&quot;


<a name="RfProfileEnum"></a>
## Enum: RfProfileEnum
Name | Value
---- | -----
LOW | &quot;LOW&quot;
TYPICAL | &quot;TYPICAL&quot;
HIGH | &quot;HIGH&quot;



