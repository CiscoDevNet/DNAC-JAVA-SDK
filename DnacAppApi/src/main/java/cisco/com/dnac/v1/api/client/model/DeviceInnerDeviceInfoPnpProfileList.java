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
import cisco.com.dnac.v1.api.client.model.DeviceInnerDeviceInfoPrimaryEndpoint;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceInnerDeviceInfoPnpProfileList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class DeviceInnerDeviceInfoPnpProfileList {
  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("discoveryCreated")
  private Boolean discoveryCreated = null;

  @SerializedName("primaryEndpoint")
  private DeviceInnerDeviceInfoPrimaryEndpoint primaryEndpoint = null;

  @SerializedName("profileName")
  private String profileName = null;

  @SerializedName("secondaryEndpoint")
  private DeviceInnerDeviceInfoPrimaryEndpoint secondaryEndpoint = null;

  public DeviceInnerDeviceInfoPnpProfileList createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public DeviceInnerDeviceInfoPnpProfileList discoveryCreated(Boolean discoveryCreated) {
    this.discoveryCreated = discoveryCreated;
    return this;
  }

   /**
   * Get discoveryCreated
   * @return discoveryCreated
  **/
  @ApiModelProperty(value = "")
  public Boolean isDiscoveryCreated() {
    return discoveryCreated;
  }

  public void setDiscoveryCreated(Boolean discoveryCreated) {
    this.discoveryCreated = discoveryCreated;
  }

  public DeviceInnerDeviceInfoPnpProfileList primaryEndpoint(DeviceInnerDeviceInfoPrimaryEndpoint primaryEndpoint) {
    this.primaryEndpoint = primaryEndpoint;
    return this;
  }

   /**
   * Get primaryEndpoint
   * @return primaryEndpoint
  **/
  @ApiModelProperty(value = "")
  public DeviceInnerDeviceInfoPrimaryEndpoint getPrimaryEndpoint() {
    return primaryEndpoint;
  }

  public void setPrimaryEndpoint(DeviceInnerDeviceInfoPrimaryEndpoint primaryEndpoint) {
    this.primaryEndpoint = primaryEndpoint;
  }

  public DeviceInnerDeviceInfoPnpProfileList profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

   /**
   * Get profileName
   * @return profileName
  **/
  @ApiModelProperty(value = "")
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  public DeviceInnerDeviceInfoPnpProfileList secondaryEndpoint(DeviceInnerDeviceInfoPrimaryEndpoint secondaryEndpoint) {
    this.secondaryEndpoint = secondaryEndpoint;
    return this;
  }

   /**
   * Get secondaryEndpoint
   * @return secondaryEndpoint
  **/
  @ApiModelProperty(value = "")
  public DeviceInnerDeviceInfoPrimaryEndpoint getSecondaryEndpoint() {
    return secondaryEndpoint;
  }

  public void setSecondaryEndpoint(DeviceInnerDeviceInfoPrimaryEndpoint secondaryEndpoint) {
    this.secondaryEndpoint = secondaryEndpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInnerDeviceInfoPnpProfileList deviceInnerDeviceInfoPnpProfileList = (DeviceInnerDeviceInfoPnpProfileList) o;
    return Objects.equals(this.createdBy, deviceInnerDeviceInfoPnpProfileList.createdBy) &&
        Objects.equals(this.discoveryCreated, deviceInnerDeviceInfoPnpProfileList.discoveryCreated) &&
        Objects.equals(this.primaryEndpoint, deviceInnerDeviceInfoPnpProfileList.primaryEndpoint) &&
        Objects.equals(this.profileName, deviceInnerDeviceInfoPnpProfileList.profileName) &&
        Objects.equals(this.secondaryEndpoint, deviceInnerDeviceInfoPnpProfileList.secondaryEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, discoveryCreated, primaryEndpoint, profileName, secondaryEndpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInnerDeviceInfoPnpProfileList {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    discoveryCreated: ").append(toIndentedString(discoveryCreated)).append("\n");
    sb.append("    primaryEndpoint: ").append(toIndentedString(primaryEndpoint)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    secondaryEndpoint: ").append(toIndentedString(secondaryEndpoint)).append("\n");
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

