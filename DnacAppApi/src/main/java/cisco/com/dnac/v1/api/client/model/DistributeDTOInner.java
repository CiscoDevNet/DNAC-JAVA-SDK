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
 * DistributeDTOInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class DistributeDTOInner {
  @SerializedName("deviceUuid")
  private String deviceUuid = null;

  @SerializedName("imageUuid")
  private String imageUuid = null;

  public DistributeDTOInner deviceUuid(String deviceUuid) {
    this.deviceUuid = deviceUuid;
    return this;
  }

   /**
   * Get deviceUuid
   * @return deviceUuid
  **/
  @ApiModelProperty(value = "")
  public String getDeviceUuid() {
    return deviceUuid;
  }

  public void setDeviceUuid(String deviceUuid) {
    this.deviceUuid = deviceUuid;
  }

  public DistributeDTOInner imageUuid(String imageUuid) {
    this.imageUuid = imageUuid;
    return this;
  }

   /**
   * Get imageUuid
   * @return imageUuid
  **/
  @ApiModelProperty(value = "")
  public String getImageUuid() {
    return imageUuid;
  }

  public void setImageUuid(String imageUuid) {
    this.imageUuid = imageUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributeDTOInner distributeDTOInner = (DistributeDTOInner) o;
    return Objects.equals(this.deviceUuid, distributeDTOInner.deviceUuid) &&
        Objects.equals(this.imageUuid, distributeDTOInner.imageUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceUuid, imageUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributeDTOInner {\n");
    
    sb.append("    deviceUuid: ").append(toIndentedString(deviceUuid)).append("\n");
    sb.append("    imageUuid: ").append(toIndentedString(imageUuid)).append("\n");
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
