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
import cisco.com.dnac.v1.api.client.model.FlowAnalysisListOutputResponse;
import cisco.com.dnac.v1.api.client.model.PathResponseResultResponseDetailedStatus;
import cisco.com.dnac.v1.api.client.model.PathResponseResultResponseNetworkElements;
import cisco.com.dnac.v1.api.client.model.PathResponseResultResponseNetworkElementsInfo;
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
 * PathResponseResultResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class PathResponseResultResponse {
  @SerializedName("detailedStatus")
  private PathResponseResultResponseDetailedStatus detailedStatus = null;

  @SerializedName("lastUpdate")
  private String lastUpdate = null;

  @SerializedName("networkElements")
  private List<PathResponseResultResponseNetworkElements> networkElements = null;

  @SerializedName("networkElementsInfo")
  private List<PathResponseResultResponseNetworkElementsInfo> networkElementsInfo = null;

  @SerializedName("properties")
  private List<String> properties = null;

  @SerializedName("request")
  private FlowAnalysisListOutputResponse request = null;

  public PathResponseResultResponse detailedStatus(PathResponseResultResponseDetailedStatus detailedStatus) {
    this.detailedStatus = detailedStatus;
    return this;
  }

   /**
   * Get detailedStatus
   * @return detailedStatus
  **/
  @ApiModelProperty(value = "")
  public PathResponseResultResponseDetailedStatus getDetailedStatus() {
    return detailedStatus;
  }

  public void setDetailedStatus(PathResponseResultResponseDetailedStatus detailedStatus) {
    this.detailedStatus = detailedStatus;
  }

  public PathResponseResultResponse lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public PathResponseResultResponse networkElements(List<PathResponseResultResponseNetworkElements> networkElements) {
    this.networkElements = networkElements;
    return this;
  }

  public PathResponseResultResponse addNetworkElementsItem(PathResponseResultResponseNetworkElements networkElementsItem) {
    if (this.networkElements == null) {
      this.networkElements = new ArrayList<>();
    }
    this.networkElements.add(networkElementsItem);
    return this;
  }

   /**
   * Get networkElements
   * @return networkElements
  **/
  @ApiModelProperty(value = "")
  public List<PathResponseResultResponseNetworkElements> getNetworkElements() {
    return networkElements;
  }

  public void setNetworkElements(List<PathResponseResultResponseNetworkElements> networkElements) {
    this.networkElements = networkElements;
  }

  public PathResponseResultResponse networkElementsInfo(List<PathResponseResultResponseNetworkElementsInfo> networkElementsInfo) {
    this.networkElementsInfo = networkElementsInfo;
    return this;
  }

  public PathResponseResultResponse addNetworkElementsInfoItem(PathResponseResultResponseNetworkElementsInfo networkElementsInfoItem) {
    if (this.networkElementsInfo == null) {
      this.networkElementsInfo = new ArrayList<>();
    }
    this.networkElementsInfo.add(networkElementsInfoItem);
    return this;
  }

   /**
   * Get networkElementsInfo
   * @return networkElementsInfo
  **/
  @ApiModelProperty(value = "")
  public List<PathResponseResultResponseNetworkElementsInfo> getNetworkElementsInfo() {
    return networkElementsInfo;
  }

  public void setNetworkElementsInfo(List<PathResponseResultResponseNetworkElementsInfo> networkElementsInfo) {
    this.networkElementsInfo = networkElementsInfo;
  }

  public PathResponseResultResponse properties(List<String> properties) {
    this.properties = properties;
    return this;
  }

  public PathResponseResultResponse addPropertiesItem(String propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public List<String> getProperties() {
    return properties;
  }

  public void setProperties(List<String> properties) {
    this.properties = properties;
  }

  public PathResponseResultResponse request(FlowAnalysisListOutputResponse request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(value = "")
  public FlowAnalysisListOutputResponse getRequest() {
    return request;
  }

  public void setRequest(FlowAnalysisListOutputResponse request) {
    this.request = request;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathResponseResultResponse pathResponseResultResponse = (PathResponseResultResponse) o;
    return Objects.equals(this.detailedStatus, pathResponseResultResponse.detailedStatus) &&
        Objects.equals(this.lastUpdate, pathResponseResultResponse.lastUpdate) &&
        Objects.equals(this.networkElements, pathResponseResultResponse.networkElements) &&
        Objects.equals(this.networkElementsInfo, pathResponseResultResponse.networkElementsInfo) &&
        Objects.equals(this.properties, pathResponseResultResponse.properties) &&
        Objects.equals(this.request, pathResponseResultResponse.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailedStatus, lastUpdate, networkElements, networkElementsInfo, properties, request);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathResponseResultResponse {\n");
    
    sb.append("    detailedStatus: ").append(toIndentedString(detailedStatus)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    networkElements: ").append(toIndentedString(networkElements)).append("\n");
    sb.append("    networkElementsInfo: ").append(toIndentedString(networkElementsInfo)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

