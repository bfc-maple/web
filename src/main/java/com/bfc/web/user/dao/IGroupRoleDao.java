package com.bfc.web.user.dao;

import com.bfc.web.user.entity.GroupRoleEntity;

public interface IGroupRoleDao {
    int deleteByPrimaryKey(Integer groupRoleId);

    int insert(GroupRoleEntity record);

    int insertSelective(GroupRoleEntity record);

    GroupRoleEntity selectByPrimaryKey(Integer groupRoleId);

    int updateByPrimaryKeySelective(GroupRoleEntity record);

    int updateByPrimaryKey(GroupRoleEntity record);
}