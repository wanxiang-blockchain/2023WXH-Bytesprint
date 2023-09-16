package com.bytesprint.presentation.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "categoryId",
        "categoryName"
})
public class Category {

    /**
     * 项目类型ID
     */
    @JsonProperty("categoryId")
    @JsonPropertyDescription("\u9879\u76ee\u7c7b\u578bID")
    private Double categoryId;
    /**
     * 项目类型名称
     */
    @JsonProperty("categoryName")
    @JsonPropertyDescription("\u9879\u76ee\u7c7b\u578b\u540d\u79f0")
    private String categoryName;

    /**
     * 项目类型ID
     */
    @JsonProperty("categoryId")
    public Double getCategoryId() {
        return categoryId;
    }

    /**
     * 项目类型ID
     */
    @JsonProperty("categoryId")
    public void setCategoryId(Double categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 项目类型名称
     */
    @JsonProperty("categoryName")
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 项目类型名称
     */
    @JsonProperty("categoryName")
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Category.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("categoryId");
        sb.append('=');
        sb.append(((this.categoryId == null) ? "<null>" : this.categoryId));
        sb.append(',');
        sb.append("categoryName");
        sb.append('=');
        sb.append(((this.categoryName == null) ? "<null>" : this.categoryName));
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
        result = ((result * 31) + ((this.categoryName == null) ? 0 : this.categoryName.hashCode()));
        result = ((result * 31) + ((this.categoryId == null) ? 0 : this.categoryId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Category) == false) {
            return false;
        }
        Category rhs = ((Category) other);
        return (((this.categoryName == rhs.categoryName) || ((this.categoryName != null) && this.categoryName.equals(rhs.categoryName))) && ((this.categoryId == rhs.categoryId) || ((this.categoryId != null) && this.categoryId.equals(rhs.categoryId))));
    }

}
