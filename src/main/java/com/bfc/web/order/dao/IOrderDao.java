package com.bfc.web.order.dao;

import com.bfc.web.order.entity.OrderEntity;

import java.util.List;

public interface IOrderDao {

    List<OrderEntity> selectOrders();

    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    OrderEntity selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderEntity record);

    int updateByPrimaryKey(OrderEntity record);
}