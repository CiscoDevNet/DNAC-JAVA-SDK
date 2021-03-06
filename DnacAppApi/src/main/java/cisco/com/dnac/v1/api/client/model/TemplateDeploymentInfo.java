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
import cisco.com.dnac.v1.api.client.model.TemplateDeploymentInfoTargetInfo;
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
 * TemplateDeploymentInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class TemplateDeploymentInfo {
  @SerializedName("targetInfo")
  private List<TemplateDeploymentInfoTargetInfo> targetInfo = null;

  @SerializedName("templateId")
  private String templateId = null;

  public TemplateDeploymentInfo targetInfo(List<TemplateDeploymentInfoTargetInfo> targetInfo) {
    this.targetInfo = targetInfo;
    return this;
  }

  public TemplateDeploymentInfo addTargetInfoItem(TemplateDeploymentInfoTargetInfo targetInfoItem) {
    if (this.targetInfo == null) {
      this.targetInfo = new ArrayList<>();
    }
    this.targetInfo.add(targetInfoItem);
    return this;
  }

   /**
   * Get targetInfo
   * @return targetInfo
  **/
  @ApiModelProperty(value = "")
  public List<TemplateDeploymentInfoTargetInfo> getTargetInfo() {
    return targetInfo;
  }

  public void setTargetInfo(List<TemplateDeploymentInfoTargetInfo> targetInfo) {
    this.targetInfo = targetInfo;
  }

  public TemplateDeploymentInfo templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(value = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDeploymentInfo templateDeploymentInfo = (TemplateDeploymentInfo) o;
    return Objects.equals(this.targetInfo, templateDeploymentInfo.targetInfo) &&
        Objects.equals(this.templateId, templateDeploymentInfo.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetInfo, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDeploymentInfo {\n");
    
    sb.append("    targetInfo: ").append(toIndentedString(targetInfo)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

