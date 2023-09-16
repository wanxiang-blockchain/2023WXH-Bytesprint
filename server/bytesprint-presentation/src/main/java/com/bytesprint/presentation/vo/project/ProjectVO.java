package com.bytesprint.presentation.vo.project;

import com.bytesprint.presentation.vo.File;
import com.bytesprint.presentation.vo.requirement.RequirementVO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "joinMemberCount",
        "endTime",
        "startTime",
        "description",
        "categoryName",
        "categoryId",
        "name",
        "status",
        "maxJoinMemberCount",
        "requirementList",
        "assetRecordList",
        "fileList",
        "developPlan"
})
public class ProjectVO {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("joinMemberCount")
    private Integer joinMemberCount;
    @JsonProperty("endTime")
    private String endTime;
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("description")
    private String description;
    @JsonProperty("categoryName")
    private String categoryName;
    @JsonProperty("categoryId")
    private Integer categoryId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("maxJoinMemberCount")
    private Integer maxJoinMemberCount;
    /**
     * 需求清单
     */
    @JsonProperty("requirementList")
    @JsonPropertyDescription("\u9700\u6c42\u6e05\u5355")
    private List<RequirementVO> requirementList = new ArrayList<RequirementVO>();
    /**
     * 评估记录
     */
    @JsonProperty("assetRecordList")
    @JsonPropertyDescription("\u8bc4\u4f30\u8bb0\u5f55")
    private List<AssetRecord> assetRecordList = new ArrayList<AssetRecord>();
    /**
     * 文件列表
     */
    @JsonProperty("fileList")
    @JsonPropertyDescription("\u6587\u4ef6\u5217\u8868")
    private List<File> fileList = new ArrayList<File>();
    /**
     * 开发计划列表
     */
    @JsonProperty("developPlan")
    @JsonPropertyDescription("\u5f00\u53d1\u8ba1\u5212\u5217\u8868")
    private List<DevelopPlan> developPlan = new ArrayList<DevelopPlan>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("joinMemberCount")
    public Integer getJoinMemberCount() {
        return joinMemberCount;
    }

    @JsonProperty("joinMemberCount")
    public void setJoinMemberCount(Integer joinMemberCount) {
        this.joinMemberCount = joinMemberCount;
    }

    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("categoryName")
    public String getCategoryName() {
        return categoryName;
    }

    @JsonProperty("categoryName")
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @JsonProperty("categoryId")
    public Integer getCategoryId() {
        return categoryId;
    }

    @JsonProperty("categoryId")
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("maxJoinMemberCount")
    public Integer getMaxJoinMemberCount() {
        return maxJoinMemberCount;
    }

    @JsonProperty("maxJoinMemberCount")
    public void setMaxJoinMemberCount(Integer maxJoinMemberCount) {
        this.maxJoinMemberCount = maxJoinMemberCount;
    }

    /**
     * 需求清单
     */
    @JsonProperty("requirementList")
    public List<RequirementVO> getRequirementList() {
        return requirementList;
    }

    /**
     * 需求清单
     */
    @JsonProperty("requirementList")
    public void setRequirementList(List<RequirementVO> requirementList) {
        this.requirementList = requirementList;
    }

    /**
     * 评估记录
     */
    @JsonProperty("assetRecordList")
    public List<AssetRecord> getAssetRecordList() {
        return assetRecordList;
    }

    /**
     * 评估记录
     */
    @JsonProperty("assetRecordList")
    public void setAssetRecordList(List<AssetRecord> assetRecordList) {
        this.assetRecordList = assetRecordList;
    }

    /**
     * 文件列表
     */
    @JsonProperty("fileList")
    public List<File> getFileList() {
        return fileList;
    }

    /**
     * 文件列表
     */
    @JsonProperty("fileList")
    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    /**
     * 开发计划列表
     */
    @JsonProperty("developPlan")
    public List<DevelopPlan> getDevelopPlan() {
        return developPlan;
    }

