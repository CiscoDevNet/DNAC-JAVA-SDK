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
import java.util.ArrayList;
import java.util.List;

/**
 * FileObjectListResultResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-06T09:46:49.053-05:00")
public class FileObjectListResultResponse {
  @SerializedName("attributeInfo")
  private Object attributeInfo = null;

  @SerializedName("downloadPath")
  private String downloadPath = null;

  @SerializedName("encrypted")
  private Boolean encrypted = null;

  @SerializedName("fileFormat")
  private String fileFormat = null;

  @SerializedName("fileSize")
  private String fileSize = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("md5Checksum")
  private String md5Checksum = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameSpace")
  private String nameSpace = null;

  @SerializedName("sftpServerList")
  private List<Object> sftpServerList = null;

  @SerializedName("sha1Checksum")
  private String sha1Checksum = null;

  @SerializedName("taskId")
  private Object taskId = null;

  public FileObjectListResultResponse attributeInfo(Object attributeInfo) {
    this.attributeInfo = attributeInfo;
    return this;
  }

   /**
   * Get attributeInfo
   * @return attributeInfo
  **/
  @ApiModelProperty(value = "")
  public Object getAttributeInfo() {
    return attributeInfo;
  }

  public void setAttributeInfo(Object attributeInfo) {
    this.attributeInfo = attributeInfo;
  }

  public FileObjectListResultResponse downloadPath(String downloadPath) {
    this.downloadPath = downloadPath;
    return this;
  }

   /**
   * Get downloadPath
   * @return downloadPath
  **/
  @ApiModelProperty(value = "")
  public String getDownloadPath() {
    return downloadPath;
  }

  public void setDownloadPath(String downloadPath) {
    this.downloadPath = downloadPath;
  }

  public FileObjectListResultResponse encrypted(Boolean encrypted) {
    this.encrypted = encrypted;
    return this;
  }

   /**
   * Get encrypted
   * @return encrypted
  **/
  @ApiModelProperty(value = "")
  public Boolean isEncrypted() {
    return encrypted;
  }

  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }

  public FileObjectListResultResponse fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * Get fileFormat
   * @return fileFormat
  **/
  @ApiModelProperty(value = "")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public FileObjectListResultResponse fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @ApiModelProperty(value = "")
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  public FileObjectListResultResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FileObjectListResultResponse md5Checksum(String md5Checksum) {
    this.md5Checksum = md5Checksum;
    return this;
  }

   /**
   * Get md5Checksum
   * @return md5Checksum
  **/
  @ApiModelProperty(value = "")
  public String getMd5Checksum() {
    return md5Checksum;
  }

  public void setMd5Checksum(String md5Checksum) {
    this.md5Checksum = md5Checksum;
  }

  public FileObjectListResultResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileObjectListResultResponse nameSpace(String nameSpace) {
    this.nameSpace = nameSpace;
    return this;
  }

   /**
   * Get nameSpace
   * @return nameSpace
  **/
  @ApiModelProperty(value = "")
  public String getNameSpace() {
    return nameSpace;
  }

  public void setNameSpace(String nameSpace) {
    this.nameSpace = nameSpace;
  }

  public FileObjectListResultResponse sftpServerList(List<Object> sftpServerList) {
    this.sftpServerList = sftpServerList;
    return this;
  }

  public FileObjectListResultResponse addSftpServerListItem(Object sftpServerListItem) {
    if (this.sftpServerList == null) {
      this.sftpServerList = new ArrayList<>();
    }
    this.sftpServerList.add(sftpServerListItem);
    return this;
  }

   /**
   * Get sftpServerList
   * @return sftpServerList
  **/
  @ApiModelProperty(value = "")
  public List<Object> getSftpServerList() {
    return sftpServerList;
  }

  public void setSftpServerList(List<Object> sftpServerList) {
    this.sftpServerList = sftpServerList;
  }

  public FileObjectListResultResponse sha1Checksum(String sha1Checksum) {
    this.sha1Checksum = sha1Checksum;
    return this;
  }

   /**
   * Get sha1Checksum
   * @return sha1Checksum
  **/
  @ApiModelProperty(value = "")
  public String getSha1Checksum() {
    return sha1Checksum;
  }

  public void setSha1Checksum(String sha1Checksum) {
    this.sha1Checksum = sha1Checksum;
  }

  public FileObjectListResultResponse taskId(Object taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public Object getTaskId() {
    return taskId;
  }

  public void setTaskId(Object taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileObjectListResultResponse fileObjectListResultResponse = (FileObjectListResultResponse) o;
    return Objects.equals(this.attributeInfo, fileObjectListResultResponse.attributeInfo) &&
        Objects.equals(this.downloadPath, fileObjectListResultResponse.downloadPath) &&
        Objects.equals(this.encrypted, fileObjectListResultResponse.encrypted) &&
        Objects.equals(this.fileFormat, fileObjectListResultResponse.fileFormat) &&
        Objects.equals(this.fileSize, fileObjectListResultResponse.fileSize) &&
        Objects.equals(this.id, fileObjectListResultResponse.id) &&
        Objects.equals(this.md5Checksum, fileObjectListResultResponse.md5Checksum) &&
        Objects.equals(this.name, fileObjectListResultResponse.name) &&
        Objects.equals(this.nameSpace, fileObjectListResultResponse.nameSpace) &&
        Objects.equals(this.sftpServerList, fileObjectListResultResponse.sftpServerList) &&
        Objects.equals(this.sha1Checksum, fileObjectListResultResponse.sha1Checksum) &&
        Objects.equals(this.taskId, fileObjectListResultResponse.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeInfo, downloadPath, encrypted, fileFormat, fileSize, id, md5Checksum, name, nameSpace, sftpServerList, sha1Checksum, taskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileObjectListResultResponse {\n");
    
    sb.append("    attributeInfo: ").append(toIndentedString(attributeInfo)).append("\n");
    sb.append("    downloadPath: ").append(toIndentedString(downloadPath)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    md5Checksum: ").append(toIndentedString(md5Checksum)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameSpace: ").append(toIndentedString(nameSpace)).append("\n");
    sb.append("    sftpServerList: ").append(toIndentedString(sftpServerList)).append("\n");
    sb.append("    sha1Checksum: ").append(toIndentedString(sha1Checksum)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
