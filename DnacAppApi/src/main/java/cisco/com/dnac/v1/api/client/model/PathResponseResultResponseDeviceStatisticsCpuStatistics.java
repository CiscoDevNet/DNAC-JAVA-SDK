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
import java.math.BigDecimal;

/**
 * PathResponseResultResponseDeviceStatisticsCpuStatistics
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class PathResponseResultResponseDeviceStatisticsCpuStatistics {
  @SerializedName("fiveMinUsageInPercentage")
  private BigDecimal fiveMinUsageInPercentage = null;

  @SerializedName("fiveSecsUsageInPercentage")
  private BigDecimal fiveSecsUsageInPercentage = null;

  @SerializedName("oneMinUsageInPercentage")
  private BigDecimal oneMinUsageInPercentage = null;

  @SerializedName("refreshedAt")
  private Integer refreshedAt = null;

  public PathResponseResultResponseDeviceStatisticsCpuStatistics fiveMinUsageInPercentage(BigDecimal fiveMinUsageInPercentage) {
    this.fiveMinUsageInPercentage = fiveMinUsageInPercentage;
    return this;
  }

   /**
   * Get fiveMinUsageInPercentage
   * @return fiveMinUsageInPercentage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFiveMinUsageInPercentage() {
    return fiveMinUsageInPercentage;
  }

  public void setFiveMinUsageInPercentage(BigDecimal fiveMinUsageInPercentage) {
    this.fiveMinUsageInPercentage = fiveMinUsageInPercentage;
  }

  public PathResponseResultResponseDeviceStatisticsCpuStatistics fiveSecsUsageInPercentage(BigDecimal fiveSecsUsageInPercentage) {
    this.fiveSecsUsageInPercentage = fiveSecsUsageInPercentage;
    return this;
  }

   /**
   * Get fiveSecsUsageInPercentage
   * @return fiveSecsUsageInPercentage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFiveSecsUsageInPercentage() {
    return fiveSecsUsageInPercentage;
  }

  public void setFiveSecsUsageInPercentage(BigDecimal fiveSecsUsageInPercentage) {
    this.fiveSecsUsageInPercentage = fiveSecsUsageInPercentage;
  }

  public PathResponseResultResponseDeviceStatisticsCpuStatistics oneMinUsageInPercentage(BigDecimal oneMinUsageInPercentage) {
    this.oneMinUsageInPercentage = oneMinUsageInPercentage;
    return this;
  }

   /**
   * Get oneMinUsageInPercentage
   * @return oneMinUsageInPercentage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOneMinUsageInPercentage() {
    return oneMinUsageInPercentage;
  }

  public void setOneMinUsageInPercentage(BigDecimal oneMinUsageInPercentage) {
    this.oneMinUsageInPercentage = oneMinUsageInPercentage;
  }

  public PathResponseResultResponseDeviceStatisticsCpuStatistics refreshedAt(Integer refreshedAt) {
    this.refreshedAt = refreshedAt;
    return this;
  }

   /**
   * Get refreshedAt
   * @return refreshedAt
  **/
  @ApiModelProperty(value = "")
  public Integer getRefreshedAt() {
    return refreshedAt;
  }

  public void setRefreshedAt(Integer refreshedAt) {
    this.refreshedAt = refreshedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathResponseResultResponseDeviceStatisticsCpuStatistics pathResponseResultResponseDeviceStatisticsCpuStatistics = (PathResponseResultResponseDeviceStatisticsCpuStatistics) o;
    return Objects.equals(this.fiveMinUsageInPercentage, pathResponseResultResponseDeviceStatisticsCpuStatistics.fiveMinUsageInPercentage) &&
        Objects.equals(this.fiveSecsUsageInPercentage, pathResponseResultResponseDeviceStatisticsCpuStatistics.fiveSecsUsageInPercentage) &&
        Objects.equals(this.oneMinUsageInPercentage, pathResponseResultResponseDeviceStatisticsCpuStatistics.oneMinUsageInPercentage) &&
        Objects.equals(this.refreshedAt, pathResponseResultResponseDeviceStatisticsCpuStatistics.refreshedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiveMinUsageInPercentage, fiveSecsUsageInPercentage, oneMinUsageInPercentage, refreshedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathResponseResultResponseDeviceStatisticsCpuStatistics {\n");
    
    sb.append("    fiveMinUsageInPercentage: ").append(toIndentedString(fiveMinUsageInPercentage)).append("\n");
    sb.append("    fiveSecsUsageInPercentage: ").append(toIndentedString(fiveSecsUsageInPercentage)).append("\n");
    sb.append("    oneMinUsageInPercentage: ").append(toIndentedString(oneMinUsageInPercentage)).append("\n");
    sb.append("    refreshedAt: ").append(toIndentedString(refreshedAt)).append("\n");
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

