package com.bytesprint.infrastructure.mysql.pojo;

import lombok.Data;

/**
 * @author Eason Liu
 */
@Data
public class PlanPojo {
    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * isNullAble:0
     */
    private String uid;

    /**
     * isNullAble:0
     */
    private Long requirementId;

    /**
     * isNullAble:1
     */
    private Integer requirementTime;

    /**
     * isNullAble:1
     */
    private String requirementStatus;

    /**
     * isNullAble:1
     */
    private java.time.LocalDateTime startTime;

    /**
     * isNullAble:1
     */
    private java.time.LocalDateTime expectedFinishTime;

    /**
     * isNullAble:1
     */
    private java.time.LocalDateTime actualFinishTime;
}
