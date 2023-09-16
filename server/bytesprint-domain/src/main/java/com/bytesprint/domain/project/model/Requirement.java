package com.bytesprint.domain.project.model;

import lombok.Builder;
import lombok.Getter;

/**
 * Requirement
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
@Getter
@Builder
public class Requirement {
    private long requirementId;
    /**
     * 需求名称
     *
     */
    private String requirementName;
    /**
     * 需求描述
     *
     */
    private String requirementDescription;
}
