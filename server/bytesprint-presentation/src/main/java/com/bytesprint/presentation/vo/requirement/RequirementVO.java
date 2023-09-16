package com.bytesprint.presentation.vo.requirement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requirementId",
    "requirementName",
    "requirementDescription"
})
public class RequirementVO {

    /**
     * 需求编号
     * 
     */
    @JsonProperty("requirementId")
    @JsonPropertyDescription("\u9700\u6c42\u7f16\u53f7")
    private Double requirementId;
    /**
     * 需求名称
     * 
     */
    @JsonProperty("requirementName")
    @JsonPropertyDescription("\u9700\u6c42\u540d\u79f0")
    private String requirementName;
    /**
     * 需求描述
     * 
     */
    @JsonProperty("requirementDescription")
    @JsonPropertyDescription("\u9700\u6c42\u63cf\u8ff0")
    private String requirementDescription;

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
     * 需求名称
     * 
     */
    @JsonProperty("requirementName")
    public String getRequirementName() {
        return requirementName;
    }

    /**
     * 需求名称
     * 
     */
    @JsonProperty("requirementName")
    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    /**
     * 需求描述
     * 
     */
    @JsonProperty("requirementDescription")
    public String getRequirementDescription() {
        return requirementDescription;
    }

    /**
     * 需求描述
     * 
     */
    @JsonProperty("requirementDescription")
    public void setRequirementDescription(String requirementDescription) {
        this.requirementDescription = requirementDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequirementVO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requirementId");
        sb.append('=');
        sb.append(((this.requirementId == null)?"<null>":this.requirementId));
        sb.append(',');
        sb.append("requirementName");
        sb.append('=');
        sb.append(((this.requirementName == null)?"<null>":this.requirementName));
        sb.append(',');
        sb.append("requirementDescription");
        sb.append('=');
        sb.append(((this.requirementDescription == null)?"<null>":this.requirementDescription));
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
        result = ((result* 31)+((this.requirementName == null)? 0 :this.requirementName.hashCode()));
        result = ((result* 31)+((this.requirementDescription == null)? 0 :this.requirementDescription.hashCode()));
        result = ((result* 31)+((this.requirementId == null)? 0 :this.requirementId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequirementVO) == false) {
            return false;
        }
        RequirementVO rhs = ((RequirementVO) other);
        return ((((this.requirementName == rhs.requirementName)||((this.requirementName!= null)&&this.requirementName.equals(rhs.requirementName)))&&((this.requirementDescription == rhs.requirementDescription)||((this.requirementDescription!= null)&&this.requirementDescription.equals(rhs.requirementDescription))))&&((this.requirementId == rhs.requirementId)||((this.requirementId!= null)&&this.requirementId.equals(rhs.requirementId))));
    }

}
