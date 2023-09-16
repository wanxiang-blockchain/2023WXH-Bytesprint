package com.bytesprint.infrastructure.mysql.mapper;

import com.bytesprint.infrastructure.mysql.pojo.ProjectPojo;

import java.util.List;

/**
 * @author Eason Liu
 */
public interface ProjectMapper {

    int insertProject(ProjectPojo object);

    int updateProject(ProjectPojo object);

    List<ProjectPojo> queryProject(ProjectPojo object);

    ProjectPojo queryProjectLimit1(ProjectPojo object);

}