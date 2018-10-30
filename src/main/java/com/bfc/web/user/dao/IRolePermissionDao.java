package com.bfc.web.user.dao;

import com.bfc.web.user.entity.RolePermissionEntity;

public interface IRolePermissionDao {
    int deleteByPrimaryKey(Integer rolePerssionId);

    int insert(RolePermissionEntity record);

    int insertSelective(RolePermissionEntity record);

    RolePermissionEntity selectByPrimaryKey(Integer rolePerssionId);

    int updateByPrimaryKeySelective(RolePermissionEntity record);

    int updateByPrimaryKey(RolePermissionEntity record);
}