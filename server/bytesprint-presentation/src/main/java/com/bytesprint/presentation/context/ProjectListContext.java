package com.bytesprint.presentation.context;

import com.bytesprint.presentation.bo.project.ProjectListBO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-11 00:02
 * @Description:
 */
@Data
@Builder
public class ProjectListContext {
   private int categoryId;
   private int statusId;

   private int code;
   private String message;

   private List<ProjectListBO> projectListBo;
}
