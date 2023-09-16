package com.bytesprint.presentation.vo.project;

import com.bytesprint.presentation.vo.requirement.RequirementTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "totalTime",
        "totalCost",
        "finishTime",
        "requirementTimeList",
        "uid",
        "wallet",
        "signStatus"
})
public class AssetRecord {

    /**
     * 总工时
     */
    @JsonProperty("totalTime")
    @JsonPropertyDescription("\u603b\u5de5\u65f6")
    private Double totalTime;
    /**
     * 总费用
     */
    @JsonProperty("totalCost")
    @JsonPropertyDescription("\u603b\u8d39\u7528")
    private Double totalCost;
    /**
     * 完成时间
     */
    @JsonProperty("finishTime")
    @JsonPropertyDescription("\u5b8c\u6210\u65f6\u95f4")
    private String finishTime;
    /**
     * 具体需求耗时
     */
    @JsonProperty("requirementTimeList")
    @JsonPropertyDescription("\u5177\u4f53\u9700\u6c42\u8017\u65f6")
    private List<RequirementTime> requirementTimeList = new ArrayList<RequirementTime>();
    /**
     * uid
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("uid")
    private String uid;
    /**
     * 钱包地址
     */
    @JsonProperty("wallet")
    @JsonPropertyDescription("\u94b1\u5305\u5730\u5740")
    private String wallet;
    /**
     * 签约状态 0未签约，1签约，2待签约
     */
    @JsonProperty("signStatus")
    @JsonPropertyDescription("\u7b7e\u7ea6\u72b6\u6001 0\u672a\u7b7e\u7ea6\uff0c1\u7b7e\u7ea6\uff0c2\u5f85\u7b7e\u7ea6")
    private Double signStatus;

    /**
     * 总工时
     */
    @JsonProperty("totalTime")
    public Double getTotalTime() {
        return totalTime;
    }

    /**
     * 总工时
     */
    @JsonProperty("totalTime")
    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * 总费用
     */
    @JsonProperty("totalCost")
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * 总费用
     */
    @JsonProperty("totalCost")
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 完成时间
     */
    @JsonProperty("finishTime")
    public String getFinishTime() {
        return finishTime;
    }

    /**
     * 完成时间
     */
    @JsonProperty("finishTime")
    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 具体需求耗时
     */
    @JsonProperty("requirementTimeList")
    public List<RequirementTime> getRequirementTimeList() {
        return requirementTimeList;
    }

    /**
     * 具体需求耗时
     */
    @JsonProperty("requirementTimeList")
    public void setRequirementTimeList(List<RequirementTime> requirementTimeList) {
        this.requirementTimeList = requirementTimeList;
    }

    /**
     * uid
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * uid
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 钱包地址
     */
    @JsonProperty("wallet")
    public String getWallet() {
        return wallet;
    }

    /**
     * 钱包地址
     */
    @JsonProperty("wallet")
    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    /**
     * 签约状态 0未签约，1签约，2待签约
     */
    @JsonProperty("signStatus")
    public Double getSignStatus() {
        return signStatus;
    }

    /**
     * 签约状态 0未签约，1签约，2待签约
     */
    @JsonProperty("signStatus")
    public void setSignStatus(Double signStatus) {
        this.signStatus = signStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AssetRecord.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalTime");
        sb.append('=');
        sb.append(((this.totalTime == null) ? "<null>" : this.totalTime));
        sb.append(',');
        sb.append("totalCost");
        sb.append('=');
        sb.append(((this.totalCost == null) ? "<null>" : this.totalCost));
        sb.append(',');
        sb.append("finishTime");
        sb.append('=');
        sb.append(((this.finishTime == null) ? "<null>" : this.finishTime));
        sb.append(',');
        sb.append("requirementTimeList");
        sb.append('=');
        sb.append(((this.requirementTimeList == null) ? "<null>" : this.requirementTimeList));
        sb.append(',');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null) ? "<null>" : this.uid));
        sb.append(',');
        sb.append("wallet");
        sb.append('=');
        sb.append(((this.wallet == null) ? "<null>" : this.wallet));
        sb.append(',');
        sb.append("signStatus");
        sb.append('=');
        sb.append(((this.signStatus == null) ? "<null>" : this.signStatus));
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
        result = ((result * 31) + ((this.uid == null) ? 0 : this.uid.hashCode()));
        result = ((result * 31) + ((this.finishTime == null) ? 0 : this.finishTime.hashCode()));
        result = ((result * 31) + ((this.wallet == null) ? 0 : this.wallet.hashCode()));
        result = ((result * 31) + ((this.requirementTimeList == null) ? 0 : this.requirementTimeList.hashCode()));
        result = ((result * 31) + ((this.totalTime == null) ? 0 : this.totalTime.hashCode()));
        result = ((result * 31) + ((this.signStatus == null) ? 0 : this.signStatus.hashCode()));
        result = ((result * 31) + ((this.totalCost == null) ? 0 : this.totalCost.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetRecord) == false) {
            return false;
        }
        AssetRecord rhs = ((AssetRecord) other);
        return ((((((((this.uid == rhs.uid) || ((this.uid != null) && this.uid.equals(rhs.uid))) && ((this.finishTime == rhs.finishTime) || ((this.finishTime != null) && this.finishTime.equals(rhs.finishTime)))) && ((this.wallet == rhs.wallet) || ((this.wallet != null) && this.wallet.equals(rhs.wallet)))) && ((this.requirementTimeList == rhs.requirementTimeList) || ((this.requirementTimeList != null) && this.requirementTimeList.equals(rhs.requirementTimeList)))) && ((this.totalTime == rhs.totalTime) || ((this.totalTime != null) && this.totalTime.equals(rhs.totalTime)))) && ((this.signStatus == rhs.signStatus) || ((this.signStatus != null) && this.signStatus.equals(rhs.signStatus)))) && ((this.totalCost == rhs.totalCost) || ((this.totalCost != null) && this.totalCost.equals(rhs.totalCost))));
    }

}
