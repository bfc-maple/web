package com.bfc.web.goods.service;

import com.bfc.web.goods.model.StoreModel;
import com.bfc.web.goods.model.StoreParamsModel;

import java.util.List;

public interface IStoreService {

    List<StoreModel> getStores(StoreParamsModel params);

}
