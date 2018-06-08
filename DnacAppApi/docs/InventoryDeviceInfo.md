
# InventoryDeviceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cliTransport** | **String** |  |  [optional]
**computeDevice** | **Boolean** |  |  [optional]
**enablePassword** | **String** |  |  [optional]
**extendedDiscoveryInfo** | **String** |  |  [optional]
**httpPassword** | **String** |  |  [optional]
**httpPort** | **String** |  |  [optional]
**httpSecure** | **Boolean** |  |  [optional]
**httpUserName** | **String** |  |  [optional]
**ipAddress** | **List&lt;String&gt;** |  |  [optional]
**merakiOrgId** | **List&lt;String&gt;** |  |  [optional]
**netconfPort** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**serialNumber** | **String** |  |  [optional]
**snmpAuthPassphrase** | **String** |  |  [optional]
**snmpAuthProtocol** | **String** |  |  [optional]
**snmpMode** | **String** |  |  [optional]
**snmpPrivPassphrase** | **String** |  |  [optional]
**snmpPrivProtocol** | **String** |  |  [optional]
**snmpROCommunity** | **String** |  |  [optional]
**snmpRWCommunity** | **String** |  |  [optional]
**snmpRetry** | **Integer** |  |  [optional]
**snmpTimeout** | **Integer** |  |  [optional]
**snmpUserName** | **String** |  |  [optional]
**snmpVersion** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**updateMgmtIPaddressList** | [**List&lt;InventoryDeviceInfoUpdateMgmtIPaddressList&gt;**](InventoryDeviceInfoUpdateMgmtIPaddressList.md) |  |  [optional]
**userName** | **String** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
COMPUTE_DEVICE | &quot;COMPUTE_DEVICE&quot;
MERAKI_DASHBOARD | &quot;MERAKI_DASHBOARD&quot;
NETWORK_DEVICE | &quot;NETWORK_DEVICE&quot;
NODATACHANGE | &quot;NODATACHANGE&quot;



