package com.bytesprint.infrastructure.mysql.mapper;

import com.bytesprint.infrastructure.mysql.pojo.ProjectCategoryPojo;

import java.util.List;

/**
 * @author Eason Liu
 */
public interface ProjectCategoryMapper {
    List<ProjectCategoryPojo> queryAll();
}