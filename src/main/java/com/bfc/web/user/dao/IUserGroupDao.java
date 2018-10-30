package com.bfc.web.user.dao;

import com.bfc.web.user.entity.UserGroupEntity;

public interface IUserGroupDao {
    int deleteByPrimaryKey(Integer userGroupId);

    int insert(UserGroupEntity record);

    int insertSelective(UserGroupEntity record);

    UserGroupEntity selectByPrimaryKey(Integer userGroupId);

    int updateByPrimaryKeySelective(UserGroupEntity record);

    int updateByPrimaryKey(UserGroupEntity record);
}