package com.bfc.web.user.dao;

import com.bfc.web.user.entity.GroupPremissionEntity;

public interface IGroupPremissionDao {
    int deleteByPrimaryKey(Integer groupPerssionId);

    int insert(GroupPremissionEntity record);

    int insertSelective(GroupPremissionEntity record);

    GroupPremissionEntity selectByPrimaryKey(Integer groupPerssionId);

    int updateByPrimaryKeySelective(GroupPremissionEntity record);

    int updateByPrimaryKey(GroupPremissionEntity record);
}