package com.bfc.web.user.dao;

import com.bfc.web.user.entity.UserPermissionEntity;

public interface IUserPermissionDao {
    int deleteByPrimaryKey(Integer userPermissionId);

    int insert(UserPermissionEntity record);

    int insertSelective(UserPermissionEntity record);

    UserPermissionEntity selectByPrimaryKey(Integer userPermissionId);

    int updateByPrimaryKeySelective(UserPermissionEntity record);

    int updateByPrimaryKey(UserPermissionEntity record);
}