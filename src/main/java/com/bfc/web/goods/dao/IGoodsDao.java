package com.bfc.web.goods.dao;

import com.bfc.web.goods.entity.GoodsEntity;
import com.bfc.web.goods.model.GoodsParamsModel;

import java.util.List;

public interface IGoodsDao {

    /**
     * 查询商品列表
     * @param params
     * @return
     */
    List<GoodsEntity> selectGoods(GoodsParamsModel params);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(GoodsEntity record);

    int insertSelective(GoodsEntity record);

    GoodsEntity selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(GoodsEntity record);

    int updateByPrimaryKey(GoodsEntity record);
}