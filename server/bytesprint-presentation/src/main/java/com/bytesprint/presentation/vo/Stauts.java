package com.bytesprint.presentation.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "statusName"
})
public class Stauts {

    /**
     *  0=评估，1=签约，2=开发，3=待验收，4=已验收，5=完成
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("0=\u8bc4\u4f30\uff0c1=\u7b7e\u7ea6\uff0c2=\u5f00\u53d1\uff0c3=\u5f85\u9a8c\u6536\uff0c4=\u5df2\u9a8c\u6536\uff0c5=\u5b8c\u6210")
    private Double status;
    /**
     * 状态名称
     * 
     */
    @JsonProperty("statusName")
    @JsonPropertyDescription("\u72b6\u6001\u540d\u79f0")
    private String statusName;

    /**
     *  0=评估，1=签约，2=开发，3=待验收，4=已验收，5=完成
     * 
     */
    @JsonProperty("status")
    public Double getStatus() {
        return status;
    }

    /**
     *  0=评估，1=签约，2=开发，3=待验收，4=已验收，5=完成
     * 
     */
    @JsonProperty("status")
    public void setStatus(Double status) {
        this.status = status;
    }

    /**
     * 状态名称
     * 
     */
    @JsonProperty("statusName")
    public String getStatusName() {
        return statusName;
    }

    /**
     * 状态名称
     * 
     */
    @JsonProperty("statusName")
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stauts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusName");
        sb.append('=');
        sb.append(((this.statusName == null)?"<null>":this.statusName));
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
        result = ((result* 31)+((this.statusName == null)? 0 :this.statusName.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stauts) == false) {
            return false;
        }
        Stauts rhs = ((Stauts) other);
        return (((this.statusName == rhs.statusName)||((this.statusName!= null)&&this.statusName.equals(rhs.statusName)))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
