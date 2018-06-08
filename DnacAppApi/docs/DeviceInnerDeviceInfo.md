
# DeviceInnerDeviceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aaaCredentials** | [**DeviceInnerDeviceInfoAaaCredentials**](DeviceInnerDeviceInfoAaaCredentials.md) |  |  [optional]
**addedOn** | **Integer** |  |  [optional]
**addnMacAddrs** | **List&lt;String&gt;** |  |  [optional]
**agentType** | [**AgentTypeEnum**](#AgentTypeEnum) |  |  [optional]
**authStatus** | **String** |  |  [optional]
**authenticatedSudiSerialNo** | **String** |  |  [optional]
**capabilitiesSupported** | **List&lt;String&gt;** |  |  [optional]
**cmState** | [**CmStateEnum**](#CmStateEnum) |  |  [optional]
**description** | **String** |  |  [optional]
**deviceSudiSerialNos** | **List&lt;String&gt;** |  |  [optional]
**deviceType** | **String** |  |  [optional]
**featuresSupported** | **List&lt;String&gt;** |  |  [optional]
**fileSystemList** | [**List&lt;DeviceInnerDeviceInfoFileSystemList&gt;**](DeviceInnerDeviceInfoFileSystemList.md) |  |  [optional]
**firstContact** | **Integer** |  |  [optional]
**hostname** | **String** |  |  [optional]
**httpHeaders** | [**List&lt;ResetRequestConfigParameters&gt;**](ResetRequestConfigParameters.md) |  |  [optional]
**imageFile** | **String** |  |  [optional]
**imageVersion** | **String** |  |  [optional]
**ipInterfaces** | [**List&lt;DeviceInnerDeviceInfoIpInterfaces&gt;**](DeviceInnerDeviceInfoIpInterfaces.md) |  |  [optional]
**lastContact** | **Integer** |  |  [optional]
**lastSyncTime** | **Integer** |  |  [optional]
**lastUpdateOn** | **Integer** |  |  [optional]
**location** | [**DeviceInnerDeviceInfoLocation**](DeviceInnerDeviceInfoLocation.md) |  |  [optional]
**macAddress** | **String** |  |  [optional]
**mode** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**neighborLinks** | [**List&lt;DeviceInnerDeviceInfoNeighborLinks&gt;**](DeviceInnerDeviceInfoNeighborLinks.md) |  |  [optional]
**onbState** | [**OnbStateEnum**](#OnbStateEnum) |  |  [optional]
**pid** | **String** |  |  [optional]
**pnpProfileList** | [**List&lt;DeviceInnerDeviceInfoPnpProfileList&gt;**](DeviceInnerDeviceInfoPnpProfileList.md) |  |  [optional]
**preWorkflowCliOuputs** | [**List&lt;DeviceInnerDeviceInfoPreWorkflowCliOuputs&gt;**](DeviceInnerDeviceInfoPreWorkflowCliOuputs.md) |  |  [optional]
**projectId** | **String** |  |  [optional]
**projectName** | **String** |  |  [optional]
**reloadRequested** | **Boolean** |  |  [optional]
**serialNumber** | **String** |  |  [optional]
**smartAccountId** | **String** |  |  [optional]
**source** | **String** |  |  [optional]
**stack** | **Boolean** |  |  [optional]
**stackInfo** | [**DeviceInnerDeviceInfoStackInfo**](DeviceInnerDeviceInfoStackInfo.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**sudiRequired** | **Boolean** |  |  [optional]
**tags** | **Object** |  |  [optional]
**userSudiSerialNos** | **List&lt;String&gt;** |  |  [optional]
**virtualAccountId** | **String** |  |  [optional]
**workflowId** | **String** |  |  [optional]
**workflowName** | **String** |  |  [optional]


<a name="AgentTypeEnum"></a>
## Enum: AgentTypeEnum
Name | Value
---- | -----
POSIX | &quot;POSIX&quot;
IOS | &quot;IOS&quot;


<a name="CmStateEnum"></a>
## Enum: CmStateEnum
Name | Value
---- | -----
NOTCONTACTED | &quot;NotContacted&quot;
CONTACTED | &quot;Contacted&quot;
DISCONNECTED | &quot;Disconnected&quot;
SECURINGCONNECTION | &quot;SecuringConnection&quot;
SECUREDCONNECTION | &quot;SecuredConnection&quot;
AUTHENTICATED | &quot;Authenticated&quot;
ERRORSECURINGCONNECTION | &quot;ErrorSecuringConnection&quot;
ERRORAUTHENTICATING | &quot;ErrorAuthenticating&quot;


<a name="OnbStateEnum"></a>
## Enum: OnbStateEnum
Name | Value
---- | -----
NOTCONTACTED | &quot;NotContacted&quot;
CONNECTING | &quot;Connecting&quot;
ERRORSECURINGCONNECTION | &quot;ErrorSecuringConnection&quot;
ERRORAUTHENTICATING | &quot;ErrorAuthenticating&quot;
INITIALIZING | &quot;Initializing&quot;
INITIALIZED | &quot;Initialized&quot;
ERRORINITIALIZING | &quot;ErrorInitializing&quot;
ERRORSUDIAUTHORIZING | &quot;ErrorSudiAuthorizing&quot;
EXECUTINGWORKFLOW | &quot;ExecutingWorkflow&quot;
EXECUTEDWORKFLOW | &quot;ExecutedWorkflow&quot;
ERROREXECUTINGWORKFLOW | &quot;ErrorExecutingWorkflow&quot;
EXECUTINGRESET | &quot;ExecutingReset&quot;
ERROREXECUTINGRESET | &quot;ErrorExecutingReset&quot;
PROVISIONED | &quot;Provisioned&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
UNCLAIMED | &quot;Unclaimed&quot;
PLANNED | &quot;Planned&quot;
ONBOARDING | &quot;Onboarding&quot;
PROVISIONED | &quot;Provisioned&quot;
ERROR | &quot;Error&quot;
DELETED | &quot;Deleted&quot;



