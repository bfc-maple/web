package com.bfc.web.user.dao;

import com.bfc.web.user.entity.OrganizationEntity;

public interface IOrganizationDao {
    int deleteByPrimaryKey(Integer orgId);

    int insert(OrganizationEntity record);

    int insertSelective(OrganizationEntity record);

    OrganizationEntity selectByPrimaryKey(Integer orgId);

    int updateByPrimaryKeySelective(OrganizationEntity record);

    int updateByPrimaryKey(OrganizationEntity record);
}