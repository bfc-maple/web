package com.bfc.web.goods.dao;

import com.bfc.web.goods.entity.StoreEntity;
import com.bfc.web.goods.model.StoreParamsModel;

import java.util.List;

public interface IStoreDao {

    List<StoreEntity> selectStores(StoreParamsModel params);

    int deleteByPrimaryKey(Integer storeId);

    int insert(StoreEntity record);

    int insertSelective(StoreEntity record);

    StoreEntity selectByPrimaryKey(Integer storeId);

    int updateByPrimaryKeySelective(StoreEntity record);

    int updateByPrimaryKey(StoreEntity record);
}