    /**
     * 开发计划列表
     */
    @JsonProperty("developPlan")
    public void setDevelopPlan(List<DevelopPlan> developPlan) {
        this.developPlan = developPlan;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectVO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("joinMemberCount");
        sb.append('=');
        sb.append(((this.joinMemberCount == null) ? "<null>" : this.joinMemberCount));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null) ? "<null>" : this.endTime));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null) ? "<null>" : this.startTime));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("categoryName");
        sb.append('=');
        sb.append(((this.categoryName == null) ? "<null>" : this.categoryName));
        sb.append(',');
        sb.append("categoryId");
        sb.append('=');
        sb.append(((this.categoryId == null) ? "<null>" : this.categoryId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null) ? "<null>" : this.status));
        sb.append(',');
        sb.append("maxJoinMemberCount");
        sb.append('=');
        sb.append(((this.maxJoinMemberCount == null) ? "<null>" : this.maxJoinMemberCount));
        sb.append(',');
        sb.append("requirementList");
        sb.append('=');
        sb.append(((this.requirementList == null) ? "<null>" : this.requirementList));
        sb.append(',');
        sb.append("assetRecordList");
        sb.append('=');
        sb.append(((this.assetRecordList == null) ? "<null>" : this.assetRecordList));
        sb.append(',');
        sb.append("fileList");
        sb.append('=');
        sb.append(((this.fileList == null) ? "<null>" : this.fileList));
        sb.append(',');
        sb.append("developPlan");
        sb.append('=');
        sb.append(((this.developPlan == null) ? "<null>" : this.developPlan));
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
        result = ((result * 31) + ((this.maxJoinMemberCount == null) ? 0 : this.maxJoinMemberCount.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.developPlan == null) ? 0 : this.developPlan.hashCode()));
        result = ((result * 31) + ((this.assetRecordList == null) ? 0 : this.assetRecordList.hashCode()));
        result = ((result * 31) + ((this.categoryName == null) ? 0 : this.categoryName.hashCode()));
        result = ((result * 31) + ((this.requirementList == null) ? 0 : this.requirementList.hashCode()));
        result = ((result * 31) + ((this.joinMemberCount == null) ? 0 : this.joinMemberCount.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.startTime == null) ? 0 : this.startTime.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.endTime == null) ? 0 : this.endTime.hashCode()));
        result = ((result * 31) + ((this.categoryId == null) ? 0 : this.categoryId.hashCode()));
        result = ((result * 31) + ((this.fileList == null) ? 0 : this.fileList.hashCode()));
        result = ((result * 31) + ((this.status == null) ? 0 : this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectVO) == false) {
            return false;
        }
        ProjectVO rhs = ((ProjectVO) other);
        return (((((((((((((((this.maxJoinMemberCount == rhs.maxJoinMemberCount) || ((this.maxJoinMemberCount != null) && this.maxJoinMemberCount.equals(rhs.maxJoinMemberCount))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.developPlan == rhs.developPlan) || ((this.developPlan != null) && this.developPlan.equals(rhs.developPlan)))) && ((this.assetRecordList == rhs.assetRecordList) || ((this.assetRecordList != null) && this.assetRecordList.equals(rhs.assetRecordList)))) && ((this.categoryName == rhs.categoryName) || ((this.categoryName != null) && this.categoryName.equals(rhs.categoryName)))) && ((this.requirementList == rhs.requirementList) || ((this.requirementList != null) && this.requirementList.equals(rhs.requirementList)))) && ((this.joinMemberCount == rhs.joinMemberCount) || ((this.joinMemberCount != null) && this.joinMemberCount.equals(rhs.joinMemberCount)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.startTime == rhs.startTime) || ((this.startTime != null) && this.startTime.equals(rhs.startTime)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.endTime == rhs.endTime) || ((this.endTime != null) && this.endTime.equals(rhs.endTime)))) && ((this.categoryId == rhs.categoryId) || ((this.categoryId != null) && this.categoryId.equals(rhs.categoryId)))) && ((this.fileList == rhs.fileList) || ((this.fileList != null) && this.fileList.equals(rhs.fileList)))) && ((this.status == rhs.status) || ((this.status != null) && this.status.equals(rhs.status))));
    }

}
