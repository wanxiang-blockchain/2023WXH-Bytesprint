package com.bytesprint.infrastructure.mysql.mapper;

import com.bytesprint.infrastructure.mysql.pojo.DeveloperPojo;

import java.util.List;

/**
 * @author Eason Liu
 */
public interface DeveloperMapper {

    int insertDeveloper(DeveloperPojo object);

    int updateDeveloper(DeveloperPojo object);

    List<DeveloperPojo> queryDeveloper(DeveloperPojo object);

    DeveloperPojo queryDeveloperLimit1(DeveloperPojo object);

}