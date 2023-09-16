package com.bytesprint.application.service;

import com.bytesprint.domain.project.ProjectDomainService;
import com.bytesprint.domain.project.model.Project;
import com.bytesprint.domain.project.model.ProjectSearchCondition;
import com.bytesprint.presentation.mapper.ProjectVoMapper;
import com.bytesprint.presentation.vo.Result;
import com.bytesprint.presentation.vo.project.list.ProjectListResponseSchema;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-10 19:50
 * @Description:
 */
@Service
@RequiredArgsConstructor
public class ProjectListService {
    private final ProjectDomainService projectDomainService;

    public ProjectListResponseSchema process(int categoryId, int statusId) {
        if (categoryId < 0 && statusId < 0) {
            return buildResponse(1, "validate fail", null);
        }

        ProjectSearchCondition condition = new ProjectSearchCondition(categoryId, statusId);
        List<Project> projects = projectDomainService.simpleListSearch(condition);

        return buildResponse(0, "success", projects);
    }

    private ProjectListResponseSchema buildResponse(int code, String message, List<Project> projectListBo) {

        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);

        ProjectListResponseSchema responseSchema = new ProjectListResponseSchema();
        responseSchema.setResult(result);
        responseSchema.setProjectList(new ArrayList<>());

        if (projectListBo != null) {
            projectListBo.forEach(project -> responseSchema.getProjectList().add(ProjectVoMapper.convert(project)));
        }

        return responseSchema;
    }
}
