package com.bfc.web.user.dao;

import com.bfc.web.user.entity.GroupEntity;

public interface IGroupDao {
    int deleteByPrimaryKey(Integer groupId);

    int insert(GroupEntity record);

    int insertSelective(GroupEntity record);

    GroupEntity selectByPrimaryKey(Integer groupId);

    int updateByPrimaryKeySelective(GroupEntity record);

    int updateByPrimaryKey(GroupEntity record);
}