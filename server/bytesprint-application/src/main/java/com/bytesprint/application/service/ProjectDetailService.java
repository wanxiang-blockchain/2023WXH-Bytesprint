package com.bytesprint.application.service;

import com.bytesprint.domain.project.ProjectDomainService;
import com.bytesprint.domain.project.model.Project;
import com.bytesprint.presentation.mapper.ProjectVoMapper;
import com.bytesprint.presentation.vo.Result;
import com.bytesprint.presentation.vo.project.ProjectVO;
import com.bytesprint.presentation.vo.project.detail.ProjectDetailResponseSchema;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-11 01:20
 * @Description:
 */
@Service
@AllArgsConstructor
public class ProjectDetailService {
    private final ProjectDomainService projectDomainService;

    public ProjectDetailResponseSchema process(int projectId) {
        if (projectId <= 0) {
            return buildResponse(1, "validate fail", null);
        }

        Project project = projectDomainService.detailSearch(projectId);

        return buildResponse(0, "success", project);
    }

    private ProjectDetailResponseSchema buildResponse(int code, String message, Project project) {

        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);

        ProjectVO projectVO = ProjectVoMapper.convert(project);

        ProjectDetailResponseSchema responseSchema = new ProjectDetailResponseSchema();
        responseSchema.setResult(result);
        responseSchema.setProject(projectVO);

        return responseSchema;

    }
}
