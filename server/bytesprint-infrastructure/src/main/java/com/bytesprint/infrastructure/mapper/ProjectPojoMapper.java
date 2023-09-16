package com.bytesprint.infrastructure.mapper;

import com.bytesprint.common.utils.NumberUtils;
import com.bytesprint.domain.project.model.Project;
import com.bytesprint.domain.project.model.ProjectCategory;
import com.bytesprint.domain.project.model.ProjectStatus;
import com.bytesprint.infrastructure.mysql.pojo.ProjectPojo;

/**
 * ProjectPojoMapper
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public class ProjectPojoMapper {
    public static Project convertToProject(ProjectPojo projectPojo) {
        if (projectPojo == null) {
            return null;
        }
        Project project = Project
                .builder()
                .projectId(projectPojo.getId())
                .projectName(projectPojo.getName())
                .description(projectPojo.getDescription())
                .category(new ProjectCategory(Math.toIntExact(projectPojo.getCategoryId()), ""))
                .status(new ProjectStatus(NumberUtils.parseInt(projectPojo.getStatus(), 0), null))
                .build();
        return project;
    }
}
