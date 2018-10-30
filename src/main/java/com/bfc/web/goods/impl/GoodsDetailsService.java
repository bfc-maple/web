package com.bfc.web.goods.impl;

import com.alibaba.fastjson.JSON;
import com.bfc.web.goods.dao.IGoodsDetailsDao;
import com.bfc.web.goods.entity.GoodsDetailsEntity;
import com.bfc.web.goods.model.GoodsDetailsModel;
import com.bfc.web.goods.service.IGoodsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("goodsDetailsService")
public class GoodsDetailsService implements IGoodsDetailsService {

    @Autowired
    IGoodsDetailsDao goodsDetailsDao;

    @Override
    public int addOrUpdate(GoodsDetailsModel params) {
        if (params == null)
            return 0;
        GoodsDetailsEntity detail = JSON.parseObject(JSON.toJSONString(params), GoodsDetailsEntity.class);
        if (detail.getTransportMoney()==null) detail.setTransportMoney(BigDecimal.ZERO);
        if (detail.getMonthSales()==null) detail.setMonthSales(0);

        if (null==detail.getGoodsDetailsId())
            return goodsDetailsDao.insertSelective(detail);
        else return goodsDetailsDao.updateByPrimaryKeySelective(detail);
    }
}
