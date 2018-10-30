package com.bfc.web.order.dao;

import com.bfc.web.order.entity.OrderLogEntity;

public interface IOrderLogDao {
    int deleteByPrimaryKey(Integer orderLogId);

    int insert(OrderLogEntity record);

    int insertSelective(OrderLogEntity record);

    OrderLogEntity selectByPrimaryKey(Integer orderLogId);

    int updateByPrimaryKeySelective(OrderLogEntity record);

    int updateByPrimaryKey(OrderLogEntity record);
}