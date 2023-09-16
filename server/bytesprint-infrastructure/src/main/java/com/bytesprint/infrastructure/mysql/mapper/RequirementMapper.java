package com.bytesprint.infrastructure.mysql.mapper;

import com.bytesprint.infrastructure.mysql.pojo.RequirementPojo;

import java.util.List;

/**
 * @author Eason Liu
 */
public interface RequirementMapper {

    int insertRequirement(RequirementPojo object);

    int updateRequirement(RequirementPojo object);

    List<RequirementPojo> queryRequirement(RequirementPojo object);

    RequirementPojo queryRequirementLimit1(RequirementPojo object);

}