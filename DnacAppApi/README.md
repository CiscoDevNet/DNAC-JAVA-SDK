# dnac-app-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>dnacAppApi</groupId>
    <artifactId>dnac-app-api</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "dnacAppApi:dnac-app-api:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/dnac-app-api-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import cisco.com.dnac.v1.api.client.*;
import cisco.com.dnac.v1.api.client.auth.*;
import cisco.com.dnac.v1.api.client.model.*;
import cisco.com.dnac.v1.api.client.api.DiscoveryApi;

import java.io.File;
import java.util.*;

public class DiscoveryApiExample {

    public static void main(String[] args) {
        
        DiscoveryApi apiInstance = new DiscoveryApi();
        try {
            TaskIdResult result = apiInstance.deleteDiscovery();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscoveryApi#deleteDiscovery");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DiscoveryApi* | [**deleteDiscovery**](docs/DiscoveryApi.md#deleteDiscovery) | **DELETE** /api/v1/discovery | Deletes all discovery
*DiscoveryApi* | [**deleteDiscoveryById**](docs/DiscoveryApi.md#deleteDiscoveryById) | **DELETE** /api/v1/discovery/${id} | Deletes the discovery specified by id
*DiscoveryApi* | [**deleteDiscoveryRange**](docs/DiscoveryApi.md#deleteDiscoveryRange) | **DELETE** /api/v1/discovery/${startIndex}/${recordsToDelete} | Deletes the discovery in the given range
*DiscoveryApi* | [**getDiscoveryAutoCompleteById**](docs/DiscoveryApi.md#getDiscoveryAutoCompleteById) | **GET** /api/v1/discovery/${id}/autoComplete | Retrieve autoComplete values from a discovery based on id
*DiscoveryApi* | [**getDiscoveryById**](docs/DiscoveryApi.md#getDiscoveryById) | **GET** /api/v1/discovery/${id} | Retrieves the discovery specified by id
*DiscoveryApi* | [**getDiscoveryCount**](docs/DiscoveryApi.md#getDiscoveryCount) | **GET** /api/v1/discovery/count | Retrieves the number of discoveries
*DiscoveryApi* | [**getDiscoveryJob**](docs/DiscoveryApi.md#getDiscoveryJob) | **GET** /api/v1/discovery/job | Retrieves the list of discovery jobs for the given IP
*DiscoveryApi* | [**getDiscoveryJobById**](docs/DiscoveryApi.md#getDiscoveryJobById) | **GET** /api/v1/discovery/${id}/job | Retrieves list of discovery jobs for the specified discovery id
*DiscoveryApi* | [**getDiscoveryNetworkDeviceByIdRange**](docs/DiscoveryApi.md#getDiscoveryNetworkDeviceByIdRange) | **GET** /api/v1/discovery/${id}/network-device/${startIndex}/${recordsToReturn} | Retrieves the range of network devices discovered for the given discovery
*DiscoveryApi* | [**getDiscoveryNetworkDeviceCountById**](docs/DiscoveryApi.md#getDiscoveryNetworkDeviceCountById) | **GET** /api/v1/discovery/${id}/network-device/count | Retrieves the number of network devices discovered in the discovery specified by id
*DiscoveryApi* | [**getDiscoveryNetworkNetworkDeviceById**](docs/DiscoveryApi.md#getDiscoveryNetworkNetworkDeviceById) | **GET** /api/v1/discovery/${id}/network-device | Retrieves the network devices discovered in the discovery specified by id
*DiscoveryApi* | [**getDiscoveryRange**](docs/DiscoveryApi.md#getDiscoveryRange) | **GET** /api/v1/discovery/${startIndex}/${recordsToReturn} | Retrieves the discovery in the given range
*DiscoveryApi* | [**getDiscoverySummaryById**](docs/DiscoveryApi.md#getDiscoverySummaryById) | **GET** /api/v1/discovery/${id}/summary | Retrieve network devices from a discovery on given filters
*DiscoveryApi* | [**postDiscovery**](docs/DiscoveryApi.md#postDiscovery) | **POST** /api/v1/discovery | Starts a new discovery process and returns a task-id
*DiscoveryApi* | [**putDiscovery**](docs/DiscoveryApi.md#putDiscovery) | **PUT** /api/v1/discovery | Updates an existing discovery specified by id - only for starting/stopping the discovery
*DnaIntentApi* | [**deleteDnaIntentDeleteApplication**](docs/DnaIntentApi.md#deleteDnaIntentDeleteApplication) | **DELETE** /dna/intent/api/v1/delete-application | Delete Application
*DnaIntentApi* | [**deleteDnaIntentDeleteApplicationSet**](docs/DnaIntentApi.md#deleteDnaIntentDeleteApplicationSet) | **DELETE** /dna/intent/api/v1/delete-application-set | Delete Application Set
*DnaIntentApi* | [**deleteDnaIntentDeleteSsid**](docs/DnaIntentApi.md#deleteDnaIntentDeleteSsid) | **DELETE** /dna/intent/api/v1/delete-ssid/${deviceName}/${wirelessNetworkProfileName}/${ssidName}/${interfaceName} | Delete SSID
*DnaIntentApi* | [**getDnaIntentApplicationCount**](docs/DnaIntentApi.md#getDnaIntentApplicationCount) | **GET** /dna/intent/api/v1/application/count | Get Applications Count
*DnaIntentApi* | [**getDnaIntentApplicationPolicy**](docs/DnaIntentApi.md#getDnaIntentApplicationPolicy) | **GET** /dna/intent/api/v1/application-policy | Get Application Policies
*DnaIntentApi* | [**getDnaIntentApplicationSetCount**](docs/DnaIntentApi.md#getDnaIntentApplicationSetCount) | **GET** /dna/intent/api/v1/application-set/count | Get Application Sets Count
*DnaIntentApi* | [**getDnaIntentApplicationSets**](docs/DnaIntentApi.md#getDnaIntentApplicationSets) | **GET** /dna/intent/api/v1/application-sets | Get Application Sets
*DnaIntentApi* | [**getDnaIntentApplications**](docs/DnaIntentApi.md#getDnaIntentApplications) | **GET** /dna/intent/api/v1/applications | Get Applications
*DnaIntentApi* | [**getDnaIntentClieDetail**](docs/DnaIntentApi.md#getDnaIntentClieDetail) | **GET** /dna/intent/api/v1/client-detail | Client Detail
*DnaIntentApi* | [**getDnaIntentClientHealth**](docs/DnaIntentApi.md#getDnaIntentClientHealth) | **GET** /dna/intent/api/v1/client-health | Client Health
*DnaIntentApi* | [**getDnaIntentNetworkDeviceDetail**](docs/DnaIntentApi.md#getDnaIntentNetworkDeviceDetail) | **GET** /dna/intent/api/v1/network-device-detail | Network Device Detail
*DnaIntentApi* | [**getDnaIntentNetworkHealth**](docs/DnaIntentApi.md#getDnaIntentNetworkHealth) | **GET** /dna/intent/api/v1/network-health | Network Health
*DnaIntentApi* | [**getDnaIntentSiteHierarchy**](docs/DnaIntentApi.md#getDnaIntentSiteHierarchy) | **GET** /dna/intent/api/v1/site-hierarchy | Site Hierarchy
*DnaIntentApi* | [**postDnaIntentCreateApplication**](docs/DnaIntentApi.md#postDnaIntentCreateApplication) | **POST** /dna/intent/api/v1/create-application | Post Application
*DnaIntentApi* | [**postDnaIntentCreateApplicationPolicy**](docs/DnaIntentApi.md#postDnaIntentCreateApplicationPolicy) | **POST** /dna/intent/api/v1/create-application-policy | Post Application Policy Intent
*DnaIntentApi* | [**postDnaIntentCreateApplicationSet**](docs/DnaIntentApi.md#postDnaIntentCreateApplicationSet) | **POST** /dna/intent/api/v1/create-application-set | Post Application Set
*DnaIntentApi* | [**postDnaIntentCreateSsid**](docs/DnaIntentApi.md#postDnaIntentCreateSsid) | **POST** /dna/intent/api/v1/create-ssid | Create SSID
*DnaIntentApi* | [**putDnaIntentUpdateApplication**](docs/DnaIntentApi.md#putDnaIntentUpdateApplication) | **PUT** /dna/intent/api/v1/update-application | Edit Application
*FileApi* | [**getFileByFileId**](docs/FileApi.md#getFileByFileId) | **GET** /api/v1/file/${fileId} | Downloads a file referred by the fileId
*FileApi* | [**getFileNamespace**](docs/FileApi.md#getFileNamespace) | **GET** /api/v1/file/namespace | Returns list of available namespaces
*FileApi* | [**getFileNamespaceByNameSpace**](docs/FileApi.md#getFileNamespaceByNameSpace) | **GET** /api/v1/file/namespace/${nameSpace} | Returns list of files under a specific namespace
*FlowAnalysisApi* | [**deleteFlowAnalysisByFlowAnalysisId**](docs/FlowAnalysisApi.md#deleteFlowAnalysisByFlowAnalysisId) | **DELETE** /api/v1/flow-analysis/${flowAnalysisId} | Deletes a flow analysis request
*FlowAnalysisApi* | [**getFlowAnalysis**](docs/FlowAnalysisApi.md#getFlowAnalysis) | **GET** /api/v1/flow-analysis | Retrieves a summary of all flow analyses stored
*GlobalCredentialApi* | [**deleteGlobalCredentialByGlobalCredentialId**](docs/GlobalCredentialApi.md#deleteGlobalCredentialByGlobalCredentialId) | **DELETE** /api/v1/global-credential/${globalCredentialId} | Retrieves global credential by ID
*GlobalCredentialApi* | [**getGlobalCredential**](docs/GlobalCredentialApi.md#getGlobalCredential) | **GET** /api/v1/global-credential | Retrieves global credential for the given credential sub type
*GlobalCredentialApi* | [**getGlobalCredentialById**](docs/GlobalCredentialApi.md#getGlobalCredentialById) | **GET** /api/v1/global-credential/${id} | Retrieves credential sub type for the given credential Id
*GlobalCredentialApi* | [**postGlobalCredentialCli**](docs/GlobalCredentialApi.md#postGlobalCredentialCli) | **POST** /api/v1/global-credential/cli | Creates global CLI credential
*GlobalCredentialApi* | [**postGlobalCredentialHttpRead**](docs/GlobalCredentialApi.md#postGlobalCredentialHttpRead) | **POST** /api/v1/global-credential/http-read | Creates global HTTP read credentials
*GlobalCredentialApi* | [**postGlobalCredentialHttpWrite**](docs/GlobalCredentialApi.md#postGlobalCredentialHttpWrite) | **POST** /api/v1/global-credential/http-write | Creates global HTTP write credentials
*GlobalCredentialApi* | [**postGlobalCredentialNetconf**](docs/GlobalCredentialApi.md#postGlobalCredentialNetconf) | **POST** /api/v1/global-credential/netconf | Creates global netconf credential
*GlobalCredentialApi* | [**postGlobalCredentialSnmpv2ReadCommunity**](docs/GlobalCredentialApi.md#postGlobalCredentialSnmpv2ReadCommunity) | **POST** /api/v1/global-credential/snmpv2-read-community | Creates global SNMP read community
*GlobalCredentialApi* | [**postGlobalCredentialSnmpv2WriteCommunity**](docs/GlobalCredentialApi.md#postGlobalCredentialSnmpv2WriteCommunity) | **POST** /api/v1/global-credential/snmpv2-write-community | Creates global SNMP write community
*GlobalCredentialApi* | [**postGlobalCredentialSnmpv3**](docs/GlobalCredentialApi.md#postGlobalCredentialSnmpv3) | **POST** /api/v1/global-credential/snmpv3 | Creates global SNMPv3 credential
*GlobalCredentialApi* | [**putGlobalCredentialByGlobalCredentialId**](docs/GlobalCredentialApi.md#putGlobalCredentialByGlobalCredentialId) | **PUT** /api/v1/global-credential/${globalCredentialId} | Update global credential for network devices in site(s)
*GlobalCredentialApi* | [**putGlobalCredentialCli**](docs/GlobalCredentialApi.md#putGlobalCredentialCli) | **PUT** /api/v1/global-credential/cli | Updates global CLI credential
*GlobalCredentialApi* | [**putGlobalCredentialHttpRead**](docs/GlobalCredentialApi.md#putGlobalCredentialHttpRead) | **PUT** /api/v1/global-credential/http-read | Updates global HTTP Read credential
*GlobalCredentialApi* | [**putGlobalCredentialHttpWrite**](docs/GlobalCredentialApi.md#putGlobalCredentialHttpWrite) | **PUT** /api/v1/global-credential/http-write | Updates global HTTP Write credential
*GlobalCredentialApi* | [**putGlobalCredentialNetconf**](docs/GlobalCredentialApi.md#putGlobalCredentialNetconf) | **PUT** /api/v1/global-credential/netconf | Updates global netconf credential
*GlobalCredentialApi* | [**putGlobalCredentialSnmpv2ReadCommunity**](docs/GlobalCredentialApi.md#putGlobalCredentialSnmpv2ReadCommunity) | **PUT** /api/v1/global-credential/snmpv2-read-community | Updates global SNMP read community
*GlobalCredentialApi* | [**putGlobalCredentialSnmpv2WriteCommunity**](docs/GlobalCredentialApi.md#putGlobalCredentialSnmpv2WriteCommunity) | **PUT** /api/v1/global-credential/snmpv2-write-community | Updates global SNMP write community
*GlobalCredentialApi* | [**putGlobalCredentialSnmpv3**](docs/GlobalCredentialApi.md#putGlobalCredentialSnmpv3) | **PUT** /api/v1/global-credential/snmpv3 | Updates global SNMPv3 credential
*ImageApi* | [**getImageImportation**](docs/ImageApi.md#getImageImportation) | **GET** /api/v1/image/importation | Get image details with filter
*ImageApi* | [**postImageActivationDevice**](docs/ImageApi.md#postImageActivationDevice) | **POST** /api/v1/image/activation/device | Trigger activation on a device
*ImageApi* | [**postImageDistribution**](docs/ImageApi.md#postImageDistribution) | **POST** /api/v1/image/distribution | Trigger distribution of an image
*ImageApi* | [**postImageImportationSourceFile**](docs/ImageApi.md#postImageImportationSourceFile) | **POST** /api/v1/image/importation/source/file | Import an image from local file system
*ImageApi* | [**postImageImportationSourceUrl**](docs/ImageApi.md#postImageImportationSourceUrl) | **POST** /api/v1/image/importation/source/url | Trigger now or schedule import of an image from a URL
*InterfaceApi* | [**getInterface**](docs/InterfaceApi.md#getInterface) | **GET** /api/v1/interface | Retrieves all interfaces
*InterfaceApi* | [**getInterfaceById**](docs/InterfaceApi.md#getInterfaceById) | **GET** /api/v1/interface/${id} | Retrieves interface by ID
*InterfaceApi* | [**getInterfaceCount**](docs/InterfaceApi.md#getInterfaceCount) | **GET** /api/v1/interface/count | Retrieves interface count
*InterfaceApi* | [**getInterfaceIpAddressByIpAddress**](docs/InterfaceApi.md#getInterfaceIpAddressByIpAddress) | **GET** /api/v1/interface/ip-address/${ipAddress} | Retrieves interfaces by IP address
*InterfaceApi* | [**getInterfaceIsis**](docs/InterfaceApi.md#getInterfaceIsis) | **GET** /api/v1/interface/isis | Retrieves ISIS interfaces
*InterfaceApi* | [**getInterfaceNetworkDeviceByDeviceId**](docs/InterfaceApi.md#getInterfaceNetworkDeviceByDeviceId) | **GET** /api/v1/interface/network-device/${deviceId} | Retrieves device interfaces
*InterfaceApi* | [**getInterfaceNetworkDeviceCountByDeviceId**](docs/InterfaceApi.md#getInterfaceNetworkDeviceCountByDeviceId) | **GET** /api/v1/interface/network-device/${deviceId}/count | Retrieves device interface count
*InterfaceApi* | [**getInterfaceNetworkDeviceInterfaceNameByDeviceId**](docs/InterfaceApi.md#getInterfaceNetworkDeviceInterfaceNameByDeviceId) | **GET** /api/v1/interface/network-device/${deviceId}/interface-name | Retrieves interface for the given device and interface name
*InterfaceApi* | [**getInterfaceOspf**](docs/InterfaceApi.md#getInterfaceOspf) | **GET** /api/v1/interface/ospf | Retrieves OSPF interfaces
*InterfaceApi* | [**getNetworkDeviceByDeviceIdRange**](docs/InterfaceApi.md#getNetworkDeviceByDeviceIdRange) | **GET** /api/v1/interface/network-device/${deviceId}/${startIndex}/${recordsToReturn} | Retrieves device interfaces in the given range
*MiscApi* | [**getFlowAnalysisByFlowAnalysisId**](docs/MiscApi.md#getFlowAnalysisByFlowAnalysisId) | **GET** /api/v1/flow-analysis/${flowAnalysisId} | Retrieves result of a previously requested flow analysis
*MiscApi* | [**getSnmpProperty**](docs/MiscApi.md#getSnmpProperty) | **GET** /api/v1/snmp-property | Retrieves SNMP properties
*MiscApi* | [**postAuthToken**](docs/MiscApi.md#postAuthToken) | **POST** /api/system/v1/auth/token | Generate Token
*MiscApi* | [**postFlowAnalysis**](docs/MiscApi.md#postFlowAnalysis) | **POST** /api/v1/flow-analysis | Initiates a new flow analysis
*MiscApi* | [**postSnmpProperty**](docs/MiscApi.md#postSnmpProperty) | **POST** /api/v1/snmp-property | Creates or updates SNMP properties
*NetworkDeviceApi* | [**deleteNetworkDeviceById**](docs/NetworkDeviceApi.md#deleteNetworkDeviceById) | **DELETE** /api/v1/network-device/${id} | Delete network device by ID
*NetworkDeviceApi* | [**getNetworkDevice**](docs/NetworkDeviceApi.md#getNetworkDevice) | **GET** /api/v1/network-device | Retrieves all network devices
*NetworkDeviceApi* | [**getNetworkDeviceAutocomplete**](docs/NetworkDeviceApi.md#getNetworkDeviceAutocomplete) | **GET** /api/v1/network-device/autocomplete | Retrieves all network devices
*NetworkDeviceApi* | [**getNetworkDeviceBriefById**](docs/NetworkDeviceApi.md#getNetworkDeviceBriefById) | **GET** /api/v1/network-device/${id}/brief | Retrieves network device brief by ID
*NetworkDeviceApi* | [**getNetworkDeviceById**](docs/NetworkDeviceApi.md#getNetworkDeviceById) | **GET** /api/v1/network-device/${id} | Retrieves network device by ID
*NetworkDeviceApi* | [**getNetworkDeviceCollectionScheduleById**](docs/NetworkDeviceApi.md#getNetworkDeviceCollectionScheduleById) | **GET** /api/v1/network-device/${id}/collection-schedule | Retrieves the collection interval specified by device ID
*NetworkDeviceApi* | [**getNetworkDeviceCollectionScheduleGlobal**](docs/NetworkDeviceApi.md#getNetworkDeviceCollectionScheduleGlobal) | **GET** /api/v1/network-device/collection-schedule/global | Retrieves the collection interval of all devices
*NetworkDeviceApi* | [**getNetworkDeviceConfig**](docs/NetworkDeviceApi.md#getNetworkDeviceConfig) | **GET** /api/v1/network-device/config | Retrieves device config list
*NetworkDeviceApi* | [**getNetworkDeviceConfigByNetworkDeviceId**](docs/NetworkDeviceApi.md#getNetworkDeviceConfigByNetworkDeviceId) | **GET** /api/v1/network-device/${networkDeviceId}/config | Retrieves device config
*NetworkDeviceApi* | [**getNetworkDeviceConfigCount**](docs/NetworkDeviceApi.md#getNetworkDeviceConfigCount) | **GET** /api/v1/network-device/config/count | Retrieves config count
*NetworkDeviceApi* | [**getNetworkDeviceCount**](docs/NetworkDeviceApi.md#getNetworkDeviceCount) | **GET** /api/v1/network-device/count | Retrieves network device count
*NetworkDeviceApi* | [**getNetworkDeviceFunctionalCapability**](docs/NetworkDeviceApi.md#getNetworkDeviceFunctionalCapability) | **GET** /api/v1/network-device/functional-capability | Retrieves all functional-capability of devices
*NetworkDeviceApi* | [**getNetworkDeviceFunctionalCapabilityById**](docs/NetworkDeviceApi.md#getNetworkDeviceFunctionalCapabilityById) | **GET** /api/v1/network-device/functional-capability/${id} | Gets the functional capability by id
*NetworkDeviceApi* | [**getNetworkDeviceFunctionalCcapabilityAutocomplete**](docs/NetworkDeviceApi.md#getNetworkDeviceFunctionalCcapabilityAutocomplete) | **GET** /api/v1/network-device/functional-capability/autocomplete | Retrieve the values of given fields
*NetworkDeviceApi* | [**getNetworkDeviceIpAddressByIpAddress**](docs/NetworkDeviceApi.md#getNetworkDeviceIpAddressByIpAddress) | **GET** /api/v1/network-device/ip-address/${ipAddress} | Retrieves network device by IP address
*NetworkDeviceApi* | [**getNetworkDeviceMerakiOrganizationById**](docs/NetworkDeviceApi.md#getNetworkDeviceMerakiOrganizationById) | **GET** /api/v1/network-device/${id}/meraki-organization | Get the organizations chosen while adding the meraki dashboard
*NetworkDeviceApi* | [**getNetworkDeviceModule**](docs/NetworkDeviceApi.md#getNetworkDeviceModule) | **GET** /api/v1/network-device/module | Gives all the modules associated with given device id
*NetworkDeviceApi* | [**getNetworkDeviceModuleById**](docs/NetworkDeviceApi.md#getNetworkDeviceModuleById) | **GET** /api/v1/network-device/module/${id} | Gives Module info by its id
*NetworkDeviceApi* | [**getNetworkDeviceModuleCount**](docs/NetworkDeviceApi.md#getNetworkDeviceModuleCount) | **GET** /api/v1/network-device/module/count | Gives total number of Modules
*NetworkDeviceApi* | [**getNetworkDevicePollerCliLegitReads**](docs/NetworkDeviceApi.md#getNetworkDevicePollerCliLegitReads) | **GET** /api/v1/network-device-poller/cli/legit-reads | Get all keywords of CLIs accepted by command runner
*NetworkDeviceApi* | [**getNetworkDeviceRange**](docs/NetworkDeviceApi.md#getNetworkDeviceRange) | **GET** /api/v1/network-device/${startIndex}/${recordsToReturn} | Retrieves network device by range
*NetworkDeviceApi* | [**getNetworkDeviceSerialNumberBySerialNumber**](docs/NetworkDeviceApi.md#getNetworkDeviceSerialNumberBySerialNumber) | **GET** /api/v1/network-device/serial-number/${serialNumber} | Retrieves network device by serial number
*NetworkDeviceApi* | [**getNetworkDeviceTenantinfoMacaddress**](docs/NetworkDeviceApi.md#getNetworkDeviceTenantinfoMacaddress) | **GET** /api/v1/network-device/tenantinfo/macaddress | Updates certificate validation status and returns tenantId
*NetworkDeviceApi* | [**getNetworkDeviceVlanById**](docs/NetworkDeviceApi.md#getNetworkDeviceVlanById) | **GET** /api/v1/network-device/${id}/vlan | Retrieves list of VLAN data that are associated with interface for a device
*NetworkDeviceApi* | [**getNetworkDeviceWirelessInfoById**](docs/NetworkDeviceApi.md#getNetworkDeviceWirelessInfoById) | **GET** /api/v1/network-device/${id}/wireless-info | Retrieves wireless lan conrtoller info by Device ID
*NetworkDeviceApi* | [**postNetworkDevice**](docs/NetworkDeviceApi.md#postNetworkDevice) | **POST** /api/v1/network-device | Network device POST api
*NetworkDeviceApi* | [**postNetworkDeviceFile**](docs/NetworkDeviceApi.md#postNetworkDeviceFile) | **POST** /api/v1/network-device/file | Export network-device to file
*NetworkDeviceApi* | [**postNetworkDevicePollerCliReadRequest**](docs/NetworkDeviceApi.md#postNetworkDevicePollerCliReadRequest) | **POST** /api/v1/network-device-poller/cli/read-request | Run read-only commands on devices to get their real-time configuration
*NetworkDeviceApi* | [**putNetworkDevice**](docs/NetworkDeviceApi.md#putNetworkDevice) | **PUT** /api/v1/network-device | Network device sync api
*NetworkDeviceApi* | [**putNetworkDeviceBrief**](docs/NetworkDeviceApi.md#putNetworkDeviceBrief) | **PUT** /api/v1/network-device/brief | Updates network device role
*NetworkDeviceApi* | [**putNetworkDeviceSync**](docs/NetworkDeviceApi.md#putNetworkDeviceSync) | **PUT** /api/v1/network-device/sync | Network device sync api
*OnboardingApi* | [**deleteOnboardingPnpDeviceById**](docs/OnboardingApi.md#deleteOnboardingPnpDeviceById) | **DELETE** /api/v1/onboarding/pnp-device/${id} | Delete Device
*OnboardingApi* | [**deleteOnboardingPnpSettingsVacct**](docs/OnboardingApi.md#deleteOnboardingPnpSettingsVacct) | **DELETE** /api/v1/onboarding/pnp-settings/vacct | Deregister Virtual Account
*OnboardingApi* | [**deleteOnboardingPnpWorkflowById**](docs/OnboardingApi.md#deleteOnboardingPnpWorkflowById) | **DELETE** /api/v1/onboarding/pnp-workflow/${id} | Delete Workflow
*OnboardingApi* | [**getOnboardingPnpDevice**](docs/OnboardingApi.md#getOnboardingPnpDevice) | **GET** /api/v1/onboarding/pnp-device | List devices
*OnboardingApi* | [**getOnboardingPnpDeviceById**](docs/OnboardingApi.md#getOnboardingPnpDeviceById) | **GET** /api/v1/onboarding/pnp-device/${id} | Get Device by ID
*OnboardingApi* | [**getOnboardingPnpDeviceCcount**](docs/OnboardingApi.md#getOnboardingPnpDeviceCcount) | **GET** /api/v1/onboarding/pnp-device/count | Get Device Count
*OnboardingApi* | [**getOnboardingPnpDeviceDashboardCount**](docs/OnboardingApi.md#getOnboardingPnpDeviceDashboardCount) | **GET** /api/v1/onboarding/pnp-device/dashboard/count | Get Categorized Device Count
*OnboardingApi* | [**getOnboardingPnpDeviceHistory**](docs/OnboardingApi.md#getOnboardingPnpDeviceHistory) | **GET** /api/v1/onboarding/pnp-device/history | Get Device History
*OnboardingApi* | [**getOnboardingPnpDeviceSacctVacctSyncResultByDomainAndName**](docs/OnboardingApi.md#getOnboardingPnpDeviceSacctVacctSyncResultByDomainAndName) | **GET** /api/v1/onboarding/pnp-device/sacct/${domain}/vacct/${name}/sync-result | Get Sync Result for Virtual Account
*OnboardingApi* | [**getOnboardingPnpSettings**](docs/OnboardingApi.md#getOnboardingPnpSettings) | **GET** /api/v1/onboarding/pnp-settings | View Settings
*OnboardingApi* | [**getOnboardingPnpSettingsSacct**](docs/OnboardingApi.md#getOnboardingPnpSettingsSacct) | **GET** /api/v1/onboarding/pnp-settings/sacct | Get Smart Account List
*OnboardingApi* | [**getOnboardingPnpSettingsSacctVacctByDomain**](docs/OnboardingApi.md#getOnboardingPnpSettingsSacctVacctByDomain) | **GET** /api/v1/onboarding/pnp-settings/sacct/${domain}/vacct | Get Virtual Account List
*OnboardingApi* | [**getOnboardingPnpWorkflow**](docs/OnboardingApi.md#getOnboardingPnpWorkflow) | **GET** /api/v1/onboarding/pnp-workflow | List Workflows
*OnboardingApi* | [**getOnboardingPnpWorkflowById**](docs/OnboardingApi.md#getOnboardingPnpWorkflowById) | **GET** /api/v1/onboarding/pnp-workflow/${id} | Get Workflow
*OnboardingApi* | [**getOnboardingPnpWorkflowCount**](docs/OnboardingApi.md#getOnboardingPnpWorkflowCount) | **GET** /api/v1/onboarding/pnp-workflow/count | Get Workflow Count
*OnboardingApi* | [**postOnboardingPnpDevice**](docs/OnboardingApi.md#postOnboardingPnpDevice) | **POST** /api/v1/onboarding/pnp-device | Create Device
*OnboardingApi* | [**postOnboardingPnpDeviceClaim**](docs/OnboardingApi.md#postOnboardingPnpDeviceClaim) | **POST** /api/v1/onboarding/pnp-device/claim | Claim Device(s)
*OnboardingApi* | [**postOnboardingPnpDeviceImport**](docs/OnboardingApi.md#postOnboardingPnpDeviceImport) | **POST** /api/v1/onboarding/pnp-device/import | Import Many Devices
*OnboardingApi* | [**postOnboardingPnpDeviceProvision**](docs/OnboardingApi.md#postOnboardingPnpDeviceProvision) | **POST** /api/v1/onboarding/pnp-device/provision | Provision Device
*OnboardingApi* | [**postOnboardingPnpDeviceReset**](docs/OnboardingApi.md#postOnboardingPnpDeviceReset) | **POST** /api/v1/onboarding/pnp-device/reset | Reset Device
*OnboardingApi* | [**postOnboardingPnpDeviceUnclaim**](docs/OnboardingApi.md#postOnboardingPnpDeviceUnclaim) | **POST** /api/v1/onboarding/pnp-device/unclaim | Un-Claim Device
*OnboardingApi* | [**postOnboardingPnpDeviceVacctSync**](docs/OnboardingApi.md#postOnboardingPnpDeviceVacctSync) | **POST** /api/v1/onboarding/pnp-device/vacct-sync | Sync Virtual Account Devices
*OnboardingApi* | [**postOnboardingPnpSettingsSavacct**](docs/OnboardingApi.md#postOnboardingPnpSettingsSavacct) | **POST** /api/v1/onboarding/pnp-settings/savacct | Add Virtual Account
*OnboardingApi* | [**postOnboardingPnpWorkflow**](docs/OnboardingApi.md#postOnboardingPnpWorkflow) | **POST** /api/v1/onboarding/pnp-workflow | Create Workflow
*OnboardingApi* | [**putOnboardingPnpDeviceById**](docs/OnboardingApi.md#putOnboardingPnpDeviceById) | **PUT** /api/v1/onboarding/pnp-device/${id} | Update Device
*OnboardingApi* | [**putOnboardingPnpSettings**](docs/OnboardingApi.md#putOnboardingPnpSettings) | **PUT** /api/v1/onboarding/pnp-settings | Update Settings
*OnboardingApi* | [**putOnboardingPnpSettingsSavacct**](docs/OnboardingApi.md#putOnboardingPnpSettingsSavacct) | **PUT** /api/v1/onboarding/pnp-settings/savacct | Edit PnP Server Profile
*OnboardingApi* | [**putOnboardingPnpWorkflowById**](docs/OnboardingApi.md#putOnboardingPnpWorkflowById) | **PUT** /api/v1/onboarding/pnp-workflow/${id} | Update Workflow
*TaskApi* | [**getTask**](docs/TaskApi.md#getTask) | **GET** /api/v1/task | Get filtered tasks
*TaskApi* | [**getTaskByTaskId**](docs/TaskApi.md#getTaskByTaskId) | **GET** /api/v1/task/${taskId} | getTruststoreFileCount
*TaskApi* | [**getTaskCount**](docs/TaskApi.md#getTaskCount) | **GET** /api/v1/task/count | Get task count
*TaskApi* | [**getTaskOperationByOperationIdRange**](docs/TaskApi.md#getTaskOperationByOperationIdRange) | **GET** /api/v1/task/operation/${operationId}/${offset}/${limit} | getTaskByOperationId
*TaskApi* | [**getTaskTreeByTaskId**](docs/TaskApi.md#getTaskTreeByTaskId) | **GET** /api/v1/task/${taskId}/tree | Get Task Tree
*TemplateProgrammerApi* | [**deleteTemplateProgrammerProjectByProjectId**](docs/TemplateProgrammerApi.md#deleteTemplateProgrammerProjectByProjectId) | **DELETE** /api/v1/template-programmer/project/${projectId} | Deletes the project
*TemplateProgrammerApi* | [**deleteTemplateProgrammerTemplateByTemplateId**](docs/TemplateProgrammerApi.md#deleteTemplateProgrammerTemplateByTemplateId) | **DELETE** /api/v1/template-programmer/template/${templateId} | Deletes the template
*TemplateProgrammerApi* | [**getTemplateProgrammerProject**](docs/TemplateProgrammerApi.md#getTemplateProgrammerProject) | **GET** /api/v1/template-programmer/project | Gets a list of projects
*TemplateProgrammerApi* | [**getTemplateProgrammerTemplate**](docs/TemplateProgrammerApi.md#getTemplateProgrammerTemplate) | **GET** /api/v1/template-programmer/template | Gets the templates available depending on the criteria
*TemplateProgrammerApi* | [**getTemplateProgrammerTemplateDeployStatusByDeploymentId**](docs/TemplateProgrammerApi.md#getTemplateProgrammerTemplateDeployStatusByDeploymentId) | **GET** /api/v1/template-programmer/template/deploy/status/${deploymentId} | Status of template deployment
*TemplateProgrammerApi* | [**getTemplateProgrammerTemplateVersionByTempleteId**](docs/TemplateProgrammerApi.md#getTemplateProgrammerTemplateVersionByTempleteId) | **GET** /api/v1/template-programmer/template/version/${templateId} | Gets all the versions of a given template
*TemplateProgrammerApi* | [**postTemplateProgrammerProject**](docs/TemplateProgrammerApi.md#postTemplateProgrammerProject) | **POST** /api/v1/template-programmer/project | Create Project
*TemplateProgrammerApi* | [**postTemplateProgrammerProjectTemplateByProjectId**](docs/TemplateProgrammerApi.md#postTemplateProgrammerProjectTemplateByProjectId) | **POST** /api/v1/template-programmer/project/${projectId}/template | Create Template
*TemplateProgrammerApi* | [**postTemplateProgrammerTemplateDeploy**](docs/TemplateProgrammerApi.md#postTemplateProgrammerTemplateDeploy) | **POST** /api/v1/template-programmer/template/deploy | Deploy Template
*TemplateProgrammerApi* | [**postTemplateProgrammerTemplateVersion**](docs/TemplateProgrammerApi.md#postTemplateProgrammerTemplateVersion) | **POST** /api/v1/template-programmer/template/version | Version Template
*TemplateProgrammerApi* | [**putTemplateProgrammerProject**](docs/TemplateProgrammerApi.md#putTemplateProgrammerProject) | **PUT** /api/v1/template-programmer/project | Update Project
*TemplateProgrammerApi* | [**putTemplateProgrammerTemplate**](docs/TemplateProgrammerApi.md#putTemplateProgrammerTemplate) | **PUT** /api/v1/template-programmer/template | Update Template
*TemplateProgrammerApi* | [**putTemplateProgrammerTemplatePreview**](docs/TemplateProgrammerApi.md#putTemplateProgrammerTemplatePreview) | **PUT** /api/v1/template-programmer/template/preview | Preview Template
*TemplateProgrammerApi* | [**templateProgrammerTemplateByTemplateId**](docs/TemplateProgrammerApi.md#templateProgrammerTemplateByTemplateId) | **GET** /api/v1/template-programmer/template/${templateId} | Gets details of a given template
*TopologyApi* | [**getTopologyL2ByVlanId**](docs/TopologyApi.md#getTopologyL2ByVlanId) | **GET** /api/v1/topology/l2/${vlanID} | getL2Topology
*TopologyApi* | [**getTopologyL3ByTopologyType**](docs/TopologyApi.md#getTopologyL3ByTopologyType) | **GET** /api/v1/topology/l3/${topologyType} | getL3Topology
*TopologyApi* | [**getTopologyPhysicalTopology**](docs/TopologyApi.md#getTopologyPhysicalTopology) | **GET** /api/v1/topology/physical-topology | getPhysicalTopology
*TopologyApi* | [**getTopologySiteTopology**](docs/TopologyApi.md#getTopologySiteTopology) | **GET** /api/v1/topology/site-topology | getSiteTopology
*TopologyApi* | [**getTopologyVlanVlanNames**](docs/TopologyApi.md#getTopologyVlanVlanNames) | **GET** /api/v1/topology/vlan/vlan-names | getVlanNames


## Documentation for Models

 - [ActivateDTO](docs/ActivateDTO.md)
 - [ActivateDTOInner](docs/ActivateDTOInner.md)
 - [AddVirtualAccountResponse](docs/AddVirtualAccountResponse.md)
 - [CLICredentialDTO](docs/CLICredentialDTO.md)
 - [CLICredentialDTOInner](docs/CLICredentialDTOInner.md)
 - [ClaimDeviceRequest](docs/ClaimDeviceRequest.md)
 - [ClaimDevicesResponse](docs/ClaimDevicesResponse.md)
 - [ClientDetailResponse](docs/ClientDetailResponse.md)
 - [ClientDetailResponseResponse](docs/ClientDetailResponseResponse.md)
 - [ClientDetailResponseResponseConnectionInfo](docs/ClientDetailResponseResponseConnectionInfo.md)
 - [ClientDetailResponseResponseDetail](docs/ClientDetailResponseResponseDetail.md)
 - [ClientDetailResponseResponseDetailHealthScore](docs/ClientDetailResponseResponseDetailHealthScore.md)
 - [ClientDetailResponseResponseDetailOnboarding](docs/ClientDetailResponseResponseDetailOnboarding.md)
 - [ClientDetailResponseResponseTopology](docs/ClientDetailResponseResponseTopology.md)
 - [ClientDetailResponseResponseTopologyLinks](docs/ClientDetailResponseResponseTopologyLinks.md)
 - [ClientDetailResponseResponseTopologyNodes](docs/ClientDetailResponseResponseTopologyNodes.md)
 - [ClientHealthResponse](docs/ClientHealthResponse.md)
 - [ClientHealthResponseResponse](docs/ClientHealthResponseResponse.md)
 - [ClientHealthResponseScoreCategory](docs/ClientHealthResponseScoreCategory.md)
 - [ClientHealthResponseScoreDetail](docs/ClientHealthResponseScoreDetail.md)
 - [CollectionProjectDTO](docs/CollectionProjectDTO.md)
 - [CollectionTemplateInfo](docs/CollectionTemplateInfo.md)
 - [CommandRunnerDTO](docs/CommandRunnerDTO.md)
 - [CountResult](docs/CountResult.md)
 - [CreateDeviceResponse](docs/CreateDeviceResponse.md)
 - [CreateSSIDRequest](docs/CreateSSIDRequest.md)
 - [CreateSSIDResponse](docs/CreateSSIDResponse.md)
 - [CreateWorkflowResponse](docs/CreateWorkflowResponse.md)
 - [DeleteDeviceResponse](docs/DeleteDeviceResponse.md)
 - [DeleteSSIDResponse](docs/DeleteSSIDResponse.md)
 - [DeleteWorkflowResponse](docs/DeleteWorkflowResponse.md)
 - [DeregisterVirtualAccountResponse](docs/DeregisterVirtualAccountResponse.md)
 - [Device](docs/Device.md)
 - [DeviceIfListResult](docs/DeviceIfListResult.md)
 - [DeviceIfListResultResponse](docs/DeviceIfListResultResponse.md)
 - [DeviceIfResult](docs/DeviceIfResult.md)
 - [DeviceInner](docs/DeviceInner.md)
 - [DeviceInnerDeviceInfo](docs/DeviceInnerDeviceInfo.md)
 - [DeviceInnerDeviceInfoAaaCredentials](docs/DeviceInnerDeviceInfoAaaCredentials.md)
 - [DeviceInnerDeviceInfoFileSystemList](docs/DeviceInnerDeviceInfoFileSystemList.md)
 - [DeviceInnerDeviceInfoIpInterfaces](docs/DeviceInnerDeviceInfoIpInterfaces.md)
 - [DeviceInnerDeviceInfoLocation](docs/DeviceInnerDeviceInfoLocation.md)
 - [DeviceInnerDeviceInfoNeighborLinks](docs/DeviceInnerDeviceInfoNeighborLinks.md)
 - [DeviceInnerDeviceInfoPnpProfileList](docs/DeviceInnerDeviceInfoPnpProfileList.md)
 - [DeviceInnerDeviceInfoPreWorkflowCliOuputs](docs/DeviceInnerDeviceInfoPreWorkflowCliOuputs.md)
 - [DeviceInnerDeviceInfoPrimaryEndpoint](docs/DeviceInnerDeviceInfoPrimaryEndpoint.md)
 - [DeviceInnerDeviceInfoStackInfo](docs/DeviceInnerDeviceInfoStackInfo.md)
 - [DeviceInnerDeviceInfoStackInfoStackMemberList](docs/DeviceInnerDeviceInfoStackInfoStackMemberList.md)
 - [DeviceInnerHistoryTaskInfo](docs/DeviceInnerHistoryTaskInfo.md)
 - [DeviceInnerHistoryTaskInfoWorkItemList](docs/DeviceInnerHistoryTaskInfoWorkItemList.md)
 - [DeviceInnerRunSummaryList](docs/DeviceInnerRunSummaryList.md)
 - [DeviceInnerSystemResetWorkflow](docs/DeviceInnerSystemResetWorkflow.md)
 - [DeviceInnerSystemResetWorkflowTasks](docs/DeviceInnerSystemResetWorkflowTasks.md)
 - [DeviceInnerWorkflowParameters](docs/DeviceInnerWorkflowParameters.md)
 - [DiscoveryJobNIOListResult](docs/DiscoveryJobNIOListResult.md)
 - [DiscoveryJobNIOListResultResponse](docs/DiscoveryJobNIOListResultResponse.md)
 - [DiscoveryNIO](docs/DiscoveryNIO.md)
 - [DiscoveryNIOListResult](docs/DiscoveryNIOListResult.md)
 - [DiscoveryNIOResult](docs/DiscoveryNIOResult.md)
 - [DiscoveryNIOResultResponse](docs/DiscoveryNIOResultResponse.md)
 - [DistributeDTO](docs/DistributeDTO.md)
 - [DistributeDTOInner](docs/DistributeDTOInner.md)
 - [DownloadsAFileReferredByTheFileIdResponse](docs/DownloadsAFileReferredByTheFileIdResponse.md)
 - [EditPnPServerProfileResponse](docs/EditPnPServerProfileResponse.md)
 - [ExportDeviceDTO](docs/ExportDeviceDTO.md)
 - [FileObjectListResult](docs/FileObjectListResult.md)
 - [FileObjectListResultResponse](docs/FileObjectListResultResponse.md)
 - [FlowAnalysisListOutput](docs/FlowAnalysisListOutput.md)
 - [FlowAnalysisListOutputResponse](docs/FlowAnalysisListOutputResponse.md)
 - [FlowAnalysisRequest](docs/FlowAnalysisRequest.md)
 - [FlowAnalysisRequestResultOutput](docs/FlowAnalysisRequestResultOutput.md)
 - [FlowAnalysisRequestResultOutputResponse](docs/FlowAnalysisRequestResultOutputResponse.md)
 - [FunctionalCapabilityListResult](docs/FunctionalCapabilityListResult.md)
 - [FunctionalCapabilityListResultFunctionDetails](docs/FunctionalCapabilityListResultFunctionDetails.md)
 - [FunctionalCapabilityListResultFunctionalCapability](docs/FunctionalCapabilityListResultFunctionalCapability.md)
 - [FunctionalCapabilityListResultResponse](docs/FunctionalCapabilityListResultResponse.md)
 - [FunctionalCapabilityResult](docs/FunctionalCapabilityResult.md)
 - [GenerateTokenRequest](docs/GenerateTokenRequest.md)
 - [GenerateTokenResponse](docs/GenerateTokenResponse.md)
 - [GetCategorizedDeviceCountResponse](docs/GetCategorizedDeviceCountResponse.md)
 - [GetDeviceByIDResponse](docs/GetDeviceByIDResponse.md)
 - [GetDeviceCountResponse](docs/GetDeviceCountResponse.md)
 - [GetDeviceHistoryResponse](docs/GetDeviceHistoryResponse.md)
 - [GetSmartAccountListResponse](docs/GetSmartAccountListResponse.md)
 - [GetSyncResultForVirtualAccountResponse](docs/GetSyncResultForVirtualAccountResponse.md)
 - [GetVirtualAccountListResponse](docs/GetVirtualAccountListResponse.md)
 - [GetWorkflowCountResponse](docs/GetWorkflowCountResponse.md)
 - [GetWorkflowResponse](docs/GetWorkflowResponse.md)
 - [GlobalCredentialListResult](docs/GlobalCredentialListResult.md)
 - [GlobalCredentialListResultResponse](docs/GlobalCredentialListResultResponse.md)
 - [GlobalCredentialSubTypeResult](docs/GlobalCredentialSubTypeResult.md)
 - [HTTPReadCredentialDTO](docs/HTTPReadCredentialDTO.md)
 - [HTTPReadCredentialDTOInner](docs/HTTPReadCredentialDTOInner.md)
 - [HTTPWriteCredentialDTO](docs/HTTPWriteCredentialDTO.md)
 - [ImageImportFromUrlDTO](docs/ImageImportFromUrlDTO.md)
 - [ImageImportFromUrlDTOInner](docs/ImageImportFromUrlDTOInner.md)
 - [ImageInfoListResponse](docs/ImageInfoListResponse.md)
 - [ImageInfoListResponseApplicableDevicesForImage](docs/ImageInfoListResponseApplicableDevicesForImage.md)
 - [ImageInfoListResponseProfileInfo](docs/ImageInfoListResponseProfileInfo.md)
 - [ImageInfoListResponseResponse](docs/ImageInfoListResponseResponse.md)
 - [ImportManyDevicesResponse](docs/ImportManyDevicesResponse.md)
 - [InventoryDeviceInfo](docs/InventoryDeviceInfo.md)
 - [InventoryDeviceInfoUpdateMgmtIPaddressList](docs/InventoryDeviceInfoUpdateMgmtIPaddressList.md)
 - [InventoryRequest](docs/InventoryRequest.md)
 - [LegitCliKeyResult](docs/LegitCliKeyResult.md)
 - [ListDevicesResponse](docs/ListDevicesResponse.md)
 - [ListWorkflowsResponse](docs/ListWorkflowsResponse.md)
 - [ModuleListResult](docs/ModuleListResult.md)
 - [ModuleResult](docs/ModuleResult.md)
 - [ModuleResultResponse](docs/ModuleResultResponse.md)
 - [NameSpaceListResult](docs/NameSpaceListResult.md)
 - [NetconfCredentialDTO](docs/NetconfCredentialDTO.md)
 - [NetconfCredentialDTOInner](docs/NetconfCredentialDTOInner.md)
 - [NetworkDeviceBriefNIO](docs/NetworkDeviceBriefNIO.md)
 - [NetworkDeviceBriefNIOResult](docs/NetworkDeviceBriefNIOResult.md)
 - [NetworkDeviceBriefNIOResultResponse](docs/NetworkDeviceBriefNIOResultResponse.md)
 - [NetworkDeviceDetailResponse](docs/NetworkDeviceDetailResponse.md)
 - [NetworkDeviceDetailResponseResponse](docs/NetworkDeviceDetailResponseResponse.md)
 - [NetworkDeviceListResult](docs/NetworkDeviceListResult.md)
 - [NetworkDeviceListResultResponse](docs/NetworkDeviceListResultResponse.md)
 - [NetworkDeviceNIOListResult](docs/NetworkDeviceNIOListResult.md)
 - [NetworkDeviceNIOListResultResponse](docs/NetworkDeviceNIOListResultResponse.md)
 - [NetworkDeviceResult](docs/NetworkDeviceResult.md)
 - [NetworkDeviceSyncApiRequest](docs/NetworkDeviceSyncApiRequest.md)
 - [PathResponseResult](docs/PathResponseResult.md)
 - [PathResponseResultResponse](docs/PathResponseResultResponse.md)
 - [PathResponseResultResponseAccuracyList](docs/PathResponseResultResponseAccuracyList.md)
 - [PathResponseResultResponseDetailedStatus](docs/PathResponseResultResponseDetailedStatus.md)
 - [PathResponseResultResponseDeviceStatistics](docs/PathResponseResultResponseDeviceStatistics.md)
 - [PathResponseResultResponseDeviceStatisticsCpuStatistics](docs/PathResponseResultResponseDeviceStatisticsCpuStatistics.md)
 - [PathResponseResultResponseDeviceStatisticsMemoryStatistics](docs/PathResponseResultResponseDeviceStatisticsMemoryStatistics.md)
 - [PathResponseResultResponseEgressInterface](docs/PathResponseResultResponseEgressInterface.md)
 - [PathResponseResultResponseEgressPhysicalInterface](docs/PathResponseResultResponseEgressPhysicalInterface.md)
 - [PathResponseResultResponseEgressPhysicalInterfaceAclAnalysis](docs/PathResponseResultResponseEgressPhysicalInterfaceAclAnalysis.md)
 - [PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingAces](docs/PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingAces.md)
 - [PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts](docs/PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts.md)
 - [PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisPorts](docs/PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisPorts.md)
 - [PathResponseResultResponseEgressPhysicalInterfaceInterfaceStatistics](docs/PathResponseResultResponseEgressPhysicalInterfaceInterfaceStatistics.md)
 - [PathResponseResultResponseEgressPhysicalInterfacePathOverlayInfo](docs/PathResponseResultResponseEgressPhysicalInterfacePathOverlayInfo.md)
 - [PathResponseResultResponseEgressPhysicalInterfaceQosStatistics](docs/PathResponseResultResponseEgressPhysicalInterfaceQosStatistics.md)
 - [PathResponseResultResponseEgressPhysicalInterfaceVxlanInfo](docs/PathResponseResultResponseEgressPhysicalInterfaceVxlanInfo.md)
 - [PathResponseResultResponseFlexConnect](docs/PathResponseResultResponseFlexConnect.md)
 - [PathResponseResultResponseNetworkElements](docs/PathResponseResultResponseNetworkElements.md)
 - [PathResponseResultResponseNetworkElementsInfo](docs/PathResponseResultResponseNetworkElementsInfo.md)
 - [PathResponseResultResponsePerfMonStatistics](docs/PathResponseResultResponsePerfMonStatistics.md)
 - [ProjectDTO](docs/ProjectDTO.md)
 - [ProvisionDeviceResponse](docs/ProvisionDeviceResponse.md)
 - [PushProvisionRequest](docs/PushProvisionRequest.md)
 - [RawCliInfoNIOListResult](docs/RawCliInfoNIOListResult.md)
 - [RawCliInfoNIOListResultResponse](docs/RawCliInfoNIOListResultResponse.md)
 - [RegisterNetworkDeviceResult](docs/RegisterNetworkDeviceResult.md)
 - [RegisterNetworkDeviceResultResponse](docs/RegisterNetworkDeviceResultResponse.md)
 - [ResetDeviceResponse](docs/ResetDeviceResponse.md)
 - [ResetRequest](docs/ResetRequest.md)
 - [ResetRequestConfigList](docs/ResetRequestConfigList.md)
 - [ResetRequestConfigParameters](docs/ResetRequestConfigParameters.md)
 - [ResetRequestDeviceResetList](docs/ResetRequestDeviceResetList.md)
 - [RetrievesAllNetworkDevicesResponse](docs/RetrievesAllNetworkDevicesResponse.md)
 - [SAVAMapping](docs/SAVAMapping.md)
 - [SAVAMappingProfile](docs/SAVAMappingProfile.md)
 - [SAVAMappingSyncResult](docs/SAVAMappingSyncResult.md)
 - [SAVAMappingSyncResultSyncList](docs/SAVAMappingSyncResultSyncList.md)
 - [SNMPvCredentialDTO](docs/SNMPvCredentialDTO.md)
 - [SNMPvCredentialDTOInner](docs/SNMPvCredentialDTOInner.md)
 - [SNMPvReadCommunityDTO](docs/SNMPvReadCommunityDTO.md)
 - [SNMPvWriteCommunityDTO](docs/SNMPvWriteCommunityDTO.md)
 - [SNMPvWriteCommunityDTOInner](docs/SNMPvWriteCommunityDTOInner.md)
 - [Settings](docs/Settings.md)
 - [SettingsDefaultProfile](docs/SettingsDefaultProfile.md)
 - [SettingsSavaMappingList](docs/SettingsSavaMappingList.md)
 - [SettingsTaskTimeOuts](docs/SettingsTaskTimeOuts.md)
 - [SiteHierarchyResponse](docs/SiteHierarchyResponse.md)
 - [SiteHierarchyResponseResponse](docs/SiteHierarchyResponseResponse.md)
 - [SiteResult](docs/SiteResult.md)
 - [SiteResultResponse](docs/SiteResultResponse.md)
 - [SiteResultResponseSites](docs/SiteResultResponseSites.md)
 - [SitesInfoDTO](docs/SitesInfoDTO.md)
 - [SuccessResult](docs/SuccessResult.md)
 - [SuccessResultList](docs/SuccessResultList.md)
 - [SyncVirtualAccountDevicesResponse](docs/SyncVirtualAccountDevicesResponse.md)
 - [SystemPropertyListResult](docs/SystemPropertyListResult.md)
 - [SystemPropertyListResultResponse](docs/SystemPropertyListResultResponse.md)
 - [SystemPropertyNameAndIntValueDTO](docs/SystemPropertyNameAndIntValueDTO.md)
 - [TaskDTOListResponse](docs/TaskDTOListResponse.md)
 - [TaskDTOResponse](docs/TaskDTOResponse.md)
 - [TaskDTOResponseResponse](docs/TaskDTOResponseResponse.md)
 - [TaskIdResult](docs/TaskIdResult.md)
 - [TaskIdResultResponse](docs/TaskIdResultResponse.md)
 - [TemplateDTO](docs/TemplateDTO.md)
 - [TemplateDTODeviceTypes](docs/TemplateDTODeviceTypes.md)
 - [TemplateDTORange](docs/TemplateDTORange.md)
 - [TemplateDTORollbackTemplateParams](docs/TemplateDTORollbackTemplateParams.md)
 - [TemplateDeploymentInfo](docs/TemplateDeploymentInfo.md)
 - [TemplateDeploymentInfoTargetInfo](docs/TemplateDeploymentInfoTargetInfo.md)
 - [TemplateDeploymentStatusDTO](docs/TemplateDeploymentStatusDTO.md)
 - [TemplateDeploymentStatusDTODevices](docs/TemplateDeploymentStatusDTODevices.md)
 - [TemplatePreviewRequestDTO](docs/TemplatePreviewRequestDTO.md)
 - [TemplatePreviewResponseDTO](docs/TemplatePreviewResponseDTO.md)
 - [TemplateVersionRequestDTO](docs/TemplateVersionRequestDTO.md)
 - [TopologyResult](docs/TopologyResult.md)
 - [TopologyResultResponse](docs/TopologyResultResponse.md)
 - [TopologyResultResponseCustomParam](docs/TopologyResultResponseCustomParam.md)
 - [TopologyResultResponseLinks](docs/TopologyResultResponseLinks.md)
 - [TopologyResultResponseNodes](docs/TopologyResultResponseNodes.md)
 - [UnClaimDeviceResponse](docs/UnClaimDeviceResponse.md)
 - [UnclaimRequest](docs/UnclaimRequest.md)
 - [UpdateDeviceResponse](docs/UpdateDeviceResponse.md)
 - [UpdateSettingsResponse](docs/UpdateSettingsResponse.md)
 - [UpdateWorkflowResponse](docs/UpdateWorkflowResponse.md)
 - [ViewSettingsResponse](docs/ViewSettingsResponse.md)
 - [VlanListResult](docs/VlanListResult.md)
 - [VlanListResultResponse](docs/VlanListResultResponse.md)
 - [VlanNamesResult](docs/VlanNamesResult.md)
 - [WirelessInfoResult](docs/WirelessInfoResult.md)
 - [WirelessInfoResultResponse](docs/WirelessInfoResultResponse.md)
 - [Workflow](docs/Workflow.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



