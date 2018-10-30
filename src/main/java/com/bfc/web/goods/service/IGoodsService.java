package com.bfc.web.goods.service;

import com.bfc.web.goods.model.GoodsDetailsModel;
import com.bfc.web.goods.model.GoodsModel;
import com.bfc.web.goods.model.GoodsParamsModel;

import java.text.ParseException;
import java.util.List;

public interface IGoodsService {

    GoodsDetailsModel getDetails(int goodsId);


    int addOrUpdate(GoodsModel goodsModel) throws ParseException;

    GoodsModel getGoodsByGoodsId(int goodsId);

    List<GoodsModel> getGoods(GoodsParamsModel params);

}
