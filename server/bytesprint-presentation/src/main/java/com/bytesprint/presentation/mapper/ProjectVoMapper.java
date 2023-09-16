package com.bytesprint.presentation.mapper;

import com.bytesprint.domain.project.model.Attachment;
import com.bytesprint.domain.project.model.Project;
import com.bytesprint.domain.project.model.Requirement;
import com.bytesprint.presentation.vo.File;
import com.bytesprint.presentation.vo.project.ProjectVO;
import com.bytesprint.presentation.vo.requirement.RequirementVO;
import com.bytesprint.common.utils.DateTimeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectMapper
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public class ProjectVoMapper {
    public static ProjectVO convert(Project projectBO) {
        ProjectVO projectVO = new ProjectVO();

        projectVO.setId(projectBO.getProjectId());
        projectVO.setName(projectBO.getProjectName());
        projectVO.setStatus(projectBO.getStatus().status());
        projectVO.setStartTime(DateTimeUtils.standardFormat(projectBO.getTimeRange().startTime()));
        projectVO.setEndTime(DateTimeUtils.standardFormat(projectBO.getTimeRange().endTime()));
        projectVO.setDescription(projectBO.getDescription());
        projectVO.setCategoryId(projectBO.getCategory().categoryId());
        projectVO.setCategoryName(projectBO.getCategory().categoryName());
        projectVO.setJoinMemberCount(projectBO.getJoinMemberCount());
        projectVO.setMaxJoinMemberCount(projectBO.getMaxJoinMemberCount());
        /* TODO: projectVO.setAssetRecordList(projectBO.getAssetRecordList());*/
        projectVO.setRequirementList(convertRequirement(projectBO.getRequirementList()));
        projectVO.setFileList(convertAttachment(projectBO.getAttachmentList()));
        projectVO.setDevelopPlan(projectVO.getDevelopPlan());
        return projectVO;
    }

    private static List<File> convertAttachment(List<Attachment> attachmentList) {
        List<File> fileList = null;
        if (attachmentList != null) {
            fileList = new ArrayList<>();
            for (Attachment attachment : attachmentList) {
                File file = new File();
                file.setFileName(attachment.getAttachmentName());
                file.setFileType(attachment.getAttachmentType());
                file.setFileUrl(attachment.getAttachmentUrl());
                fileList.add(file);
            }
        }
        return fileList;
    }

    private static List<RequirementVO> convertRequirement(List<Requirement> requirementList) {
        List<RequirementVO> requirementVOList = null;
        if (requirementList != null) {
            requirementVOList = new ArrayList<>();
            for (Requirement requirement : requirementList) {
                RequirementVO requirementVO = new RequirementVO();
                requirementVO.setRequirementId((double) requirement.getRequirementId());
                requirementVO.setRequirementName(requirement.getRequirementName());
                requirementVO.setRequirementDescription(requirement.getRequirementDescription());
                requirementVOList.add(requirementVO);
            }
        }
        return requirementVOList;
    }
}
