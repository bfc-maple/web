package com.bfc.web.user.dao;

import com.bfc.web.user.entity.PermissionEntity;

public interface IPermissionDao {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    PermissionEntity selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);
}