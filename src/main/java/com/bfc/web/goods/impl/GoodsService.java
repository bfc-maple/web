package com.bfc.web.goods.impl;

import com.alibaba.fastjson.JSON;
import com.bfc.web.base.utils.DateUtils;
import com.bfc.web.goods.dao.IGoodsDao;
import com.bfc.web.goods.dao.IGoodsDetailsDao;
import com.bfc.web.goods.entity.GoodsDetailsEntity;
import com.bfc.web.goods.entity.GoodsEntity;
import com.bfc.web.goods.model.GoodsDetailsModel;
import com.bfc.web.goods.model.GoodsModel;
import com.bfc.web.goods.model.GoodsParamsModel;
import com.bfc.web.goods.service.IGoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service("goodsService")
public class GoodsService implements IGoodsService {

    @Autowired
    IGoodsDao goodsDao;

    @Autowired
    IGoodsDetailsDao goodsDetailsDao;


    @Override
    public GoodsDetailsModel getDetails(int goodsId) {
        GoodsDetailsModel detail = null;
        GoodsEntity goods = goodsDao.selectByPrimaryKey(goodsId);
        GoodsDetailsEntity entity = goodsDetailsDao.selectByGoodsId(goodsId);
        if (entity == null) detail = new GoodsDetailsModel();
        else detail = JSON.parseObject(JSON.toJSONString(entity), GoodsDetailsModel.class);
        detail.setGoodsName(goods.getGoodsName());
        detail.setIsShipping(goods.getIsShipping());
        detail.setGoodsId(goods.getGoodsId());
        return detail;
    }

    @Override
    public int addOrUpdate(GoodsModel goodsModel) throws ParseException {

        GoodsEntity goods = modelToEntity(goodsModel);
        if (goods == null)
            return 0;

        if (goods.getGoodsId() != null) {
            goods.setUpdateTime(new Date());
            return goodsDao.updateByPrimaryKeySelective(goods);
        } else {
            goods.setCreateTime(new Date());
            return goodsDao.insertSelective(goods);
        }
    }

    private GoodsEntity modelToEntity(GoodsModel goodsModel) throws ParseException {
        if (goodsModel == null)
            return null;
        GoodsEntity entity = new GoodsEntity();
        entity.setCreateTime(DateUtils.stringToDate(goodsModel.getCreateTime(), null));
        entity.setUpdateTime(DateUtils.stringToDate(goodsModel.getUpdateTime(), null));
        entity.setAddress(goodsModel.getAddress());
        entity.setBuyCount(goodsModel.getBuyCount());
        entity.setGoodsId(goodsModel.getGoodsId());
        entity.setGoodsName(goodsModel.getGoodsName());
        entity.setGoodsPrice(goodsModel.getGoodsPrice());
        entity.setGoodsTitle(goodsModel.getGoodsTitle());
        entity.setGoodsType(goodsModel.getGoodsType());
        entity.setPicture(goodsModel.getPicture());
        entity.setStoreId(goodsModel.getStoreId());

        if (StringUtils.isNotBlank(goodsModel.getIsShipping()))
            if ("包邮".equals(goodsModel.getIsShipping()))
                entity.setIsShipping(0);
            else if ("不包邮".equals(goodsModel.getIsShipping()))
                entity.setIsShipping(1);
        if (StringUtils.isNotBlank(goodsModel.getIsOnline()))
            if ("下架".equals(goodsModel.getIsOnline()))
                entity.setIsOnline(0);
            else if ("在售".equals(goodsModel.getIsOnline()))
                entity.setIsOnline(1);
        if (StringUtils.isNotBlank(goodsModel.getIsStock()))
            if ("售㼦".equals(goodsModel.getIsStock()))
                entity.setIsStock(0);
            else if ("有货".equals(goodsModel.getIsStock()))
                entity.setIsStock(1);
        if (StringUtils.isNotBlank(goodsModel.getDel()))
            if ("失效".equals(goodsModel.getDel()))
                entity.setDel(0);
            else if ("有效".equals(goodsModel.getDel()))
                entity.setDel(1);
        return entity;
    }

    @Override
    public GoodsModel getGoodsByGoodsId(int goodsId) {
        GoodsEntity entity = goodsDao.selectByPrimaryKey(goodsId);
        return JSON.parseObject(JSON.toJSONString(entity), GoodsModel.class);
    }

    @Override
    public List<GoodsModel> getGoods(GoodsParamsModel params) {
        List<GoodsEntity> entitys = goodsDao.selectGoods(params);
        List<GoodsModel> models = JSON.parseArray(JSON.toJSONString(entitys), GoodsModel.class);
        return models;
    }


}
