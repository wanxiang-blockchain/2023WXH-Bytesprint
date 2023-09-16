package com.bytesprint.domain.project.repository;

import com.bytesprint.domain.project.model.Attachment;

import java.util.List;

/**
 * AttachmentRepository
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public interface AttachmentRepository {
    List<Attachment> retrieveAttachmentList(long projectId);
}
