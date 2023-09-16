package com.bytesprint.infrastructure.mysql.pojo;

import lombok.Data;

/**
 * @author Eason Liu
 */
@Data
public class RequirementPojo {
    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * isNullAble:0
     */
    private Long projectId;

    /**
     * isNullAble:1
     */
    private String name;

    /**
     * isNullAble:1
     */
    private String description;
}
