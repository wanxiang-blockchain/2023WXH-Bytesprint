package com.bytesprint.infrastructure.repository;

import com.bytesprint.common.utils.CollectionUtils;
import com.bytesprint.domain.project.model.Requirement;
import com.bytesprint.domain.project.repository.RequirementRepository;
import com.bytesprint.infrastructure.mapper.RequirementPojoMapper;
import com.bytesprint.infrastructure.mysql.mapper.RequirementMapper;
import com.bytesprint.infrastructure.mysql.pojo.RequirementPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-11 01:48
 * @Description:
 */
@Repository
@RequiredArgsConstructor
public class RequirementRepositoryImpl implements RequirementRepository {

    private final RequirementMapper requirementMapper;

    @Override
    public List<Requirement> retrieveRequirementList(long projectId) {
        RequirementPojo pojo = new RequirementPojo();
        pojo.setProjectId(projectId);
        List<RequirementPojo> requirementPojos = requirementMapper.queryRequirement(pojo);
        return CollectionUtils.emptyIfNull(requirementPojos).stream().map(RequirementPojoMapper::convert).toList();
    }
}
