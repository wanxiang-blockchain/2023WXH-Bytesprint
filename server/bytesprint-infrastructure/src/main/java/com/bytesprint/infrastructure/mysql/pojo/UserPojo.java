package com.bytesprint.infrastructure.mysql.pojo;

import lombok.Data;

/**
 * @author Eason Liu
 */
@Data
public class UserPojo {

    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * isNullAble:0
     */
    private String userId;

    /**
     * 1=运营商，2=开发人员
     * isNullAble:1
     */
    private String userType;

    /**
     * isNullAble:1
     */
    private String walletAddress;
}
