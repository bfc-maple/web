package com.bfc.web.user.dao;

import com.bfc.web.user.entity.OperationLogEntity;

public interface IOperationLogDao {
    int deleteByPrimaryKey(Integer logId);

    int insert(OperationLogEntity record);

    int insertSelective(OperationLogEntity record);

    OperationLogEntity selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(OperationLogEntity record);

    int updateByPrimaryKey(OperationLogEntity record);
}