package com.bytesprint.presentation.vo.requirement.plansubmit;

import java.util.ArrayList;
import java.util.List;

import com.bytesprint.presentation.vo.project.DevelopPlan;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * title
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "developPlan",
    "uid",
    "walletAddress",
    "projectid"
})
public class RequirementPlanSubmitRequestShcema {

    /**
     * 开发计划列表
     * 
     */
    @JsonProperty("developPlan")
    @JsonPropertyDescription("\u5f00\u53d1\u8ba1\u5212\u5217\u8868")
    private List<DevelopPlan> developPlan = new ArrayList<DevelopPlan>();
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("walletAddress")
    private String walletAddress;
    @JsonProperty("projectid")
    private Double projectid;

    /**
     * 开发计划列表
     * 
     */
    @JsonProperty("developPlan")
    public List<DevelopPlan> getDevelopPlan() {
        return developPlan;
    }

    /**
     * 开发计划列表
     * 
     */
    @JsonProperty("developPlan")
    public void setDevelopPlan(List<DevelopPlan> developPlan) {
        this.developPlan = developPlan;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("walletAddress")
    public String getWalletAddress() {
        return walletAddress;
    }

    @JsonProperty("walletAddress")
    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @JsonProperty("projectid")
    public Double getProjectid() {
        return projectid;
    }

    @JsonProperty("projectid")
    public void setProjectid(Double projectid) {
        this.projectid = projectid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequirementPlanSubmitRequestShcema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("developPlan");
        sb.append('=');
        sb.append(((this.developPlan == null)?"<null>":this.developPlan));
        sb.append(',');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
        sb.append(',');
        sb.append("walletAddress");
        sb.append('=');
        sb.append(((this.walletAddress == null)?"<null>":this.walletAddress));
        sb.append(',');
        sb.append("projectid");
        sb.append('=');
        sb.append(((this.projectid == null)?"<null>":this.projectid));
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
        result = ((result* 31)+((this.developPlan == null)? 0 :this.developPlan.hashCode()));
        result = ((result* 31)+((this.walletAddress == null)? 0 :this.walletAddress.hashCode()));
        result = ((result* 31)+((this.projectid == null)? 0 :this.projectid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequirementPlanSubmitRequestShcema) == false) {
            return false;
        }
        RequirementPlanSubmitRequestShcema rhs = ((RequirementPlanSubmitRequestShcema) other);
        return (((((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid)))&&((this.developPlan == rhs.developPlan)||((this.developPlan!= null)&&this.developPlan.equals(rhs.developPlan))))&&((this.walletAddress == rhs.walletAddress)||((this.walletAddress!= null)&&this.walletAddress.equals(rhs.walletAddress))))&&((this.projectid == rhs.projectid)||((this.projectid!= null)&&this.projectid.equals(rhs.projectid))));
    }

}
