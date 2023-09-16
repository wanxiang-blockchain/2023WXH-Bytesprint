package com.bytesprint.presentation.vo.project;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 开发计划
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "requirementId",
        "requirementTime",
        "startTime",
        "expectedFinishTime",
        "actualFinishTime",
        "requirementStatus"
})
public class DevelopPlan {

    /**
     * 需求编号
     */
    @JsonProperty("requirementId")
    @JsonPropertyDescription("\u9700\u6c42\u7f16\u53f7")
    private Double requirementId;
    /**
     * 需求工时
     */
    @JsonProperty("requirementTime")
    @JsonPropertyDescription("\u9700\u6c42\u5de5\u65f6")
    private String requirementTime;
    /**
     * 需求开始时间
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("\u9700\u6c42\u5f00\u59cb\u65f6\u95f4")
    private String startTime;
    /**
     * 预计完成时间
     */
    @JsonProperty("expectedFinishTime")
    @JsonPropertyDescription("\u9884\u8ba1\u5b8c\u6210\u65f6\u95f4")
    private String expectedFinishTime;
    /**
     * 实际完成时间
     */
    @JsonProperty("actualFinishTime")
    @JsonPropertyDescription("\u5b9e\u9645\u5b8c\u6210\u65f6\u95f4")
    private String actualFinishTime;
    /**
     * 需求状态 0:未开始，1进行中，2已完成
     */
    @JsonProperty("requirementStatus")
    @JsonPropertyDescription("\u9700\u6c42\u72b6\u6001 0:\u672a\u5f00\u59cb\uff0c1\u8fdb\u884c\u4e2d\uff0c2\u5df2\u5b8c\u6210")
    private Double requirementStatus;

    /**
     * 需求编号
     */
    @JsonProperty("requirementId")
    public Double getRequirementId() {
        return requirementId;
    }

    /**
     * 需求编号
     */
    @JsonProperty("requirementId")
    public void setRequirementId(Double requirementId) {
        this.requirementId = requirementId;
    }

    /**
     * 需求工时
     */
    @JsonProperty("requirementTime")
    public String getRequirementTime() {
        return requirementTime;
    }

    /**
     * 需求工时
     */
    @JsonProperty("requirementTime")
    public void setRequirementTime(String requirementTime) {
        this.requirementTime = requirementTime;
    }

    /**
     * 需求开始时间
     */
    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    /**
     * 需求开始时间
     */
    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 预计完成时间
     */
    @JsonProperty("expectedFinishTime")
    public String getExpectedFinishTime() {
        return expectedFinishTime;
    }

    /**
     * 预计完成时间
     */
    @JsonProperty("expectedFinishTime")
    public void setExpectedFinishTime(String expectedFinishTime) {
        this.expectedFinishTime = expectedFinishTime;
    }

    /**
     * 实际完成时间
     */
    @JsonProperty("actualFinishTime")
    public String getActualFinishTime() {
        return actualFinishTime;
    }

    /**
     * 实际完成时间
     */
    @JsonProperty("actualFinishTime")
    public void setActualFinishTime(String actualFinishTime) {
        this.actualFinishTime = actualFinishTime;
    }

    /**
     * 需求状态 0:未开始，1进行中，2已完成
     */
    @JsonProperty("requirementStatus")
    public Double getRequirementStatus() {
        return requirementStatus;
    }

    /**
     * 需求状态 0:未开始，1进行中，2已完成
     */
    @JsonProperty("requirementStatus")
    public void setRequirementStatus(Double requirementStatus) {
        this.requirementStatus = requirementStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DevelopPlan.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requirementId");
        sb.append('=');
        sb.append(((this.requirementId == null) ? "<null>" : this.requirementId));
        sb.append(',');
        sb.append("requirementTime");
        sb.append('=');
        sb.append(((this.requirementTime == null) ? "<null>" : this.requirementTime));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null) ? "<null>" : this.startTime));
        sb.append(',');
        sb.append("expectedFinishTime");
        sb.append('=');
        sb.append(((this.expectedFinishTime == null) ? "<null>" : this.expectedFinishTime));
        sb.append(',');
        sb.append("actualFinishTime");
        sb.append('=');
        sb.append(((this.actualFinishTime == null) ? "<null>" : this.actualFinishTime));
        sb.append(',');
        sb.append("requirementStatus");
        sb.append('=');
        sb.append(((this.requirementStatus == null) ? "<null>" : this.requirementStatus));
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
        result = ((result * 31) + ((this.requirementTime == null) ? 0 : this.requirementTime.hashCode()));
        result = ((result * 31) + ((this.startTime == null) ? 0 : this.startTime.hashCode()));
        result = ((result * 31) + ((this.requirementId == null) ? 0 : this.requirementId.hashCode()));
        result = ((result * 31) + ((this.expectedFinishTime == null) ? 0 : this.expectedFinishTime.hashCode()));
        result = ((result * 31) + ((this.requirementStatus == null) ? 0 : this.requirementStatus.hashCode()));
        result = ((result * 31) + ((this.actualFinishTime == null) ? 0 : this.actualFinishTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DevelopPlan) == false) {
            return false;
        }
        DevelopPlan rhs = ((DevelopPlan) other);
        return (((((((this.requirementTime == rhs.requirementTime) || ((this.requirementTime != null) && this.requirementTime.equals(rhs.requirementTime))) && ((this.startTime == rhs.startTime) || ((this.startTime != null) && this.startTime.equals(rhs.startTime)))) && ((this.requirementId == rhs.requirementId) || ((this.requirementId != null) && this.requirementId.equals(rhs.requirementId)))) && ((this.expectedFinishTime == rhs.expectedFinishTime) || ((this.expectedFinishTime != null) && this.expectedFinishTime.equals(rhs.expectedFinishTime)))) && ((this.requirementStatus == rhs.requirementStatus) || ((this.requirementStatus != null) && this.requirementStatus.equals(rhs.requirementStatus)))) && ((this.actualFinishTime == rhs.actualFinishTime) || ((this.actualFinishTime != null) && this.actualFinishTime.equals(rhs.actualFinishTime))));
    }

}
