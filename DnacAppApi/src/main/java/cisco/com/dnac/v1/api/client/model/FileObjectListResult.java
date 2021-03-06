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
import cisco.com.dnac.v1.api.client.model.FileObjectListResultResponse;
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
 * FileObjectListResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class FileObjectListResult {
  @SerializedName("response")
  private List<FileObjectListResultResponse> response = null;

  @SerializedName("version")
  private String version = null;

  public FileObjectListResult response(List<FileObjectListResultResponse> response) {
    this.response = response;
    return this;
  }

  public FileObjectListResult addResponseItem(FileObjectListResultResponse responseItem) {
    if (this.response == null) {
      this.response = new ArrayList<>();
    }
    this.response.add(responseItem);
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(value = "")
  public List<FileObjectListResultResponse> getResponse() {
    return response;
  }

  public void setResponse(List<FileObjectListResultResponse> response) {
    this.response = response;
  }

  public FileObjectListResult version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileObjectListResult fileObjectListResult = (FileObjectListResult) o;
    return Objects.equals(this.response, fileObjectListResult.response) &&
        Objects.equals(this.version, fileObjectListResult.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileObjectListResult {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

