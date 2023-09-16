package com.bytesprint.presentation.vo.project.participate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 返回结果
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "message"
})
public class ProjectParticipateResponseSchema {

    /**
     * 返回状态码
     * <p>
     *  0=成功，其他=失败
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("0=\u6210\u529f\uff0c\u5176\u4ed6=\u5931\u8d25")
    private Double code;
    /**
     * 返回状态信息
     * <p>
     * 
     * 
     */
    @JsonProperty("message")
    private String message;

    /**
     * 返回状态码
     * <p>
     *  0=成功，其他=失败
     * 
     */
    @JsonProperty("code")
    public Double getCode() {
        return code;
    }

    /**
     * 返回状态码
     * <p>
     *  0=成功，其他=失败
     * 
     */
    @JsonProperty("code")
    public void setCode(Double code) {
        this.code = code;
    }

    /**
     * 返回状态信息
     * <p>
     * 
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 返回状态信息
     * <p>
     * 
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectParticipateResponseSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectParticipateResponseSchema) == false) {
            return false;
        }
        ProjectParticipateResponseSchema rhs = ((ProjectParticipateResponseSchema) other);
        return (((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))));
    }

}
