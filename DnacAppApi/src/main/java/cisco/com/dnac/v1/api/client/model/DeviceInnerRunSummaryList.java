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
import cisco.com.dnac.v1.api.client.model.DeviceInnerHistoryTaskInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceInnerRunSummaryList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class DeviceInnerRunSummaryList {
  @SerializedName("details")
  private String details = null;

  @SerializedName("errorFlag")
  private Boolean errorFlag = null;

  @SerializedName("historyTaskInfo")
  private DeviceInnerHistoryTaskInfo historyTaskInfo = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  public DeviceInnerRunSummaryList details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public DeviceInnerRunSummaryList errorFlag(Boolean errorFlag) {
    this.errorFlag = errorFlag;
    return this;
  }

   /**
   * Get errorFlag
   * @return errorFlag
  **/
  @ApiModelProperty(value = "")
  public Boolean isErrorFlag() {
    return errorFlag;
  }

  public void setErrorFlag(Boolean errorFlag) {
    this.errorFlag = errorFlag;
  }

  public DeviceInnerRunSummaryList historyTaskInfo(DeviceInnerHistoryTaskInfo historyTaskInfo) {
    this.historyTaskInfo = historyTaskInfo;
    return this;
  }

   /**
   * Get historyTaskInfo
   * @return historyTaskInfo
  **/
  @ApiModelProperty(value = "")
  public DeviceInnerHistoryTaskInfo getHistoryTaskInfo() {
    return historyTaskInfo;
  }

  public void setHistoryTaskInfo(DeviceInnerHistoryTaskInfo historyTaskInfo) {
    this.historyTaskInfo = historyTaskInfo;
  }

  public DeviceInnerRunSummaryList timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInnerRunSummaryList deviceInnerRunSummaryList = (DeviceInnerRunSummaryList) o;
    return Objects.equals(this.details, deviceInnerRunSummaryList.details) &&
        Objects.equals(this.errorFlag, deviceInnerRunSummaryList.errorFlag) &&
        Objects.equals(this.historyTaskInfo, deviceInnerRunSummaryList.historyTaskInfo) &&
        Objects.equals(this.timestamp, deviceInnerRunSummaryList.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, errorFlag, historyTaskInfo, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInnerRunSummaryList {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    errorFlag: ").append(toIndentedString(errorFlag)).append("\n");
    sb.append("    historyTaskInfo: ").append(toIndentedString(historyTaskInfo)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
