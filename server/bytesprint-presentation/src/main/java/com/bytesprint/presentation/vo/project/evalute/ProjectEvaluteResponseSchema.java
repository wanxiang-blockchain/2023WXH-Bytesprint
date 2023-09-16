package com.bytesprint.presentation.vo.project.evalute;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.bytesprint.presentation.vo.Result;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "result",
    "pledgeMoney",
    "totalCost",
    "totalTime"
})
public class ProjectEvaluteResponseSchema {

    @JsonProperty("result")
    private Result result;
    /**
     * 待质押金额，单位BTYD
     * 
     */
    @JsonProperty("pledgeMoney")
    @JsonPropertyDescription("\u5f85\u8d28\u62bc\u91d1\u989d\uff0c\u5355\u4f4dBTYD")
    private Double pledgeMoney;
    /**
     * 总费用，单位USDT
     * 
     */
    @JsonProperty("totalCost")
    @JsonPropertyDescription("\u603b\u8d39\u7528\uff0c\u5355\u4f4dUSDT")
    private Double totalCost;
    /**
     * 总工时，单位H
     * 
     */
    @JsonProperty("totalTime")
    @JsonPropertyDescription("\u603b\u5de5\u65f6\uff0c\u5355\u4f4dH")
    private Double totalTime;

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

    /**
     * 待质押金额，单位BTYD
     * 
     */
    @JsonProperty("pledgeMoney")
    public Double getPledgeMoney() {
        return pledgeMoney;
    }

    /**
     * 待质押金额，单位BTYD
     * 
     */
    @JsonProperty("pledgeMoney")
    public void setPledgeMoney(Double pledgeMoney) {
        this.pledgeMoney = pledgeMoney;
    }

    /**
     * 总费用，单位USDT
     * 
     */
    @JsonProperty("totalCost")
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * 总费用，单位USDT
     * 
     */
    @JsonProperty("totalCost")
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 总工时，单位H
     * 
     */
    @JsonProperty("totalTime")
    public Double getTotalTime() {
        return totalTime;
    }

    /**
     * 总工时，单位H
     * 
     */
    @JsonProperty("totalTime")
    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectEvaluteResponseSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("pledgeMoney");
        sb.append('=');
        sb.append(((this.pledgeMoney == null)?"<null>":this.pledgeMoney));
        sb.append(',');
        sb.append("totalCost");
        sb.append('=');
        sb.append(((this.totalCost == null)?"<null>":this.totalCost));
        sb.append(',');
        sb.append("totalTime");
        sb.append('=');
        sb.append(((this.totalTime == null)?"<null>":this.totalTime));
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
        result = ((result* 31)+((this.pledgeMoney == null)? 0 :this.pledgeMoney.hashCode()));
        result = ((result* 31)+((this.totalCost == null)? 0 :this.totalCost.hashCode()));
        result = ((result* 31)+((this.totalTime == null)? 0 :this.totalTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectEvaluteResponseSchema) == false) {
            return false;
        }
        ProjectEvaluteResponseSchema rhs = ((ProjectEvaluteResponseSchema) other);
        return (((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.pledgeMoney == rhs.pledgeMoney)||((this.pledgeMoney!= null)&&this.pledgeMoney.equals(rhs.pledgeMoney))))&&((this.totalCost == rhs.totalCost)||((this.totalCost!= null)&&this.totalCost.equals(rhs.totalCost))))&&((this.totalTime == rhs.totalTime)||((this.totalTime!= null)&&this.totalTime.equals(rhs.totalTime))));
    }

}
