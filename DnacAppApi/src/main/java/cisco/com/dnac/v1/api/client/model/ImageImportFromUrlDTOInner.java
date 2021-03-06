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
 * ImageImportFromUrlDTOInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class ImageImportFromUrlDTOInner {
  @SerializedName("applicationType")
  private String applicationType = null;

  @SerializedName("imageFamily")
  private String imageFamily = null;

  @SerializedName("sourceURL")
  private String sourceURL = null;

  @SerializedName("thirdParty")
  private Boolean thirdParty = null;

  @SerializedName("vendor")
  private String vendor = null;

  public ImageImportFromUrlDTOInner applicationType(String applicationType) {
    this.applicationType = applicationType;
    return this;
  }

   /**
   * Get applicationType
   * @return applicationType
  **/
  @ApiModelProperty(value = "")
  public String getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(String applicationType) {
    this.applicationType = applicationType;
  }

  public ImageImportFromUrlDTOInner imageFamily(String imageFamily) {
    this.imageFamily = imageFamily;
    return this;
  }

   /**
   * Get imageFamily
   * @return imageFamily
  **/
  @ApiModelProperty(value = "")
  public String getImageFamily() {
    return imageFamily;
  }

  public void setImageFamily(String imageFamily) {
    this.imageFamily = imageFamily;
  }

  public ImageImportFromUrlDTOInner sourceURL(String sourceURL) {
    this.sourceURL = sourceURL;
    return this;
  }

   /**
   * Get sourceURL
   * @return sourceURL
  **/
  @ApiModelProperty(value = "")
  public String getSourceURL() {
    return sourceURL;
  }

  public void setSourceURL(String sourceURL) {
    this.sourceURL = sourceURL;
  }

  public ImageImportFromUrlDTOInner thirdParty(Boolean thirdParty) {
    this.thirdParty = thirdParty;
    return this;
  }

   /**
   * Get thirdParty
   * @return thirdParty
  **/
  @ApiModelProperty(value = "")
  public Boolean isThirdParty() {
    return thirdParty;
  }

  public void setThirdParty(Boolean thirdParty) {
    this.thirdParty = thirdParty;
  }

  public ImageImportFromUrlDTOInner vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(value = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageImportFromUrlDTOInner imageImportFromUrlDTOInner = (ImageImportFromUrlDTOInner) o;
    return Objects.equals(this.applicationType, imageImportFromUrlDTOInner.applicationType) &&
        Objects.equals(this.imageFamily, imageImportFromUrlDTOInner.imageFamily) &&
        Objects.equals(this.sourceURL, imageImportFromUrlDTOInner.sourceURL) &&
        Objects.equals(this.thirdParty, imageImportFromUrlDTOInner.thirdParty) &&
        Objects.equals(this.vendor, imageImportFromUrlDTOInner.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationType, imageFamily, sourceURL, thirdParty, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageImportFromUrlDTOInner {\n");
    
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
    sb.append("    imageFamily: ").append(toIndentedString(imageFamily)).append("\n");
    sb.append("    sourceURL: ").append(toIndentedString(sourceURL)).append("\n");
    sb.append("    thirdParty: ").append(toIndentedString(thirdParty)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

