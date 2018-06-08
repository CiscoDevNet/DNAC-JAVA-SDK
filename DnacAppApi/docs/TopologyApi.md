# TopologyApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTopologyL2ByVlanId**](TopologyApi.md#getTopologyL2ByVlanId) | **GET** /api/v1/topology/l2/${vlanID} | getL2Topology
[**getTopologyL3ByTopologyType**](TopologyApi.md#getTopologyL3ByTopologyType) | **GET** /api/v1/topology/l3/${topologyType} | getL3Topology
[**getTopologyPhysicalTopology**](TopologyApi.md#getTopologyPhysicalTopology) | **GET** /api/v1/topology/physical-topology | getPhysicalTopology
[**getTopologySiteTopology**](TopologyApi.md#getTopologySiteTopology) | **GET** /api/v1/topology/site-topology | getSiteTopology
[**getTopologyVlanVlanNames**](TopologyApi.md#getTopologyVlanVlanNames) | **GET** /api/v1/topology/vlan/vlan-names | getVlanNames


<a name="getTopologyL2ByVlanId"></a>
# **getTopologyL2ByVlanId**
> TopologyResult getTopologyL2ByVlanId(vlanID)

getL2Topology

This method is used to obtain the Layer 2 topology by Vlan ID

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TopologyApi;


TopologyApi apiInstance = new TopologyApi();
String vlanID = "vlanID_example"; // String | Vlan Name for e.g Vlan1, Vlan23 etc
try {
    TopologyResult result = apiInstance.getTopologyL2ByVlanId(vlanID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologyApi#getTopologyL2ByVlanId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vlanID** | **String**| Vlan Name for e.g Vlan1, Vlan23 etc |

### Return type

[**TopologyResult**](TopologyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTopologyL3ByTopologyType"></a>
# **getTopologyL3ByTopologyType**
> TopologyResult getTopologyL3ByTopologyType(topologyType)

getL3Topology

This method is used to obtain Layer 3 device topology by routing protocol type

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TopologyApi;


TopologyApi apiInstance = new TopologyApi();
String topologyType = "topologyType_example"; // String | Type of topology(OSPF,ISIS,etc)
try {
    TopologyResult result = apiInstance.getTopologyL3ByTopologyType(topologyType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologyApi#getTopologyL3ByTopologyType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topologyType** | **String**| Type of topology(OSPF,ISIS,etc) |

### Return type

[**TopologyResult**](TopologyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTopologyPhysicalTopology"></a>
# **getTopologyPhysicalTopology**
> TopologyResult getTopologyPhysicalTopology(nodeType)

getPhysicalTopology

This method is used to obtain the raw physical topology and filter based on nodeType

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TopologyApi;


TopologyApi apiInstance = new TopologyApi();
String nodeType = "nodeType_example"; // String | nodeType
try {
    TopologyResult result = apiInstance.getTopologyPhysicalTopology(nodeType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologyApi#getTopologyPhysicalTopology");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeType** | **String**| nodeType | [optional]

### Return type

[**TopologyResult**](TopologyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTopologySiteTopology"></a>
# **getTopologySiteTopology**
> SiteResult getTopologySiteTopology()

getSiteTopology

This method is used to obtain the site topology

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TopologyApi;


TopologyApi apiInstance = new TopologyApi();
try {
    SiteResult result = apiInstance.getTopologySiteTopology();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologyApi#getTopologySiteTopology");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SiteResult**](SiteResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTopologyVlanVlanNames"></a>
# **getTopologyVlanVlanNames**
> VlanNamesResult getTopologyVlanVlanNames()

getVlanNames

This method is used to obtain the list of vlan names

### Example
```java
// Import classes:
//import cisco.com.dnac.v1.api.client.ApiException;
//import cisco.com.dnac.v1.api.client.api.TopologyApi;


TopologyApi apiInstance = new TopologyApi();
try {
    VlanNamesResult result = apiInstance.getTopologyVlanVlanNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologyApi#getTopologyVlanVlanNames");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VlanNamesResult**](VlanNamesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

