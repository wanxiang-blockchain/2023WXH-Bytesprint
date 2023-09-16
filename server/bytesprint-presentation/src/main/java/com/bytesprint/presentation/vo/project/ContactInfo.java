package com.bytesprint.presentation.vo.project;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 联系人信息
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "contactName",
        "phoneNumber",
        "email"
})
public class ContactInfo {

    @JsonProperty("contactName")
    private String contactName;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;

    @JsonProperty("contactName")
    public String getContactName() {
        return contactName;
    }

    @JsonProperty("contactName")
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContactInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contactName");
        sb.append('=');
        sb.append(((this.contactName == null) ? "<null>" : this.contactName));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null) ? "<null>" : this.phoneNumber));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null) ? "<null>" : this.email));
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
        result = ((result * 31) + ((this.phoneNumber == null) ? 0 : this.phoneNumber.hashCode()));
        result = ((result * 31) + ((this.contactName == null) ? 0 : this.contactName.hashCode()));
        result = ((result * 31) + ((this.email == null) ? 0 : this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactInfo) == false) {
            return false;
        }
        ContactInfo rhs = ((ContactInfo) other);
        return ((((this.phoneNumber == rhs.phoneNumber) || ((this.phoneNumber != null) && this.phoneNumber.equals(rhs.phoneNumber))) && ((this.contactName == rhs.contactName) || ((this.contactName != null) && this.contactName.equals(rhs.contactName)))) && ((this.email == rhs.email) || ((this.email != null) && this.email.equals(rhs.email))));
    }

}
