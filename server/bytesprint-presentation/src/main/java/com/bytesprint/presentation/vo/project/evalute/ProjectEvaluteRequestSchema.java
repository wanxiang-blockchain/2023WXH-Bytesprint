package com.bytesprint.presentation.vo.project.evalute;

import java.util.ArrayList;
import java.util.List;

import com.bytesprint.presentation.vo.requirement.RequirementTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requirementTimeList",
    "projectId",
    "uid"
})
public class ProjectEvaluteRequestSchema {

    /**
     * 具体需求耗时
     * 
     */
    @JsonProperty("requirementTimeList")
    @JsonPropertyDescription("\u5177\u4f53\u9700\u6c42\u8017\u65f6")
    private List<RequirementTime> requirementTimeList = new ArrayList<RequirementTime>();
    /**
     * 项目ID
     * 
     */
    @JsonProperty("projectId")
    @JsonPropertyDescription("\u9879\u76eeID")
    private Double projectId;
    /**
     * 用户uid
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("\u7528\u6237uid")
    private String uid;

    /**
     * 具体需求耗时
     * 
     */
    @JsonProperty("requirementTimeList")
    public List<RequirementTime> getRequirementTimeList() {
        return requirementTimeList;
    }

    /**
     * 具体需求耗时
     * 
     */
    @JsonProperty("requirementTimeList")
    public void setRequirementTimeList(List<RequirementTime> requirementTimeList) {
        this.requirementTimeList = requirementTimeList;
    }

    /**
     * 项目ID
     * 
     */
    @JsonProperty("projectId")
    public Double getProjectId() {
        return projectId;
    }

    /**
     * 项目ID
     * 
     */
    @JsonProperty("projectId")
    public void setProjectId(Double projectId) {
        this.projectId = projectId;
    }

    /**
     * 用户uid
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * 用户uid
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectEvaluteRequestSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requirementTimeList");
        sb.append('=');
        sb.append(((this.requirementTimeList == null)?"<null>":this.requirementTimeList));
        sb.append(',');
        sb.append("projectId");
        sb.append('=');
        sb.append(((this.projectId == null)?"<null>":this.projectId));
        sb.append(',');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
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
        result = ((result* 31)+((this.requirementTimeList == null)? 0 :this.requirementTimeList.hashCode()));
        result = ((result* 31)+((this.projectId == null)? 0 :this.projectId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectEvaluteRequestSchema) == false) {
            return false;
        }
        ProjectEvaluteRequestSchema rhs = ((ProjectEvaluteRequestSchema) other);
        return ((((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid)))&&((this.requirementTimeList == rhs.requirementTimeList)||((this.requirementTimeList!= null)&&this.requirementTimeList.equals(rhs.requirementTimeList))))&&((this.projectId == rhs.projectId)||((this.projectId!= null)&&this.projectId.equals(rhs.projectId))));
    }

}
