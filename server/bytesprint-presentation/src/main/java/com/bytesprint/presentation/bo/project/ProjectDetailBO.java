package com.bytesprint.presentation.bo.project;

import com.bytesprint.presentation.vo.File;
import com.bytesprint.presentation.vo.project.AssetRecord;
import com.bytesprint.presentation.vo.project.DevelopPlan;
import com.bytesprint.presentation.vo.requirement.RequirementVO;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-11 01:36
 * @Description:
 */
@Data
public class ProjectDetailBO {
    private Long id;

    private Integer joinMemberCount;

    private LocalDateTime endTime;

    private LocalDateTime startTime;

    private String description;

    private String categoryName;

    private Integer categoryId;

    private String name;

    private Integer status;

    private Integer maxJoinMemberCount;

    private List<RequirementVO> requirementList;

    private List<AssetRecord> assetRecordList;

    private List<File> fileList;

    private List<DevelopPlan> developPlan;

    // fixme 充血模型 convert方法

}
