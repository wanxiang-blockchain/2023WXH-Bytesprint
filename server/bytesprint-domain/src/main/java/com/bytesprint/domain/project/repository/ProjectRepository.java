package com.bytesprint.domain.project.repository;

import com.bytesprint.domain.project.model.Project;

import java.util.List;

/**
 * ProjectRepository
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public interface ProjectRepository {
    Project retrieveProject(long projectId);

    List<Project> searchProjectList(int categoryId, int statusId);
    List<Project> searchProjectByCategory(int categoryId);
    List<Project> searchProjectByStatus(int statusId);

    List<Project> searchAllProjectList();
}
