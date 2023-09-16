package com.bytesprint.presentation.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fileName",
        "fileType",
        "fileUrl"
})
public class File {

    /**
     * 文件名
     */
    @JsonProperty("fileName")
    @JsonPropertyDescription("\u6587\u4ef6\u540d")
    private String fileName;
    /**
     * 文件类型
     */
    @JsonProperty("fileType")
    @JsonPropertyDescription("\u6587\u4ef6\u7c7b\u578b")
    private String fileType;
    /**
     * 文件链接
     */
    @JsonProperty("fileUrl")
    @JsonPropertyDescription("\u6587\u4ef6\u94fe\u63a5")
    private String fileUrl;

    /**
     * 文件名
     */
    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    /**
     * 文件名
     */
    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 文件类型
     */
    @JsonProperty("fileType")
    public String getFileType() {
        return fileType;
    }

    /**
     * 文件类型
     */
    @JsonProperty("fileType")
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * 文件链接
     */
    @JsonProperty("fileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * 文件链接
     */
    @JsonProperty("fileUrl")
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(File.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fileName");
        sb.append('=');
        sb.append(((this.fileName == null) ? "<null>" : this.fileName));
        sb.append(',');
        sb.append("fileType");
        sb.append('=');
        sb.append(((this.fileType == null) ? "<null>" : this.fileType));
        sb.append(',');
        sb.append("fileUrl");
        sb.append('=');
        sb.append(((this.fileUrl == null) ? "<null>" : this.fileUrl));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.fileName == null) ? 0 : this.fileName.hashCode()));
        result = ((result * 31) + ((this.fileUrl == null) ? 0 : this.fileUrl.hashCode()));
        result = ((result * 31) + ((this.fileType == null) ? 0 : this.fileType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof File) == false) {
            return false;
        }
        File rhs = ((File) other);
        return ((((this.fileName == rhs.fileName) || ((this.fileName != null) && this.fileName.equals(rhs.fileName))) && ((this.fileUrl == rhs.fileUrl) || ((this.fileUrl != null) && this.fileUrl.equals(rhs.fileUrl)))) && ((this.fileType == rhs.fileType) || ((this.fileType != null) && this.fileType.equals(rhs.fileType))));
    }

}
