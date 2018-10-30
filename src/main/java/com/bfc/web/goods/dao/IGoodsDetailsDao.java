package com.bfc.web.goods.dao;

import com.bfc.web.goods.entity.GoodsDetailsEntity;

public interface IGoodsDetailsDao {

    /**
     * 根据商品Id查询商品详情
     * @param goodsId
     * @return
     */
    GoodsDetailsEntity selectByGoodsId(int goodsId);

    int deleteByPrimaryKey(Integer goodsDetailsId);

    int insert(GoodsDetailsEntity record);

    int insertSelective(GoodsDetailsEntity record);

    GoodsDetailsEntity selectByPrimaryKey(Integer goodsDetailsId);

    int updateByPrimaryKeySelective(GoodsDetailsEntity record);

    int updateByPrimaryKey(GoodsDetailsEntity record);
}