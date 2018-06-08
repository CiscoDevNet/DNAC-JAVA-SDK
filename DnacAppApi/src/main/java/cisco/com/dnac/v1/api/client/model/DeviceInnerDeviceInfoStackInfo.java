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
import cisco.com.dnac.v1.api.client.model.DeviceInnerDeviceInfoStackInfoStackMemberList;
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
 * DeviceInnerDeviceInfoStackInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class DeviceInnerDeviceInfoStackInfo {
  @SerializedName("isFullRing")
  private Boolean isFullRing = null;

  @SerializedName("stackMemberList")
  private List<DeviceInnerDeviceInfoStackInfoStackMemberList> stackMemberList = null;

  @SerializedName("stackRingProtocol")
  private String stackRingProtocol = null;

  @SerializedName("supportsStackWorkflows")
  private Boolean supportsStackWorkflows = null;

  @SerializedName("totalMemberCount")
  private Integer totalMemberCount = null;

  @SerializedName("validLicenseLevels")
  private List<String> validLicenseLevels = null;

  public DeviceInnerDeviceInfoStackInfo isFullRing(Boolean isFullRing) {
    this.isFullRing = isFullRing;
    return this;
  }

   /**
   * Get isFullRing
   * @return isFullRing
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFullRing() {
    return isFullRing;
  }

  public void setIsFullRing(Boolean isFullRing) {
    this.isFullRing = isFullRing;
  }

  public DeviceInnerDeviceInfoStackInfo stackMemberList(List<DeviceInnerDeviceInfoStackInfoStackMemberList> stackMemberList) {
    this.stackMemberList = stackMemberList;
    return this;
  }

  public DeviceInnerDeviceInfoStackInfo addStackMemberListItem(DeviceInnerDeviceInfoStackInfoStackMemberList stackMemberListItem) {
    if (this.stackMemberList == null) {
      this.stackMemberList = new ArrayList<>();
    }
    this.stackMemberList.add(stackMemberListItem);
    return this;
  }

   /**
   * Get stackMemberList
   * @return stackMemberList
  **/
  @ApiModelProperty(value = "")
  public List<DeviceInnerDeviceInfoStackInfoStackMemberList> getStackMemberList() {
    return stackMemberList;
  }

  public void setStackMemberList(List<DeviceInnerDeviceInfoStackInfoStackMemberList> stackMemberList) {
    this.stackMemberList = stackMemberList;
  }

  public DeviceInnerDeviceInfoStackInfo stackRingProtocol(String stackRingProtocol) {
    this.stackRingProtocol = stackRingProtocol;
    return this;
  }

   /**
   * Get stackRingProtocol
   * @return stackRingProtocol
  **/
  @ApiModelProperty(value = "")
  public String getStackRingProtocol() {
    return stackRingProtocol;
  }

  public void setStackRingProtocol(String stackRingProtocol) {
    this.stackRingProtocol = stackRingProtocol;
  }

  public DeviceInnerDeviceInfoStackInfo supportsStackWorkflows(Boolean supportsStackWorkflows) {
    this.supportsStackWorkflows = supportsStackWorkflows;
    return this;
  }

   /**
   * Get supportsStackWorkflows
   * @return supportsStackWorkflows
  **/
  @ApiModelProperty(value = "")
  public Boolean isSupportsStackWorkflows() {
    return supportsStackWorkflows;
  }

  public void setSupportsStackWorkflows(Boolean supportsStackWorkflows) {
    this.supportsStackWorkflows = supportsStackWorkflows;
  }

  public DeviceInnerDeviceInfoStackInfo totalMemberCount(Integer totalMemberCount) {
    this.totalMemberCount = totalMemberCount;
    return this;
  }

   /**
   * Get totalMemberCount
   * @return totalMemberCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalMemberCount() {
    return totalMemberCount;
  }

  public void setTotalMemberCount(Integer totalMemberCount) {
    this.totalMemberCount = totalMemberCount;
  }

  public DeviceInnerDeviceInfoStackInfo validLicenseLevels(List<String> validLicenseLevels) {
    this.validLicenseLevels = validLicenseLevels;
    return this;
  }

  public DeviceInnerDeviceInfoStackInfo addValidLicenseLevelsItem(String validLicenseLevelsItem) {
    if (this.validLicenseLevels == null) {
      this.validLicenseLevels = new ArrayList<>();
    }
    this.validLicenseLevels.add(validLicenseLevelsItem);
    return this;
  }

   /**
   * Get validLicenseLevels
   * @return validLicenseLevels
  **/
  @ApiModelProperty(value = "")
  public List<String> getValidLicenseLevels() {
    return validLicenseLevels;
  }

  public void setValidLicenseLevels(List<String> validLicenseLevels) {
    this.validLicenseLevels = validLicenseLevels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInnerDeviceInfoStackInfo deviceInnerDeviceInfoStackInfo = (DeviceInnerDeviceInfoStackInfo) o;
    return Objects.equals(this.isFullRing, deviceInnerDeviceInfoStackInfo.isFullRing) &&
        Objects.equals(this.stackMemberList, deviceInnerDeviceInfoStackInfo.stackMemberList) &&
        Objects.equals(this.stackRingProtocol, deviceInnerDeviceInfoStackInfo.stackRingProtocol) &&
        Objects.equals(this.supportsStackWorkflows, deviceInnerDeviceInfoStackInfo.supportsStackWorkflows) &&
        Objects.equals(this.totalMemberCount, deviceInnerDeviceInfoStackInfo.totalMemberCount) &&
        Objects.equals(this.validLicenseLevels, deviceInnerDeviceInfoStackInfo.validLicenseLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFullRing, stackMemberList, stackRingProtocol, supportsStackWorkflows, totalMemberCount, validLicenseLevels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInnerDeviceInfoStackInfo {\n");
    
    sb.append("    isFullRing: ").append(toIndentedString(isFullRing)).append("\n");
    sb.append("    stackMemberList: ").append(toIndentedString(stackMemberList)).append("\n");
    sb.append("    stackRingProtocol: ").append(toIndentedString(stackRingProtocol)).append("\n");
    sb.append("    supportsStackWorkflows: ").append(toIndentedString(supportsStackWorkflows)).append("\n");
    sb.append("    totalMemberCount: ").append(toIndentedString(totalMemberCount)).append("\n");
    sb.append("    validLicenseLevels: ").append(toIndentedString(validLicenseLevels)).append("\n");
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
