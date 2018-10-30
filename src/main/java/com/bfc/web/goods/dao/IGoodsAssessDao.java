package com.bfc.web.goods.dao;

import com.bfc.web.goods.entity.GoodsAssessEntity;
import com.bfc.web.goods.entity.GoodsAssessWithBLOBsEntity;

public interface IGoodsAssessDao {

    int deleteByPrimaryKey(Integer goodsAssessId);

    int insert(GoodsAssessWithBLOBsEntity record);

    int insertSelective(GoodsAssessWithBLOBsEntity record);

    GoodsAssessWithBLOBsEntity selectByPrimaryKey(Integer goodsAssessId);

    int updateByPrimaryKeySelective(GoodsAssessWithBLOBsEntity record);

    int updateByPrimaryKeyWithBLOBs(GoodsAssessWithBLOBsEntity record);

    int updateByPrimaryKey(GoodsAssessEntity record);
}