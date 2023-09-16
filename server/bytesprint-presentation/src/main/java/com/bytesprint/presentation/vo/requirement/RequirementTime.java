package com.bytesprint.presentation.vo.requirement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requirementId",
    "requirementTime"
})
public class RequirementTime {

    /**
     * 需求编号
     * 
     */
    @JsonProperty("requirementId")
    @JsonPropertyDescription("\u9700\u6c42\u7f16\u53f7")
    private Double requirementId;
    /**
     * 需求工时
     * 
     */
    @JsonProperty("requirementTime")
    @JsonPropertyDescription("\u9700\u6c42\u5de5\u65f6")
    private String requirementTime;

    /**
     * 需求编号
     * 
     */
    @JsonProperty("requirementId")
    public Double getRequirementId() {
        return requirementId;
    }

    /**
     * 需求编号
     * 
     */
    @JsonProperty("requirementId")
    public void setRequirementId(Double requirementId) {
        this.requirementId = requirementId;
    }

    /**
     * 需求工时
     * 
     */
    @JsonProperty("requirementTime")
    public String getRequirementTime() {
        return requirementTime;
    }

    /**
     * 需求工时
     * 
     */
    @JsonProperty("requirementTime")
    public void setRequirementTime(String requirementTime) {
        this.requirementTime = requirementTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequirementTime.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requirementId");
        sb.append('=');
        sb.append(((this.requirementId == null)?"<null>":this.requirementId));
        sb.append(',');
        sb.append("requirementTime");
        sb.append('=');
        sb.append(((this.requirementTime == null)?"<null>":this.requirementTime));
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
        result = ((result* 31)+((this.requirementId == null)? 0 :this.requirementId.hashCode()));
        result = ((result* 31)+((this.requirementTime == null)? 0 :this.requirementTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequirementTime) == false) {
            return false;
        }
        RequirementTime rhs = ((RequirementTime) other);
        return (((this.requirementId == rhs.requirementId)||((this.requirementId!= null)&&this.requirementId.equals(rhs.requirementId)))&&((this.requirementTime == rhs.requirementTime)||((this.requirementTime!= null)&&this.requirementTime.equals(rhs.requirementTime))));
    }

}
