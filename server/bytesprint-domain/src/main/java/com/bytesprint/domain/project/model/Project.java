package com.bytesprint.domain.project.model;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Project
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
@Builder
@Getter
public class Project {
    private long projectId;
    private String projectName;
    private String description;
    private ProjectCategory category;
    private TimeRange timeRange;
    private ProjectStatus status;
    private int joinMemberCount;
    private int maxJoinMemberCount;

    @Builder.Default
    private List<Attachment> attachmentList = new ArrayList<>();
    @Builder.Default
    private List<Requirement> requirementList = new ArrayList<>();

    public void addAttachment(List<Attachment> attachments) {
        attachmentList.addAll(attachments);
    }

    public void addAttachment(Attachment attachment) {
        attachmentList.add(attachment);
    }

    public void addRequirement(List<Requirement> requirements) {
        requirementList.addAll(requirements);
    }

    public void addRequirement(Requirement requirement) {
        requirementList.add(requirement);
    }
}
