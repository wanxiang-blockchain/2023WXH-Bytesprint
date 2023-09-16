package com.bytesprint.presentation.vo.project.detail;

import com.bytesprint.presentation.vo.Result;
import com.bytesprint.presentation.vo.project.ProjectVO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "result",
        "com/bytesprint/presentation/vo/project"
})
public class ProjectDetailResponseSchema {

    @JsonProperty("result")
    private Result result;
    @JsonProperty("com/bytesprint/presentation/vo/project")
    private ProjectVO project;

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonProperty("com/bytesprint/presentation/vo/project")
    public ProjectVO getProject() {
        return project;
    }

    @JsonProperty("com/bytesprint/presentation/vo/project")
    public void setProject(ProjectVO project) {
        this.project = project;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectDetailResponseSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("com/bytesprint/presentation/vo/project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
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
        result = ((result* 31)+((this.project == null)? 0 :this.project.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectDetailResponseSchema) == false) {
            return false;
        }
        ProjectDetailResponseSchema rhs = ((ProjectDetailResponseSchema) other);
        return (((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.project == rhs.project)||((this.project!= null)&&this.project.equals(rhs.project))));
    }

}
