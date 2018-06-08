/*
 * Swagger
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cisco.com.dnac.v1.api.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SiteHierarchyResponseResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class SiteHierarchyResponseResponse {
  @SerializedName("siteName")
  private String siteName = null;

  @SerializedName("siteId")
  private String siteId = null;

  @SerializedName("parentSiteId")
  private String parentSiteId = null;

  @SerializedName("parentSiteName")
  private String parentSiteName = null;

  @SerializedName("siteType")
  private String siteType = null;

  @SerializedName("healthyNetworkDevicePercentage")
  private String healthyNetworkDevicePercentage = null;

  @SerializedName("healthyClientsPercentage")
  private String healthyClientsPercentage = null;

  @SerializedName("clientHealthWired")
  private String clientHealthWired = null;

  @SerializedName("clientHealthWireless")
  private String clientHealthWireless = null;

  @SerializedName("numberOfClients")
  private String numberOfClients = null;

  @SerializedName("clientNumberOfIssues")
  private String clientNumberOfIssues = null;

  @SerializedName("networkNumberOfIssues")
  private String networkNumberOfIssues = null;

  @SerializedName("numberOfNetworkDevice")
  private String numberOfNetworkDevice = null;

  @SerializedName("networkHealthAverage")
  private String networkHealthAverage = null;

  @SerializedName("networkHealthAccess")
  private String networkHealthAccess = null;

  @SerializedName("networkHealthCore")
  private String networkHealthCore = null;

  @SerializedName("networkHealthDistribution")
  private String networkHealthDistribution = null;

  @SerializedName("networkHealthRouter")
  private String networkHealthRouter = null;

  @SerializedName("networkHealthWireless")
  private String networkHealthWireless = null;

  @SerializedName("networkHealthOthers")
  private String networkHealthOthers = null;

  @SerializedName("numberOfWiredClients")
  private String numberOfWiredClients = null;

  @SerializedName("numberOfWirelessClients")
  private String numberOfWirelessClients = null;

  @SerializedName("wiredGoodClients")
  private String wiredGoodClients = null;

  @SerializedName("wirelessGoodClients")
  private String wirelessGoodClients = null;

  @SerializedName("clientIssueCount")
  private String clientIssueCount = null;

  @SerializedName("overallGoodDevices")
  private String overallGoodDevices = null;

  @SerializedName("accessGoodCount")
  private String accessGoodCount = null;

  @SerializedName("accessTotalCount")
  private String accessTotalCount = null;

  @SerializedName("coreGoodCount")
  private String coreGoodCount = null;

  @SerializedName("coreTotalCount")
  private String coreTotalCount = null;

  @SerializedName("distributionGoodCount")
  private String distributionGoodCount = null;

  @SerializedName("distributionTotalCount")
  private String distributionTotalCount = null;

  @SerializedName("routerGoodCount")
  private String routerGoodCount = null;

  @SerializedName("routerTotalCount")
  private String routerTotalCount = null;

  @SerializedName("wirelessDeviceGoodCount")
  private String wirelessDeviceGoodCount = null;

  @SerializedName("wirelessDeviceTotalCount")
  private String wirelessDeviceTotalCount = null;

  @SerializedName("applicationHealth")
  private String applicationHealth = null;

  @SerializedName("applicationGoodCount")
  private String applicationGoodCount = null;

  @SerializedName("applicationTotalCount")
  private String applicationTotalCount = null;

  @SerializedName("applicationBytesTotalCount")
  private String applicationBytesTotalCount = null;

  public SiteHierarchyResponseResponse siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

   /**
   * Get siteName
   * @return siteName
  **/
  @ApiModelProperty(value = "")
  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public SiteHierarchyResponseResponse siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(value = "")
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public SiteHierarchyResponseResponse parentSiteId(String parentSiteId) {
    this.parentSiteId = parentSiteId;
    return this;
  }

   /**
   * Get parentSiteId
   * @return parentSiteId
  **/
  @ApiModelProperty(value = "")
  public String getParentSiteId() {
    return parentSiteId;
  }

  public void setParentSiteId(String parentSiteId) {
    this.parentSiteId = parentSiteId;
  }

  public SiteHierarchyResponseResponse parentSiteName(String parentSiteName) {
    this.parentSiteName = parentSiteName;
    return this;
  }

   /**
   * Get parentSiteName
   * @return parentSiteName
  **/
  @ApiModelProperty(value = "")
  public String getParentSiteName() {
    return parentSiteName;
  }

  public void setParentSiteName(String parentSiteName) {
    this.parentSiteName = parentSiteName;
  }

  public SiteHierarchyResponseResponse siteType(String siteType) {
    this.siteType = siteType;
    return this;
  }

   /**
   * Get siteType
   * @return siteType
  **/
  @ApiModelProperty(value = "")
  public String getSiteType() {
    return siteType;
  }

  public void setSiteType(String siteType) {
    this.siteType = siteType;
  }

  public SiteHierarchyResponseResponse healthyNetworkDevicePercentage(String healthyNetworkDevicePercentage) {
    this.healthyNetworkDevicePercentage = healthyNetworkDevicePercentage;
    return this;
  }

   /**
   * Get healthyNetworkDevicePercentage
   * @return healthyNetworkDevicePercentage
  **/
  @ApiModelProperty(value = "")
  public String getHealthyNetworkDevicePercentage() {
    return healthyNetworkDevicePercentage;
  }

  public void setHealthyNetworkDevicePercentage(String healthyNetworkDevicePercentage) {
    this.healthyNetworkDevicePercentage = healthyNetworkDevicePercentage;
  }

  public SiteHierarchyResponseResponse healthyClientsPercentage(String healthyClientsPercentage) {
    this.healthyClientsPercentage = healthyClientsPercentage;
    return this;
  }

   /**
   * Get healthyClientsPercentage
   * @return healthyClientsPercentage
  **/
  @ApiModelProperty(value = "")
  public String getHealthyClientsPercentage() {
    return healthyClientsPercentage;
  }

  public void setHealthyClientsPercentage(String healthyClientsPercentage) {
    this.healthyClientsPercentage = healthyClientsPercentage;
  }

  public SiteHierarchyResponseResponse clientHealthWired(String clientHealthWired) {
    this.clientHealthWired = clientHealthWired;
    return this;
  }

   /**
   * Get clientHealthWired
   * @return clientHealthWired
  **/
  @ApiModelProperty(value = "")
  public String getClientHealthWired() {
    return clientHealthWired;
  }

  public void setClientHealthWired(String clientHealthWired) {
    this.clientHealthWired = clientHealthWired;
  }

  public SiteHierarchyResponseResponse clientHealthWireless(String clientHealthWireless) {
    this.clientHealthWireless = clientHealthWireless;
    return this;
  }

   /**
   * Get clientHealthWireless
   * @return clientHealthWireless
  **/
  @ApiModelProperty(value = "")
  public String getClientHealthWireless() {
    return clientHealthWireless;
  }

  public void setClientHealthWireless(String clientHealthWireless) {
    this.clientHealthWireless = clientHealthWireless;
  }

  public SiteHierarchyResponseResponse numberOfClients(String numberOfClients) {
    this.numberOfClients = numberOfClients;
    return this;
  }

   /**
   * Get numberOfClients
   * @return numberOfClients
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfClients() {
    return numberOfClients;
  }

  public void setNumberOfClients(String numberOfClients) {
    this.numberOfClients = numberOfClients;
  }

  public SiteHierarchyResponseResponse clientNumberOfIssues(String clientNumberOfIssues) {
    this.clientNumberOfIssues = clientNumberOfIssues;
    return this;
  }

   /**
   * Get clientNumberOfIssues
   * @return clientNumberOfIssues
  **/
  @ApiModelProperty(value = "")
  public String getClientNumberOfIssues() {
    return clientNumberOfIssues;
  }

  public void setClientNumberOfIssues(String clientNumberOfIssues) {
    this.clientNumberOfIssues = clientNumberOfIssues;
  }

  public SiteHierarchyResponseResponse networkNumberOfIssues(String networkNumberOfIssues) {
    this.networkNumberOfIssues = networkNumberOfIssues;
    return this;
  }

   /**
   * Get networkNumberOfIssues
   * @return networkNumberOfIssues
  **/
  @ApiModelProperty(value = "")
  public String getNetworkNumberOfIssues() {
    return networkNumberOfIssues;
  }

  public void setNetworkNumberOfIssues(String networkNumberOfIssues) {
    this.networkNumberOfIssues = networkNumberOfIssues;
  }

  public SiteHierarchyResponseResponse numberOfNetworkDevice(String numberOfNetworkDevice) {
    this.numberOfNetworkDevice = numberOfNetworkDevice;
    return this;
  }

   /**
   * Get numberOfNetworkDevice
   * @return numberOfNetworkDevice
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfNetworkDevice() {
    return numberOfNetworkDevice;
  }

  public void setNumberOfNetworkDevice(String numberOfNetworkDevice) {
    this.numberOfNetworkDevice = numberOfNetworkDevice;
  }

  public SiteHierarchyResponseResponse networkHealthAverage(String networkHealthAverage) {
    this.networkHealthAverage = networkHealthAverage;
    return this;
  }

   /**
   * Get networkHealthAverage
   * @return networkHealthAverage
  **/
  @ApiModelProperty(value = "")
  public String getNetworkHealthAverage() {
    return networkHealthAverage;
  }

  public void setNetworkHealthAverage(String networkHealthAverage) {
    this.networkHealthAverage = networkHealthAverage;
  }

  public SiteHierarchyResponseResponse networkHealthAccess(String networkHealthAccess) {
    this.networkHealthAccess = networkHealthAccess;
    return this;
  }

   /**
   * Get networkHealthAccess
   * @return networkHealthAccess
  **/
  @ApiModelProperty(value = "")
  public String getNetworkHealthAccess() {
    return networkHealthAccess;
  }

  public void setNetworkHealthAccess(String networkHealthAccess) {
    this.networkHealthAccess = networkHealthAccess;
  }

  public SiteHierarchyResponseResponse networkHealthCore(String networkHealthCore) {
    this.networkHealthCore = networkHealthCore;
    return this;
  }

   /**
   * Get networkHealthCore
   * @return networkHealthCore
  **/
  @ApiModelProperty(value = "")
  public String getNetworkHealthCore() {
    return networkHealthCore;
  }

  public void setNetworkHealthCore(String networkHealthCore) {
    this.networkHealthCore = networkHealthCore;
  }

  public SiteHierarchyResponseResponse networkHealthDistribution(String networkHealthDistribution) {
    this.networkHealthDistribution = networkHealthDistribution;
    return this;
  }

   /**
   * Get networkHealthDistribution
   * @return networkHealthDistribution
  **/
  @ApiModelProperty(value = "")
  public String getNetworkHealthDistribution() {
    return networkHealthDistribution;
  }

  public void setNetworkHealthDistribution(String networkHealthDistribution) {
    this.networkHealthDistribution = networkHealthDistribution;
  }

  public SiteHierarchyResponseResponse networkHealthRouter(String networkHealthRouter) {
    this.networkHealthRouter = networkHealthRouter;
    return this;
  }

   /**
   * Get networkHealthRouter
   * @return networkHealthRouter
  **/
  @ApiModelProperty(value = "")
  public String getNetworkHealthRouter() {
    return networkHealthRouter;
  }

  public void setNetworkHealthRouter(String networkHealthRouter) {
    this.networkHealthRouter = networkHealthRouter;
  }

  public SiteHierarchyResponseResponse networkHealthWireless(String networkHealthWireless) {
    this.networkHealthWireless = networkHealthWireless;
    return this;
  }

   /**
   * Get networkHealthWireless
   * @return networkHealthWireless
  **/
  @ApiModelProperty(value = "")
  public String getNetworkHealthWireless() {
    return networkHealthWireless;
  }

  public void setNetworkHealthWireless(String networkHealthWireless) {
    this.networkHealthWireless = networkHealthWireless;
  }

  public SiteHierarchyResponseResponse networkHealthOthers(String networkHealthOthers) {
    this.networkHealthOthers = networkHealthOthers;
    return this;
  }

   /**
   * Get networkHealthOthers
   * @return networkHealthOthers
  **/
  @ApiModelProperty(value = "")
  public String getNetworkHealthOthers() {
    return networkHealthOthers;
  }

  public void setNetworkHealthOthers(String networkHealthOthers) {
    this.networkHealthOthers = networkHealthOthers;
  }

  public SiteHierarchyResponseResponse numberOfWiredClients(String numberOfWiredClients) {
    this.numberOfWiredClients = numberOfWiredClients;
    return this;
  }

   /**
   * Get numberOfWiredClients
   * @return numberOfWiredClients
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfWiredClients() {
    return numberOfWiredClients;
  }

  public void setNumberOfWiredClients(String numberOfWiredClients) {
    this.numberOfWiredClients = numberOfWiredClients;
  }

  public SiteHierarchyResponseResponse numberOfWirelessClients(String numberOfWirelessClients) {
    this.numberOfWirelessClients = numberOfWirelessClients;
    return this;
  }

   /**
   * Get numberOfWirelessClients
   * @return numberOfWirelessClients
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfWirelessClients() {
    return numberOfWirelessClients;
  }

  public void setNumberOfWirelessClients(String numberOfWirelessClients) {
    this.numberOfWirelessClients = numberOfWirelessClients;
  }

  public SiteHierarchyResponseResponse wiredGoodClients(String wiredGoodClients) {
    this.wiredGoodClients = wiredGoodClients;
    return this;
  }

   /**
   * Get wiredGoodClients
   * @return wiredGoodClients
  **/
  @ApiModelProperty(value = "")
  public String getWiredGoodClients() {
    return wiredGoodClients;
  }

  public void setWiredGoodClients(String wiredGoodClients) {
    this.wiredGoodClients = wiredGoodClients;
  }

  public SiteHierarchyResponseResponse wirelessGoodClients(String wirelessGoodClients) {
    this.wirelessGoodClients = wirelessGoodClients;
    return this;
  }

   /**
   * Get wirelessGoodClients
   * @return wirelessGoodClients
  **/
  @ApiModelProperty(value = "")
  public String getWirelessGoodClients() {
    return wirelessGoodClients;
  }

  public void setWirelessGoodClients(String wirelessGoodClients) {
    this.wirelessGoodClients = wirelessGoodClients;
  }

  public SiteHierarchyResponseResponse clientIssueCount(String clientIssueCount) {
    this.clientIssueCount = clientIssueCount;
    return this;
  }

   /**
   * Get clientIssueCount
   * @return clientIssueCount
  **/
  @ApiModelProperty(value = "")
  public String getClientIssueCount() {
    return clientIssueCount;
  }

  public void setClientIssueCount(String clientIssueCount) {
    this.clientIssueCount = clientIssueCount;
  }

  public SiteHierarchyResponseResponse overallGoodDevices(String overallGoodDevices) {
    this.overallGoodDevices = overallGoodDevices;
    return this;
  }

   /**
   * Get overallGoodDevices
   * @return overallGoodDevices
  **/
  @ApiModelProperty(value = "")
  public String getOverallGoodDevices() {
    return overallGoodDevices;
  }

  public void setOverallGoodDevices(String overallGoodDevices) {
    this.overallGoodDevices = overallGoodDevices;
  }

  public SiteHierarchyResponseResponse accessGoodCount(String accessGoodCount) {
    this.accessGoodCount = accessGoodCount;
    return this;
  }

   /**
   * Get accessGoodCount
   * @return accessGoodCount
  **/
  @ApiModelProperty(value = "")
  public String getAccessGoodCount() {
    return accessGoodCount;
  }

  public void setAccessGoodCount(String accessGoodCount) {
    this.accessGoodCount = accessGoodCount;
  }

  public SiteHierarchyResponseResponse accessTotalCount(String accessTotalCount) {
    this.accessTotalCount = accessTotalCount;
    return this;
  }

   /**
   * Get accessTotalCount
   * @return accessTotalCount
  **/
  @ApiModelProperty(value = "")
  public String getAccessTotalCount() {
    return accessTotalCount;
  }

  public void setAccessTotalCount(String accessTotalCount) {
    this.accessTotalCount = accessTotalCount;
  }

  public SiteHierarchyResponseResponse coreGoodCount(String coreGoodCount) {
    this.coreGoodCount = coreGoodCount;
    return this;
  }

   /**
   * Get coreGoodCount
   * @return coreGoodCount
  **/
  @ApiModelProperty(value = "")
  public String getCoreGoodCount() {
    return coreGoodCount;
  }

  public void setCoreGoodCount(String coreGoodCount) {
    this.coreGoodCount = coreGoodCount;
  }

  public SiteHierarchyResponseResponse coreTotalCount(String coreTotalCount) {
    this.coreTotalCount = coreTotalCount;
    return this;
  }

   /**
   * Get coreTotalCount
   * @return coreTotalCount
  **/
  @ApiModelProperty(value = "")
  public String getCoreTotalCount() {
    return coreTotalCount;
  }

  public void setCoreTotalCount(String coreTotalCount) {
    this.coreTotalCount = coreTotalCount;
  }

  public SiteHierarchyResponseResponse distributionGoodCount(String distributionGoodCount) {
    this.distributionGoodCount = distributionGoodCount;
    return this;
  }

   /**
   * Get distributionGoodCount
   * @return distributionGoodCount
  **/
  @ApiModelProperty(value = "")
  public String getDistributionGoodCount() {
    return distributionGoodCount;
  }

  public void setDistributionGoodCount(String distributionGoodCount) {
    this.distributionGoodCount = distributionGoodCount;
  }

  public SiteHierarchyResponseResponse distributionTotalCount(String distributionTotalCount) {
    this.distributionTotalCount = distributionTotalCount;
    return this;
  }

   /**
   * Get distributionTotalCount
   * @return distributionTotalCount
  **/
  @ApiModelProperty(value = "")
  public String getDistributionTotalCount() {
    return distributionTotalCount;
  }

  public void setDistributionTotalCount(String distributionTotalCount) {
    this.distributionTotalCount = distributionTotalCount;
  }

  public SiteHierarchyResponseResponse routerGoodCount(String routerGoodCount) {
    this.routerGoodCount = routerGoodCount;
    return this;
  }

   /**
   * Get routerGoodCount
   * @return routerGoodCount
  **/
  @ApiModelProperty(value = "")
  public String getRouterGoodCount() {
    return routerGoodCount;
  }

  public void setRouterGoodCount(String routerGoodCount) {
    this.routerGoodCount = routerGoodCount;
  }

  public SiteHierarchyResponseResponse routerTotalCount(String routerTotalCount) {
    this.routerTotalCount = routerTotalCount;
    return this;
  }

   /**
   * Get routerTotalCount
   * @return routerTotalCount
  **/
  @ApiModelProperty(value = "")
  public String getRouterTotalCount() {
    return routerTotalCount;
  }

  public void setRouterTotalCount(String routerTotalCount) {
    this.routerTotalCount = routerTotalCount;
  }

  public SiteHierarchyResponseResponse wirelessDeviceGoodCount(String wirelessDeviceGoodCount) {
    this.wirelessDeviceGoodCount = wirelessDeviceGoodCount;
    return this;
  }

   /**
   * Get wirelessDeviceGoodCount
   * @return wirelessDeviceGoodCount
  **/
  @ApiModelProperty(value = "")
  public String getWirelessDeviceGoodCount() {
    return wirelessDeviceGoodCount;
  }

  public void setWirelessDeviceGoodCount(String wirelessDeviceGoodCount) {
    this.wirelessDeviceGoodCount = wirelessDeviceGoodCount;
  }

  public SiteHierarchyResponseResponse wirelessDeviceTotalCount(String wirelessDeviceTotalCount) {
    this.wirelessDeviceTotalCount = wirelessDeviceTotalCount;
    return this;
  }

   /**
   * Get wirelessDeviceTotalCount
   * @return wirelessDeviceTotalCount
  **/
  @ApiModelProperty(value = "")
  public String getWirelessDeviceTotalCount() {
    return wirelessDeviceTotalCount;
  }

  public void setWirelessDeviceTotalCount(String wirelessDeviceTotalCount) {
    this.wirelessDeviceTotalCount = wirelessDeviceTotalCount;
  }

  public SiteHierarchyResponseResponse applicationHealth(String applicationHealth) {
    this.applicationHealth = applicationHealth;
    return this;
  }

   /**
   * Get applicationHealth
   * @return applicationHealth
  **/
  @ApiModelProperty(value = "")
  public String getApplicationHealth() {
    return applicationHealth;
  }

  public void setApplicationHealth(String applicationHealth) {
    this.applicationHealth = applicationHealth;
  }

  public SiteHierarchyResponseResponse applicationGoodCount(String applicationGoodCount) {
    this.applicationGoodCount = applicationGoodCount;
    return this;
  }

   /**
   * Get applicationGoodCount
   * @return applicationGoodCount
  **/
  @ApiModelProperty(value = "")
  public String getApplicationGoodCount() {
    return applicationGoodCount;
  }

  public void setApplicationGoodCount(String applicationGoodCount) {
    this.applicationGoodCount = applicationGoodCount;
  }

  public SiteHierarchyResponseResponse applicationTotalCount(String applicationTotalCount) {
    this.applicationTotalCount = applicationTotalCount;
    return this;
  }

   /**
   * Get applicationTotalCount
   * @return applicationTotalCount
  **/
  @ApiModelProperty(value = "")
  public String getApplicationTotalCount() {
    return applicationTotalCount;
  }

  public void setApplicationTotalCount(String applicationTotalCount) {
    this.applicationTotalCount = applicationTotalCount;
  }

  public SiteHierarchyResponseResponse applicationBytesTotalCount(String applicationBytesTotalCount) {
    this.applicationBytesTotalCount = applicationBytesTotalCount;
    return this;
  }

   /**
   * Get applicationBytesTotalCount
   * @return applicationBytesTotalCount
  **/
  @ApiModelProperty(value = "")
  public String getApplicationBytesTotalCount() {
    return applicationBytesTotalCount;
  }

  public void setApplicationBytesTotalCount(String applicationBytesTotalCount) {
    this.applicationBytesTotalCount = applicationBytesTotalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteHierarchyResponseResponse siteHierarchyResponseResponse = (SiteHierarchyResponseResponse) o;
    return Objects.equals(this.siteName, siteHierarchyResponseResponse.siteName) &&
        Objects.equals(this.siteId, siteHierarchyResponseResponse.siteId) &&
        Objects.equals(this.parentSiteId, siteHierarchyResponseResponse.parentSiteId) &&
        Objects.equals(this.parentSiteName, siteHierarchyResponseResponse.parentSiteName) &&
        Objects.equals(this.siteType, siteHierarchyResponseResponse.siteType) &&
        Objects.equals(this.healthyNetworkDevicePercentage, siteHierarchyResponseResponse.healthyNetworkDevicePercentage) &&
        Objects.equals(this.healthyClientsPercentage, siteHierarchyResponseResponse.healthyClientsPercentage) &&
        Objects.equals(this.clientHealthWired, siteHierarchyResponseResponse.clientHealthWired) &&
        Objects.equals(this.clientHealthWireless, siteHierarchyResponseResponse.clientHealthWireless) &&
        Objects.equals(this.numberOfClients, siteHierarchyResponseResponse.numberOfClients) &&
        Objects.equals(this.clientNumberOfIssues, siteHierarchyResponseResponse.clientNumberOfIssues) &&
        Objects.equals(this.networkNumberOfIssues, siteHierarchyResponseResponse.networkNumberOfIssues) &&
        Objects.equals(this.numberOfNetworkDevice, siteHierarchyResponseResponse.numberOfNetworkDevice) &&
        Objects.equals(this.networkHealthAverage, siteHierarchyResponseResponse.networkHealthAverage) &&
        Objects.equals(this.networkHealthAccess, siteHierarchyResponseResponse.networkHealthAccess) &&
        Objects.equals(this.networkHealthCore, siteHierarchyResponseResponse.networkHealthCore) &&
        Objects.equals(this.networkHealthDistribution, siteHierarchyResponseResponse.networkHealthDistribution) &&
        Objects.equals(this.networkHealthRouter, siteHierarchyResponseResponse.networkHealthRouter) &&
        Objects.equals(this.networkHealthWireless, siteHierarchyResponseResponse.networkHealthWireless) &&
        Objects.equals(this.networkHealthOthers, siteHierarchyResponseResponse.networkHealthOthers) &&
        Objects.equals(this.numberOfWiredClients, siteHierarchyResponseResponse.numberOfWiredClients) &&
        Objects.equals(this.numberOfWirelessClients, siteHierarchyResponseResponse.numberOfWirelessClients) &&
        Objects.equals(this.wiredGoodClients, siteHierarchyResponseResponse.wiredGoodClients) &&
        Objects.equals(this.wirelessGoodClients, siteHierarchyResponseResponse.wirelessGoodClients) &&
        Objects.equals(this.clientIssueCount, siteHierarchyResponseResponse.clientIssueCount) &&
        Objects.equals(this.overallGoodDevices, siteHierarchyResponseResponse.overallGoodDevices) &&
        Objects.equals(this.accessGoodCount, siteHierarchyResponseResponse.accessGoodCount) &&
        Objects.equals(this.accessTotalCount, siteHierarchyResponseResponse.accessTotalCount) &&
        Objects.equals(this.coreGoodCount, siteHierarchyResponseResponse.coreGoodCount) &&
        Objects.equals(this.coreTotalCount, siteHierarchyResponseResponse.coreTotalCount) &&
        Objects.equals(this.distributionGoodCount, siteHierarchyResponseResponse.distributionGoodCount) &&
        Objects.equals(this.distributionTotalCount, siteHierarchyResponseResponse.distributionTotalCount) &&
        Objects.equals(this.routerGoodCount, siteHierarchyResponseResponse.routerGoodCount) &&
        Objects.equals(this.routerTotalCount, siteHierarchyResponseResponse.routerTotalCount) &&
        Objects.equals(this.wirelessDeviceGoodCount, siteHierarchyResponseResponse.wirelessDeviceGoodCount) &&
        Objects.equals(this.wirelessDeviceTotalCount, siteHierarchyResponseResponse.wirelessDeviceTotalCount) &&
        Objects.equals(this.applicationHealth, siteHierarchyResponseResponse.applicationHealth) &&
        Objects.equals(this.applicationGoodCount, siteHierarchyResponseResponse.applicationGoodCount) &&
        Objects.equals(this.applicationTotalCount, siteHierarchyResponseResponse.applicationTotalCount) &&
        Objects.equals(this.applicationBytesTotalCount, siteHierarchyResponseResponse.applicationBytesTotalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteName, siteId, parentSiteId, parentSiteName, siteType, healthyNetworkDevicePercentage, healthyClientsPercentage, clientHealthWired, clientHealthWireless, numberOfClients, clientNumberOfIssues, networkNumberOfIssues, numberOfNetworkDevice, networkHealthAverage, networkHealthAccess, networkHealthCore, networkHealthDistribution, networkHealthRouter, networkHealthWireless, networkHealthOthers, numberOfWiredClients, numberOfWirelessClients, wiredGoodClients, wirelessGoodClients, clientIssueCount, overallGoodDevices, accessGoodCount, accessTotalCount, coreGoodCount, coreTotalCount, distributionGoodCount, distributionTotalCount, routerGoodCount, routerTotalCount, wirelessDeviceGoodCount, wirelessDeviceTotalCount, applicationHealth, applicationGoodCount, applicationTotalCount, applicationBytesTotalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteHierarchyResponseResponse {\n");
    
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    parentSiteId: ").append(toIndentedString(parentSiteId)).append("\n");
    sb.append("    parentSiteName: ").append(toIndentedString(parentSiteName)).append("\n");
    sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
    sb.append("    healthyNetworkDevicePercentage: ").append(toIndentedString(healthyNetworkDevicePercentage)).append("\n");
    sb.append("    healthyClientsPercentage: ").append(toIndentedString(healthyClientsPercentage)).append("\n");
    sb.append("    clientHealthWired: ").append(toIndentedString(clientHealthWired)).append("\n");
    sb.append("    clientHealthWireless: ").append(toIndentedString(clientHealthWireless)).append("\n");
    sb.append("    numberOfClients: ").append(toIndentedString(numberOfClients)).append("\n");
    sb.append("    clientNumberOfIssues: ").append(toIndentedString(clientNumberOfIssues)).append("\n");
    sb.append("    networkNumberOfIssues: ").append(toIndentedString(networkNumberOfIssues)).append("\n");
    sb.append("    numberOfNetworkDevice: ").append(toIndentedString(numberOfNetworkDevice)).append("\n");
    sb.append("    networkHealthAverage: ").append(toIndentedString(networkHealthAverage)).append("\n");
    sb.append("    networkHealthAccess: ").append(toIndentedString(networkHealthAccess)).append("\n");
    sb.append("    networkHealthCore: ").append(toIndentedString(networkHealthCore)).append("\n");
    sb.append("    networkHealthDistribution: ").append(toIndentedString(networkHealthDistribution)).append("\n");
    sb.append("    networkHealthRouter: ").append(toIndentedString(networkHealthRouter)).append("\n");
    sb.append("    networkHealthWireless: ").append(toIndentedString(networkHealthWireless)).append("\n");
    sb.append("    networkHealthOthers: ").append(toIndentedString(networkHealthOthers)).append("\n");
    sb.append("    numberOfWiredClients: ").append(toIndentedString(numberOfWiredClients)).append("\n");
    sb.append("    numberOfWirelessClients: ").append(toIndentedString(numberOfWirelessClients)).append("\n");
    sb.append("    wiredGoodClients: ").append(toIndentedString(wiredGoodClients)).append("\n");
    sb.append("    wirelessGoodClients: ").append(toIndentedString(wirelessGoodClients)).append("\n");
    sb.append("    clientIssueCount: ").append(toIndentedString(clientIssueCount)).append("\n");
    sb.append("    overallGoodDevices: ").append(toIndentedString(overallGoodDevices)).append("\n");
    sb.append("    accessGoodCount: ").append(toIndentedString(accessGoodCount)).append("\n");
    sb.append("    accessTotalCount: ").append(toIndentedString(accessTotalCount)).append("\n");
    sb.append("    coreGoodCount: ").append(toIndentedString(coreGoodCount)).append("\n");
    sb.append("    coreTotalCount: ").append(toIndentedString(coreTotalCount)).append("\n");
    sb.append("    distributionGoodCount: ").append(toIndentedString(distributionGoodCount)).append("\n");
    sb.append("    distributionTotalCount: ").append(toIndentedString(distributionTotalCount)).append("\n");
    sb.append("    routerGoodCount: ").append(toIndentedString(routerGoodCount)).append("\n");
    sb.append("    routerTotalCount: ").append(toIndentedString(routerTotalCount)).append("\n");
    sb.append("    wirelessDeviceGoodCount: ").append(toIndentedString(wirelessDeviceGoodCount)).append("\n");
    sb.append("    wirelessDeviceTotalCount: ").append(toIndentedString(wirelessDeviceTotalCount)).append("\n");
    sb.append("    applicationHealth: ").append(toIndentedString(applicationHealth)).append("\n");
    sb.append("    applicationGoodCount: ").append(toIndentedString(applicationGoodCount)).append("\n");
    sb.append("    applicationTotalCount: ").append(toIndentedString(applicationTotalCount)).append("\n");
    sb.append("    applicationBytesTotalCount: ").append(toIndentedString(applicationBytesTotalCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
