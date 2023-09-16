package com.bytesprint.infrastructure.repository;

import com.bytesprint.domain.project.model.Project;
import com.bytesprint.domain.project.repository.ProjectRepository;
import com.bytesprint.infrastructure.mapper.ProjectPojoMapper;
import com.bytesprint.infrastructure.mysql.mapper.ProjectMapper;
import com.bytesprint.infrastructure.mysql.pojo.ProjectPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-11 00:34
 * @Description:
 */
@Repository
@RequiredArgsConstructor
public class ProjectRepositoryImpl implements ProjectRepository {
    private final ProjectMapper projectDao;

    @Override
    public Project retrieveProject(long projectId) {
        ProjectPojo pojo = new ProjectPojo();
        pojo.setId(projectId);
        ProjectPojo projectPojo = projectDao.queryProjectLimit1(pojo);
        return ProjectPojoMapper.convertToProject(projectPojo);
    }

    @Override
    public List<Project> searchProjectList(int categoryId, int statusId) {
        return null;
    }

    @Override
    public List<Project> searchProjectByCategory(int categoryId) {
        return null;
    }
    @Override
    public List<Project> searchProjectByStatus(int statusId) {
        return null;
    }
    @Override
    public List<Project> searchAllProjectList() {
        return null;
    }
}
