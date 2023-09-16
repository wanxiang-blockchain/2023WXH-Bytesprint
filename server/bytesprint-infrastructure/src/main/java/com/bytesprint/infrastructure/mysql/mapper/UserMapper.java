package com.bytesprint.infrastructure.mysql.mapper;

import com.bytesprint.infrastructure.mysql.pojo.UserPojo;

import java.util.List;

/**
 * @author Eason Liu
 */
public interface UserMapper {

    int insertUser(UserPojo object);

    int updateUser(UserPojo object);

    List<UserPojo> queryUser(UserPojo object);

    UserPojo queryUserLimit1(UserPojo object);

}