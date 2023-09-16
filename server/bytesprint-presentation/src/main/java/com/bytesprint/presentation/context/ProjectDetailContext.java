package com.bytesprint.presentation.context;

import com.bytesprint.presentation.bo.project.ProjectDetailBO;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-11 01:22
 * @Description:
 */

@Data
@Builder
public class ProjectDetailContext {

    private int projectId;

    private int code;
    private String message;

    private ProjectDetailBO projectDetailBo;
}
