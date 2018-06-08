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
import cisco.com.dnac.v1.api.client.model.HTTPReadCredentialDTOInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InventoryRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class InventoryRequest {
  @SerializedName("cdpLevel")
  private Integer cdpLevel = null;

  @SerializedName("discoveryType")
  private String discoveryType = null;

  @SerializedName("enablePasswordList")
  private List<String> enablePasswordList = null;

  @SerializedName("globalCredentialIdList")
  private List<String> globalCredentialIdList = null;

  @SerializedName("httpReadCredential")
  private HTTPReadCredentialDTOInner httpReadCredential = null;

  @SerializedName("httpWriteCredential")
  private HTTPReadCredentialDTOInner httpWriteCredential = null;

  @SerializedName("ipAddressList")
  private String ipAddressList = null;

  @SerializedName("ipFilterList")
  private List<String> ipFilterList = null;

  @SerializedName("lldpLevel")
  private Integer lldpLevel = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("netconfPort")
  private String netconfPort = null;

  @SerializedName("noAddNewDevice")
  private Boolean noAddNewDevice = null;

  @SerializedName("parentDiscoveryId")
  private String parentDiscoveryId = null;

  @SerializedName("passwordList")
  private List<String> passwordList = null;

  @SerializedName("preferredMgmtIPMethod")
  private String preferredMgmtIPMethod = null;

  @SerializedName("protocolOrder")
  private String protocolOrder = null;

  @SerializedName("reDiscovery")
  private Boolean reDiscovery = null;

  @SerializedName("retry")
  private Integer retry = null;

  @SerializedName("snmpAuthPassphrase")
  private String snmpAuthPassphrase = null;

  @SerializedName("snmpAuthProtocol")
  private String snmpAuthProtocol = null;

  @SerializedName("snmpMode")
  private String snmpMode = null;

  @SerializedName("snmpPrivPassphrase")
  private String snmpPrivPassphrase = null;

  @SerializedName("snmpPrivProtocol")
  private String snmpPrivProtocol = null;

  @SerializedName("snmpROCommunity")
  private String snmpROCommunity = null;

  @SerializedName("snmpROCommunityDesc")
  private String snmpROCommunityDesc = null;

  @SerializedName("snmpRWCommunity")
  private String snmpRWCommunity = null;

  @SerializedName("snmpRWCommunityDesc")
  private String snmpRWCommunityDesc = null;

  @SerializedName("snmpUserName")
  private String snmpUserName = null;

  @SerializedName("snmpVersion")
  private String snmpVersion = null;

  @SerializedName("timeout")
  private Integer timeout = null;

  @SerializedName("updateMgmtIp")
  private Boolean updateMgmtIp = null;

  @SerializedName("userNameList")
  private List<String> userNameList = null;

  public InventoryRequest cdpLevel(Integer cdpLevel) {
    this.cdpLevel = cdpLevel;
    return this;
  }

   /**
   * Get cdpLevel
   * @return cdpLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getCdpLevel() {
    return cdpLevel;
  }

  public void setCdpLevel(Integer cdpLevel) {
    this.cdpLevel = cdpLevel;
  }

  public InventoryRequest discoveryType(String discoveryType) {
    this.discoveryType = discoveryType;
    return this;
  }

   /**
   * Get discoveryType
   * @return discoveryType
  **/
  @ApiModelProperty(value = "")
  public String getDiscoveryType() {
    return discoveryType;
  }

  public void setDiscoveryType(String discoveryType) {
    this.discoveryType = discoveryType;
  }

  public InventoryRequest enablePasswordList(List<String> enablePasswordList) {
    this.enablePasswordList = enablePasswordList;
    return this;
  }

  public InventoryRequest addEnablePasswordListItem(String enablePasswordListItem) {
    if (this.enablePasswordList == null) {
      this.enablePasswordList = new ArrayList<>();
    }
    this.enablePasswordList.add(enablePasswordListItem);
    return this;
  }

   /**
   * Get enablePasswordList
   * @return enablePasswordList
  **/
  @ApiModelProperty(value = "")
  public List<String> getEnablePasswordList() {
    return enablePasswordList;
  }

  public void setEnablePasswordList(List<String> enablePasswordList) {
    this.enablePasswordList = enablePasswordList;
  }

  public InventoryRequest globalCredentialIdList(List<String> globalCredentialIdList) {
    this.globalCredentialIdList = globalCredentialIdList;
    return this;
  }

  public InventoryRequest addGlobalCredentialIdListItem(String globalCredentialIdListItem) {
    if (this.globalCredentialIdList == null) {
      this.globalCredentialIdList = new ArrayList<>();
    }
    this.globalCredentialIdList.add(globalCredentialIdListItem);
    return this;
  }

   /**
   * Get globalCredentialIdList
   * @return globalCredentialIdList
  **/
  @ApiModelProperty(value = "")
  public List<String> getGlobalCredentialIdList() {
    return globalCredentialIdList;
  }

  public void setGlobalCredentialIdList(List<String> globalCredentialIdList) {
    this.globalCredentialIdList = globalCredentialIdList;
  }

  public InventoryRequest httpReadCredential(HTTPReadCredentialDTOInner httpReadCredential) {
    this.httpReadCredential = httpReadCredential;
    return this;
  }

   /**
   * Get httpReadCredential
   * @return httpReadCredential
  **/
  @ApiModelProperty(value = "")
  public HTTPReadCredentialDTOInner getHttpReadCredential() {
    return httpReadCredential;
  }

  public void setHttpReadCredential(HTTPReadCredentialDTOInner httpReadCredential) {
    this.httpReadCredential = httpReadCredential;
  }

  public InventoryRequest httpWriteCredential(HTTPReadCredentialDTOInner httpWriteCredential) {
    this.httpWriteCredential = httpWriteCredential;
    return this;
  }

   /**
   * Get httpWriteCredential
   * @return httpWriteCredential
  **/
  @ApiModelProperty(value = "")
  public HTTPReadCredentialDTOInner getHttpWriteCredential() {
    return httpWriteCredential;
  }

  public void setHttpWriteCredential(HTTPReadCredentialDTOInner httpWriteCredential) {
    this.httpWriteCredential = httpWriteCredential;
  }

  public InventoryRequest ipAddressList(String ipAddressList) {
    this.ipAddressList = ipAddressList;
    return this;
  }

   /**
   * Get ipAddressList
   * @return ipAddressList
  **/
  @ApiModelProperty(value = "")
  public String getIpAddressList() {
    return ipAddressList;
  }

  public void setIpAddressList(String ipAddressList) {
    this.ipAddressList = ipAddressList;
  }

  public InventoryRequest ipFilterList(List<String> ipFilterList) {
    this.ipFilterList = ipFilterList;
    return this;
  }

  public InventoryRequest addIpFilterListItem(String ipFilterListItem) {
    if (this.ipFilterList == null) {
      this.ipFilterList = new ArrayList<>();
    }
    this.ipFilterList.add(ipFilterListItem);
    return this;
  }

   /**
   * Get ipFilterList
   * @return ipFilterList
  **/
  @ApiModelProperty(value = "")
  public List<String> getIpFilterList() {
    return ipFilterList;
  }

  public void setIpFilterList(List<String> ipFilterList) {
    this.ipFilterList = ipFilterList;
  }

  public InventoryRequest lldpLevel(Integer lldpLevel) {
    this.lldpLevel = lldpLevel;
    return this;
  }

   /**
   * Get lldpLevel
   * @return lldpLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getLldpLevel() {
    return lldpLevel;
  }

  public void setLldpLevel(Integer lldpLevel) {
    this.lldpLevel = lldpLevel;
  }

  public InventoryRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InventoryRequest netconfPort(String netconfPort) {
    this.netconfPort = netconfPort;
    return this;
  }

   /**
   * Get netconfPort
   * @return netconfPort
  **/
  @ApiModelProperty(value = "")
  public String getNetconfPort() {
    return netconfPort;
  }

  public void setNetconfPort(String netconfPort) {
    this.netconfPort = netconfPort;
  }

  public InventoryRequest noAddNewDevice(Boolean noAddNewDevice) {
    this.noAddNewDevice = noAddNewDevice;
    return this;
  }

   /**
   * Get noAddNewDevice
   * @return noAddNewDevice
  **/
  @ApiModelProperty(value = "")
  public Boolean isNoAddNewDevice() {
    return noAddNewDevice;
  }

  public void setNoAddNewDevice(Boolean noAddNewDevice) {
    this.noAddNewDevice = noAddNewDevice;
  }

  public InventoryRequest parentDiscoveryId(String parentDiscoveryId) {
    this.parentDiscoveryId = parentDiscoveryId;
    return this;
  }

   /**
   * Get parentDiscoveryId
   * @return parentDiscoveryId
  **/
  @ApiModelProperty(value = "")
  public String getParentDiscoveryId() {
    return parentDiscoveryId;
  }

  public void setParentDiscoveryId(String parentDiscoveryId) {
    this.parentDiscoveryId = parentDiscoveryId;
  }

  public InventoryRequest passwordList(List<String> passwordList) {
    this.passwordList = passwordList;
    return this;
  }

  public InventoryRequest addPasswordListItem(String passwordListItem) {
    if (this.passwordList == null) {
      this.passwordList = new ArrayList<>();
    }
    this.passwordList.add(passwordListItem);
    return this;
  }

   /**
   * Get passwordList
   * @return passwordList
  **/
  @ApiModelProperty(value = "")
  public List<String> getPasswordList() {
    return passwordList;
  }

  public void setPasswordList(List<String> passwordList) {
    this.passwordList = passwordList;
  }

  public InventoryRequest preferredMgmtIPMethod(String preferredMgmtIPMethod) {
    this.preferredMgmtIPMethod = preferredMgmtIPMethod;
    return this;
  }

   /**
   * Get preferredMgmtIPMethod
   * @return preferredMgmtIPMethod
  **/
  @ApiModelProperty(value = "")
  public String getPreferredMgmtIPMethod() {
    return preferredMgmtIPMethod;
  }

  public void setPreferredMgmtIPMethod(String preferredMgmtIPMethod) {
    this.preferredMgmtIPMethod = preferredMgmtIPMethod;
  }

  public InventoryRequest protocolOrder(String protocolOrder) {
    this.protocolOrder = protocolOrder;
    return this;
  }

   /**
   * Get protocolOrder
   * @return protocolOrder
  **/
  @ApiModelProperty(value = "")
  public String getProtocolOrder() {
    return protocolOrder;
  }

  public void setProtocolOrder(String protocolOrder) {
    this.protocolOrder = protocolOrder;
  }

  public InventoryRequest reDiscovery(Boolean reDiscovery) {
    this.reDiscovery = reDiscovery;
    return this;
  }

   /**
   * Get reDiscovery
   * @return reDiscovery
  **/
  @ApiModelProperty(value = "")
  public Boolean isReDiscovery() {
    return reDiscovery;
  }

  public void setReDiscovery(Boolean reDiscovery) {
    this.reDiscovery = reDiscovery;
  }

  public InventoryRequest retry(Integer retry) {
    this.retry = retry;
    return this;
  }

   /**
   * Get retry
   * @return retry
  **/
  @ApiModelProperty(value = "")
  public Integer getRetry() {
    return retry;
  }

  public void setRetry(Integer retry) {
    this.retry = retry;
  }

  public InventoryRequest snmpAuthPassphrase(String snmpAuthPassphrase) {
    this.snmpAuthPassphrase = snmpAuthPassphrase;
    return this;
  }

   /**
   * Get snmpAuthPassphrase
   * @return snmpAuthPassphrase
  **/
  @ApiModelProperty(value = "")
  public String getSnmpAuthPassphrase() {
    return snmpAuthPassphrase;
  }

  public void setSnmpAuthPassphrase(String snmpAuthPassphrase) {
    this.snmpAuthPassphrase = snmpAuthPassphrase;
  }

  public InventoryRequest snmpAuthProtocol(String snmpAuthProtocol) {
    this.snmpAuthProtocol = snmpAuthProtocol;
    return this;
  }

   /**
   * Get snmpAuthProtocol
   * @return snmpAuthProtocol
  **/
  @ApiModelProperty(value = "")
  public String getSnmpAuthProtocol() {
    return snmpAuthProtocol;
  }

  public void setSnmpAuthProtocol(String snmpAuthProtocol) {
    this.snmpAuthProtocol = snmpAuthProtocol;
  }

  public InventoryRequest snmpMode(String snmpMode) {
    this.snmpMode = snmpMode;
    return this;
  }

   /**
   * Get snmpMode
   * @return snmpMode
  **/
  @ApiModelProperty(value = "")
  public String getSnmpMode() {
    return snmpMode;
  }

  public void setSnmpMode(String snmpMode) {
    this.snmpMode = snmpMode;
  }

  public InventoryRequest snmpPrivPassphrase(String snmpPrivPassphrase) {
    this.snmpPrivPassphrase = snmpPrivPassphrase;
    return this;
  }

   /**
   * Get snmpPrivPassphrase
   * @return snmpPrivPassphrase
  **/
  @ApiModelProperty(value = "")
  public String getSnmpPrivPassphrase() {
    return snmpPrivPassphrase;
  }

  public void setSnmpPrivPassphrase(String snmpPrivPassphrase) {
    this.snmpPrivPassphrase = snmpPrivPassphrase;
  }

  public InventoryRequest snmpPrivProtocol(String snmpPrivProtocol) {
    this.snmpPrivProtocol = snmpPrivProtocol;
    return this;
  }

   /**
   * Get snmpPrivProtocol
   * @return snmpPrivProtocol
  **/
  @ApiModelProperty(value = "")
  public String getSnmpPrivProtocol() {
    return snmpPrivProtocol;
  }

  public void setSnmpPrivProtocol(String snmpPrivProtocol) {
    this.snmpPrivProtocol = snmpPrivProtocol;
  }

  public InventoryRequest snmpROCommunity(String snmpROCommunity) {
    this.snmpROCommunity = snmpROCommunity;
    return this;
  }

   /**
   * Get snmpROCommunity
   * @return snmpROCommunity
  **/
  @ApiModelProperty(value = "")
  public String getSnmpROCommunity() {
    return snmpROCommunity;
  }

  public void setSnmpROCommunity(String snmpROCommunity) {
    this.snmpROCommunity = snmpROCommunity;
  }

  public InventoryRequest snmpROCommunityDesc(String snmpROCommunityDesc) {
    this.snmpROCommunityDesc = snmpROCommunityDesc;
    return this;
  }

   /**
   * Get snmpROCommunityDesc
   * @return snmpROCommunityDesc
  **/
  @ApiModelProperty(value = "")
  public String getSnmpROCommunityDesc() {
    return snmpROCommunityDesc;
  }

  public void setSnmpROCommunityDesc(String snmpROCommunityDesc) {
    this.snmpROCommunityDesc = snmpROCommunityDesc;
  }

  public InventoryRequest snmpRWCommunity(String snmpRWCommunity) {
    this.snmpRWCommunity = snmpRWCommunity;
    return this;
  }

   /**
   * Get snmpRWCommunity
   * @return snmpRWCommunity
  **/
  @ApiModelProperty(value = "")
  public String getSnmpRWCommunity() {
    return snmpRWCommunity;
  }

  public void setSnmpRWCommunity(String snmpRWCommunity) {
    this.snmpRWCommunity = snmpRWCommunity;
  }

  public InventoryRequest snmpRWCommunityDesc(String snmpRWCommunityDesc) {
    this.snmpRWCommunityDesc = snmpRWCommunityDesc;
    return this;
  }

   /**
   * Get snmpRWCommunityDesc
   * @return snmpRWCommunityDesc
  **/
  @ApiModelProperty(value = "")
  public String getSnmpRWCommunityDesc() {
    return snmpRWCommunityDesc;
  }

  public void setSnmpRWCommunityDesc(String snmpRWCommunityDesc) {
    this.snmpRWCommunityDesc = snmpRWCommunityDesc;
  }

  public InventoryRequest snmpUserName(String snmpUserName) {
    this.snmpUserName = snmpUserName;
    return this;
  }

   /**
   * Get snmpUserName
   * @return snmpUserName
  **/
  @ApiModelProperty(value = "")
  public String getSnmpUserName() {
    return snmpUserName;
  }

  public void setSnmpUserName(String snmpUserName) {
    this.snmpUserName = snmpUserName;
  }

  public InventoryRequest snmpVersion(String snmpVersion) {
    this.snmpVersion = snmpVersion;
    return this;
  }

   /**
   * Get snmpVersion
   * @return snmpVersion
  **/
  @ApiModelProperty(value = "")
  public String getSnmpVersion() {
    return snmpVersion;
  }

  public void setSnmpVersion(String snmpVersion) {
    this.snmpVersion = snmpVersion;
  }

  public InventoryRequest timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @ApiModelProperty(value = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public InventoryRequest updateMgmtIp(Boolean updateMgmtIp) {
    this.updateMgmtIp = updateMgmtIp;
    return this;
  }

   /**
   * Get updateMgmtIp
   * @return updateMgmtIp
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdateMgmtIp() {
    return updateMgmtIp;
  }

  public void setUpdateMgmtIp(Boolean updateMgmtIp) {
    this.updateMgmtIp = updateMgmtIp;
  }

  public InventoryRequest userNameList(List<String> userNameList) {
    this.userNameList = userNameList;
    return this;
  }

  public InventoryRequest addUserNameListItem(String userNameListItem) {
    if (this.userNameList == null) {
      this.userNameList = new ArrayList<>();
    }
    this.userNameList.add(userNameListItem);
    return this;
  }

   /**
   * Get userNameList
   * @return userNameList
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserNameList() {
    return userNameList;
  }

  public void setUserNameList(List<String> userNameList) {
    this.userNameList = userNameList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryRequest inventoryRequest = (InventoryRequest) o;
    return Objects.equals(this.cdpLevel, inventoryRequest.cdpLevel) &&
        Objects.equals(this.discoveryType, inventoryRequest.discoveryType) &&
        Objects.equals(this.enablePasswordList, inventoryRequest.enablePasswordList) &&
        Objects.equals(this.globalCredentialIdList, inventoryRequest.globalCredentialIdList) &&
        Objects.equals(this.httpReadCredential, inventoryRequest.httpReadCredential) &&
        Objects.equals(this.httpWriteCredential, inventoryRequest.httpWriteCredential) &&
        Objects.equals(this.ipAddressList, inventoryRequest.ipAddressList) &&
        Objects.equals(this.ipFilterList, inventoryRequest.ipFilterList) &&
        Objects.equals(this.lldpLevel, inventoryRequest.lldpLevel) &&
        Objects.equals(this.name, inventoryRequest.name) &&
        Objects.equals(this.netconfPort, inventoryRequest.netconfPort) &&
        Objects.equals(this.noAddNewDevice, inventoryRequest.noAddNewDevice) &&
        Objects.equals(this.parentDiscoveryId, inventoryRequest.parentDiscoveryId) &&
        Objects.equals(this.passwordList, inventoryRequest.passwordList) &&
        Objects.equals(this.preferredMgmtIPMethod, inventoryRequest.preferredMgmtIPMethod) &&
        Objects.equals(this.protocolOrder, inventoryRequest.protocolOrder) &&
        Objects.equals(this.reDiscovery, inventoryRequest.reDiscovery) &&
        Objects.equals(this.retry, inventoryRequest.retry) &&
        Objects.equals(this.snmpAuthPassphrase, inventoryRequest.snmpAuthPassphrase) &&
        Objects.equals(this.snmpAuthProtocol, inventoryRequest.snmpAuthProtocol) &&
        Objects.equals(this.snmpMode, inventoryRequest.snmpMode) &&
        Objects.equals(this.snmpPrivPassphrase, inventoryRequest.snmpPrivPassphrase) &&
        Objects.equals(this.snmpPrivProtocol, inventoryRequest.snmpPrivProtocol) &&
        Objects.equals(this.snmpROCommunity, inventoryRequest.snmpROCommunity) &&
        Objects.equals(this.snmpROCommunityDesc, inventoryRequest.snmpROCommunityDesc) &&
        Objects.equals(this.snmpRWCommunity, inventoryRequest.snmpRWCommunity) &&
        Objects.equals(this.snmpRWCommunityDesc, inventoryRequest.snmpRWCommunityDesc) &&
        Objects.equals(this.snmpUserName, inventoryRequest.snmpUserName) &&
        Objects.equals(this.snmpVersion, inventoryRequest.snmpVersion) &&
        Objects.equals(this.timeout, inventoryRequest.timeout) &&
        Objects.equals(this.updateMgmtIp, inventoryRequest.updateMgmtIp) &&
        Objects.equals(this.userNameList, inventoryRequest.userNameList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdpLevel, discoveryType, enablePasswordList, globalCredentialIdList, httpReadCredential, httpWriteCredential, ipAddressList, ipFilterList, lldpLevel, name, netconfPort, noAddNewDevice, parentDiscoveryId, passwordList, preferredMgmtIPMethod, protocolOrder, reDiscovery, retry, snmpAuthPassphrase, snmpAuthProtocol, snmpMode, snmpPrivPassphrase, snmpPrivProtocol, snmpROCommunity, snmpROCommunityDesc, snmpRWCommunity, snmpRWCommunityDesc, snmpUserName, snmpVersion, timeout, updateMgmtIp, userNameList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryRequest {\n");
    
    sb.append("    cdpLevel: ").append(toIndentedString(cdpLevel)).append("\n");
    sb.append("    discoveryType: ").append(toIndentedString(discoveryType)).append("\n");
    sb.append("    enablePasswordList: ").append(toIndentedString(enablePasswordList)).append("\n");
    sb.append("    globalCredentialIdList: ").append(toIndentedString(globalCredentialIdList)).append("\n");
    sb.append("    httpReadCredential: ").append(toIndentedString(httpReadCredential)).append("\n");
    sb.append("    httpWriteCredential: ").append(toIndentedString(httpWriteCredential)).append("\n");
    sb.append("    ipAddressList: ").append(toIndentedString(ipAddressList)).append("\n");
    sb.append("    ipFilterList: ").append(toIndentedString(ipFilterList)).append("\n");
    sb.append("    lldpLevel: ").append(toIndentedString(lldpLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    netconfPort: ").append(toIndentedString(netconfPort)).append("\n");
    sb.append("    noAddNewDevice: ").append(toIndentedString(noAddNewDevice)).append("\n");
    sb.append("    parentDiscoveryId: ").append(toIndentedString(parentDiscoveryId)).append("\n");
    sb.append("    passwordList: ").append(toIndentedString(passwordList)).append("\n");
    sb.append("    preferredMgmtIPMethod: ").append(toIndentedString(preferredMgmtIPMethod)).append("\n");
    sb.append("    protocolOrder: ").append(toIndentedString(protocolOrder)).append("\n");
    sb.append("    reDiscovery: ").append(toIndentedString(reDiscovery)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    snmpAuthPassphrase: ").append(toIndentedString(snmpAuthPassphrase)).append("\n");
    sb.append("    snmpAuthProtocol: ").append(toIndentedString(snmpAuthProtocol)).append("\n");
    sb.append("    snmpMode: ").append(toIndentedString(snmpMode)).append("\n");
    sb.append("    snmpPrivPassphrase: ").append(toIndentedString(snmpPrivPassphrase)).append("\n");
    sb.append("    snmpPrivProtocol: ").append(toIndentedString(snmpPrivProtocol)).append("\n");
    sb.append("    snmpROCommunity: ").append(toIndentedString(snmpROCommunity)).append("\n");
    sb.append("    snmpROCommunityDesc: ").append(toIndentedString(snmpROCommunityDesc)).append("\n");
    sb.append("    snmpRWCommunity: ").append(toIndentedString(snmpRWCommunity)).append("\n");
    sb.append("    snmpRWCommunityDesc: ").append(toIndentedString(snmpRWCommunityDesc)).append("\n");
    sb.append("    snmpUserName: ").append(toIndentedString(snmpUserName)).append("\n");
    sb.append("    snmpVersion: ").append(toIndentedString(snmpVersion)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    updateMgmtIp: ").append(toIndentedString(updateMgmtIp)).append("\n");
    sb.append("    userNameList: ").append(toIndentedString(userNameList)).append("\n");
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
