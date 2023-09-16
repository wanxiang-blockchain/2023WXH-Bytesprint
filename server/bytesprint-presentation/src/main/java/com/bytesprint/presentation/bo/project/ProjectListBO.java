package com.bytesprint.presentation.bo.project;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-11 00:55
 * @Description:
 */
@Data
public class ProjectListBO {
    /**
     * 项目id
     */
    private Long id;

    private Integer joinMemberCount;

    private LocalDateTime endTime;

    private LocalDateTime startTime;

    private String description;

    private String categoryName;

    private Integer categoryId;

    private String name;

    private Integer status;

    private Integer maxJoinMemberCount;
}
