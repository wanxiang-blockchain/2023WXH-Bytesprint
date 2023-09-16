package com.bytesprint.domain.project.model;

import lombok.Builder;
import lombok.Getter;

/**
 * Attachment
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
@Builder
@Getter
public class Attachment {
    private long attachmentId;
    private String attachmentName;
    /**
     * 文件类型
     */
    private String attachmentType;
    /**
     * 文件链接
     */
    private String attachmentUrl;
}
