package com.bytesprint.domain.project;

import com.bytesprint.domain.project.model.Attachment;
import com.bytesprint.domain.project.model.Project;
import com.bytesprint.domain.project.model.ProjectSearchCondition;
import com.bytesprint.domain.project.model.Requirement;
import com.bytesprint.domain.project.repository.AttachmentRepository;
import com.bytesprint.domain.project.repository.ProjectRepository;
import com.bytesprint.domain.project.repository.RequirementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * ProjectDomainService
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
@Service
@RequiredArgsConstructor
public class ProjectDomainService {
    private final ProjectRepository projectRepository;
    private final AttachmentRepository attachmentRepository;
    private final RequirementRepository requirementRepository;

    public Project detailSearch(int projectId) {
        Project project = projectRepository.retrieveProject(projectId);

        List<Attachment> attachments = attachmentRepository.retrieveAttachmentList(projectId);
        project.addAttachment(attachments);

        List<Requirement> requirements = requirementRepository.retrieveRequirementList(projectId);
        project.addRequirement(requirements);

        return project;
    }

    public List<Project> simpleListSearch(ProjectSearchCondition condition) {
        if (condition.categoryId() == 0 && condition.statusId() == 0) {
            return projectRepository.searchAllProjectList();
        }

        if (condition.categoryId() > 0) {
            return projectRepository.searchProjectByCategory(condition.categoryId());
        }

        if (condition.statusId() > 0) {
            return projectRepository.searchProjectByStatus(condition.statusId());
        }
        
        return Collections.emptyList();
    }
}
