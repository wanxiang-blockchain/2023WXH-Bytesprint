package com.bytesprint.presentation.vo.project.submit;

import java.util.ArrayList;
import java.util.List;

import com.bytesprint.presentation.vo.project.ContactInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.bytesprint.presentation.vo.File;
import com.bytesprint.presentation.vo.requirement.RequirementVO;


/**
 * title
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "projectName",
    "categoryId",
    "descrpiton",
    "fileList",
    "requirementList",
    "contactInfo",
    "walletAddress"
})
public class ProjectSubmitRequestSchema {

    /**
     * 项目名
     * 
     */
    @JsonProperty("projectName")
    @JsonPropertyDescription("\u9879\u76ee\u540d")
    private String projectName;
    /**
     * 项目类型
     * 
     */
    @JsonProperty("categoryId")
    @JsonPropertyDescription("\u9879\u76ee\u7c7b\u578b")
    private Double categoryId;
    /**
     * 项目描述
     * 
     */
    @JsonProperty("descrpiton")
    @JsonPropertyDescription("\u9879\u76ee\u63cf\u8ff0")
    private String descrpiton;
    /**
     * 文件列表
     * 
     */
    @JsonProperty("fileList")
    @JsonPropertyDescription("\u6587\u4ef6\u5217\u8868")
    private List<File> fileList = new ArrayList<File>();
    /**
     * 需求清单
     * 
     */
    @JsonProperty("requirementList")
    @JsonPropertyDescription("\u9700\u6c42\u6e05\u5355")
    private List<RequirementVO> requirementList = new ArrayList<RequirementVO>();
    /**
     * 联系人信息
     * 
     */
    @JsonProperty("contactInfo")
    @JsonPropertyDescription("\u8054\u7cfb\u4eba\u4fe1\u606f")
    private ContactInfo contactInfo;
    /**
     * 钱包地址
     * 
     */
    @JsonProperty("walletAddress")
    @JsonPropertyDescription("\u94b1\u5305\u5730\u5740")
    private String walletAddress;

    /**
     * 项目名
     * 
     */
    @JsonProperty("projectName")
    public String getProjectName() {
        return projectName;
    }

    /**
     * 项目名
     * 
     */
    @JsonProperty("projectName")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 项目类型
     * 
     */
    @JsonProperty("categoryId")
    public Double getCategoryId() {
        return categoryId;
    }

    /**
     * 项目类型
     * 
     */
    @JsonProperty("categoryId")
    public void setCategoryId(Double categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 项目描述
     * 
     */
    @JsonProperty("descrpiton")
    public String getDescrpiton() {
        return descrpiton;
    }

    /**
     * 项目描述
     * 
     */
    @JsonProperty("descrpiton")
    public void setDescrpiton(String descrpiton) {
        this.descrpiton = descrpiton;
    }

    /**
     * 文件列表
     * 
     */
    @JsonProperty("fileList")
    public List<File> getFileList() {
        return fileList;
    }

    /**
     * 文件列表
     * 
     */
    @JsonProperty("fileList")
    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    /**
     * 需求清单
     * 
     */
    @JsonProperty("requirementList")
    public List<RequirementVO> getRequirementList() {
        return requirementList;
    }

    /**
     * 需求清单
     * 
     */
    @JsonProperty("requirementList")
    public void setRequirementList(List<RequirementVO> requirementList) {
        this.requirementList = requirementList;
    }

    /**
     * 联系人信息
     * 
     */
    @JsonProperty("contactInfo")
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * 联系人信息
     * 
     */
    @JsonProperty("contactInfo")
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * 钱包地址
     * 
     */
    @JsonProperty("walletAddress")
    public String getWalletAddress() {
        return walletAddress;
    }

    /**
     * 钱包地址
     * 
     */
    @JsonProperty("walletAddress")
    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectSubmitRequestSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projectName");
        sb.append('=');
        sb.append(((this.projectName == null)?"<null>":this.projectName));
        sb.append(',');
        sb.append("categoryId");
        sb.append('=');
        sb.append(((this.categoryId == null)?"<null>":this.categoryId));
        sb.append(',');
        sb.append("descrpiton");
        sb.append('=');
        sb.append(((this.descrpiton == null)?"<null>":this.descrpiton));
        sb.append(',');
        sb.append("fileList");
        sb.append('=');
        sb.append(((this.fileList == null)?"<null>":this.fileList));
        sb.append(',');
        sb.append("requirementList");
        sb.append('=');
        sb.append(((this.requirementList == null)?"<null>":this.requirementList));
        sb.append(',');
        sb.append("contactInfo");
        sb.append('=');
        sb.append(((this.contactInfo == null)?"<null>":this.contactInfo));
        sb.append(',');
        sb.append("walletAddress");
        sb.append('=');
        sb.append(((this.walletAddress == null)?"<null>":this.walletAddress));
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
        result = ((result* 31)+((this.contactInfo == null)? 0 :this.contactInfo.hashCode()));
        result = ((result* 31)+((this.projectName == null)? 0 :this.projectName.hashCode()));
        result = ((result* 31)+((this.walletAddress == null)? 0 :this.walletAddress.hashCode()));
        result = ((result* 31)+((this.descrpiton == null)? 0 :this.descrpiton.hashCode()));
        result = ((result* 31)+((this.categoryId == null)? 0 :this.categoryId.hashCode()));
        result = ((result* 31)+((this.fileList == null)? 0 :this.fileList.hashCode()));
        result = ((result* 31)+((this.requirementList == null)? 0 :this.requirementList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectSubmitRequestSchema) == false) {
            return false;
        }
        ProjectSubmitRequestSchema rhs = ((ProjectSubmitRequestSchema) other);
        return ((((((((this.contactInfo == rhs.contactInfo)||((this.contactInfo!= null)&&this.contactInfo.equals(rhs.contactInfo)))&&((this.projectName == rhs.projectName)||((this.projectName!= null)&&this.projectName.equals(rhs.projectName))))&&((this.walletAddress == rhs.walletAddress)||((this.walletAddress!= null)&&this.walletAddress.equals(rhs.walletAddress))))&&((this.descrpiton == rhs.descrpiton)||((this.descrpiton!= null)&&this.descrpiton.equals(rhs.descrpiton))))&&((this.categoryId == rhs.categoryId)||((this.categoryId!= null)&&this.categoryId.equals(rhs.categoryId))))&&((this.fileList == rhs.fileList)||((this.fileList!= null)&&this.fileList.equals(rhs.fileList))))&&((this.requirementList == rhs.requirementList)||((this.requirementList!= null)&&this.requirementList.equals(rhs.requirementList))));
    }

}
