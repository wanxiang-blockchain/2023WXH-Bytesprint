package com.bytesprint.infrastructure.mysql.pojo;

import lombok.Data;

/**
 * @author Eason Liu
 */
@Data
public class ProjectPojo {
    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * isNullAble:1
     */
    private String no;

    /**
     * isNullAble:1
     */
    private String name;

    /**
     * isNullAble:1
     */
    private String description;

    /**
     * isNullAble:1
     */
    private String contactName;

    /**
     * isNullAble:1
     */
    private String contactPhone;

    /**
     * isNullAble:1
     */
    private String contactEmail;

    /**
     * isNullAble:1
     */
    private String companyCode;

    /**
     * isNullAble:1
     */
    private String status;

    /**
     * isNullAble:1
     */
    private Integer joinMemberCount;

    /**
     * isNullAble:1
     */
    private Integer maxJoinMemberCount;

    /**
     * isNullAble:1
     */
    private Long categoryId;

    /**
     * isNullAble:1
     */
    private java.time.LocalDateTime startTime;

    /**
     * isNullAble:1
     */
    private java.time.LocalDateTime endTime;

    /**
     * isNullAble:1
     */
    private java.time.LocalDateTime createTime;

    /**
     * isNullAble:1
     */
    private java.time.LocalDateTime updateTime;
}
