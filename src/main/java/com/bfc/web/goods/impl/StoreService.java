package com.bfc.web.goods.impl;

import com.alibaba.fastjson.JSON;
import com.bfc.web.goods.dao.IStoreDao;
import com.bfc.web.goods.model.StoreModel;
import com.bfc.web.goods.model.StoreParamsModel;
import com.bfc.web.goods.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("storeService")
public class StoreService implements IStoreService {

    @Autowired
    IStoreDao storeDao;

    public List<StoreModel> getStores(StoreParamsModel params) {
        return JSON.parseArray(JSON.toJSONString(storeDao.selectStores(params)),StoreModel.class);
    }
}
