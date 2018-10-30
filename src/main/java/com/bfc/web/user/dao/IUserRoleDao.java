package com.bfc.web.user.dao;

import com.bfc.web.user.entity.UserRoleEntity;

public interface IUserRoleDao {
    int deleteByPrimaryKey(Integer userRoleId);

    int insert(UserRoleEntity record);

    int insertSelective(UserRoleEntity record);

    UserRoleEntity selectByPrimaryKey(Integer userRoleId);

    int updateByPrimaryKeySelective(UserRoleEntity record);

    int updateByPrimaryKey(UserRoleEntity record);
}