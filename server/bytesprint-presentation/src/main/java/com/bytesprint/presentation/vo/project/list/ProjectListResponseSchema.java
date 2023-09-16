package com.bytesprint.presentation.vo.project.list;

import java.util.ArrayList;
import java.util.List;

import com.bytesprint.presentation.vo.project.ProjectVO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.bytesprint.presentation.vo.Result;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "result",
    "projectList"
})
public class ProjectListResponseSchema {

    /**
     * 返回结果
     * 
     */
    @JsonProperty("result")
    @JsonPropertyDescription("\u8fd4\u56de\u7ed3\u679c")
    private Result result;
    /**
     * 任务列表
     * 
     */
    @JsonProperty("projectList")
    @JsonPropertyDescription("\u4efb\u52a1\u5217\u8868")
    private List<ProjectVO> projectList = new ArrayList<ProjectVO>();

    /**
     * 返回结果
     * 
     */
    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    /**
     * 返回结果
     * 
     */
    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

    /**
     * 任务列表
     * 
     */
    @JsonProperty("projectList")
    public List<ProjectVO> getProjectList() {
        return projectList;
    }

    /**
     * 任务列表
     * 
     */
    @JsonProperty("projectList")
    public void setProjectList(List<ProjectVO> projectList) {
        this.projectList = projectList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectListResponseSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("projectList");
        sb.append('=');
        sb.append(((this.projectList == null)?"<null>":this.projectList));
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
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.projectList == null)? 0 :this.projectList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectListResponseSchema) == false) {
            return false;
        }
        ProjectListResponseSchema rhs = ((ProjectListResponseSchema) other);
        return (((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.projectList == rhs.projectList)||((this.projectList!= null)&&this.projectList.equals(rhs.projectList))));
    }

}
