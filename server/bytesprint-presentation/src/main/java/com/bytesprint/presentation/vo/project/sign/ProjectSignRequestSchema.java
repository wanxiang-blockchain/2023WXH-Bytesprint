package com.bytesprint.presentation.vo.project.sign;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * title
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uid",
    "walletAddress",
    "projectId"
})
public class ProjectSignRequestSchema {

    /**
     * 签约用户id
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("\u7b7e\u7ea6\u7528\u6237id")
    private String uid;
    /**
     * 签约钱包地址
     * 
     */
    @JsonProperty("walletAddress")
    @JsonPropertyDescription("\u7b7e\u7ea6\u94b1\u5305\u5730\u5740")
    private String walletAddress;
    /**
     * 项目id
     * 
     */
    @JsonProperty("projectId")
    @JsonPropertyDescription("\u9879\u76eeid")
    private String projectId;

    /**
     * 签约用户id
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * 签约用户id
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 签约钱包地址
     * 
     */
    @JsonProperty("walletAddress")
    public String getWalletAddress() {
        return walletAddress;
    }

    /**
     * 签约钱包地址
     * 
     */
    @JsonProperty("walletAddress")
    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    /**
     * 项目id
     * 
     */
    @JsonProperty("projectId")
    public String getProjectId() {
        return projectId;
    }

    /**
     * 项目id
     * 
     */
    @JsonProperty("projectId")
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectSignRequestSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
        sb.append(',');
        sb.append("walletAddress");
        sb.append('=');
        sb.append(((this.walletAddress == null)?"<null>":this.walletAddress));
        sb.append(',');
        sb.append("projectId");
        sb.append('=');
        sb.append(((this.projectId == null)?"<null>":this.projectId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.walletAddress == null)? 0 :this.walletAddress.hashCode()));
        result = ((result* 31)+((this.projectId == null)? 0 :this.projectId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectSignRequestSchema) == false) {
            return false;
        }
        ProjectSignRequestSchema rhs = ((ProjectSignRequestSchema) other);
        return ((((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid)))&&((this.walletAddress == rhs.walletAddress)||((this.walletAddress!= null)&&this.walletAddress.equals(rhs.walletAddress))))&&((this.projectId == rhs.projectId)||((this.projectId!= null)&&this.projectId.equals(rhs.projectId))));
    }

}
