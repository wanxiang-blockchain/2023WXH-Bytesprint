package com.bytesprint.infrastructure.repository;

import com.bytesprint.domain.project.model.Attachment;
import com.bytesprint.domain.project.repository.AttachmentRepository;
import com.bytesprint.infrastructure.mysql.mapper.AttachmentMapper;
import com.bytesprint.infrastructure.mysql.pojo.AttachmentPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-11 01:48
 * @Description:
 */
@Repository
@RequiredArgsConstructor
public class AttachmentRepositoryImpl implements AttachmentRepository {
    private final AttachmentMapper attachmentMapper;

    @Override
    public List<Attachment> retrieveAttachmentList(long projectId) {
        AttachmentPojo pojo = new AttachmentPojo();
        pojo.setProjectId(projectId);
        List<AttachmentPojo> attachmentPojos = attachmentMapper.queryAttachment(pojo);
        return convertToAttachmentList(attachmentPojos);
    }

    private List<Attachment> convertToAttachmentList(List<AttachmentPojo> attachmentPojos) {
        // TODO
        return null;
    }
}
