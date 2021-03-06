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
import cisco.com.dnac.v1.api.client.model.PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisPorts;
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
 * PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts {
  @SerializedName("ports")
  private List<PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisPorts> ports = null;

  @SerializedName("protocol")
  private String protocol = null;

  public PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts ports(List<PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisPorts> ports) {
    this.ports = ports;
    return this;
  }

  public PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts addPortsItem(PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisPorts portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @ApiModelProperty(value = "")
  public List<PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisPorts> getPorts() {
    return ports;
  }

  public void setPorts(List<PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisPorts> ports) {
    this.ports = ports;
  }

  public PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts pathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts = (PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts) o;
    return Objects.equals(this.ports, pathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts.ports) &&
        Objects.equals(this.protocol, pathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ports, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathResponseResultResponseEgressPhysicalInterfaceAclAnalysisMatchingPorts {\n");
    
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

