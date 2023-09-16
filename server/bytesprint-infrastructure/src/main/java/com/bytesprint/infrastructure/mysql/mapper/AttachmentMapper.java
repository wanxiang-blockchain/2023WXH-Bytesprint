package com.bytesprint.infrastructure.mysql.mapper;

import com.bytesprint.infrastructure.mysql.pojo.AttachmentPojo;

import java.util.List;

/**
 * @author Eason Liu
 */
public interface AttachmentMapper {

    int insertAttachment(AttachmentPojo object);

    int updateAttachment(AttachmentPojo object);

    List<AttachmentPojo> queryAttachment(AttachmentPojo object);

    AttachmentPojo queryAttachmentLimit1(AttachmentPojo object);

}