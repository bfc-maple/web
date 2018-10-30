package com.bfc.web.goods.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class GoodsDetailsEntity {
    private Integer goodsDetailsId;

    private Integer goodsId;

    private BigDecimal transportMoney;

    private BigDecimal oldPrice;

    private Integer monthSales;

    private Date earlySendTime;

    private Date lastSendTime;

    private Integer goodsBadReturn;

    private Integer realGoods;

    private Integer goodsSevenReturn;

    private Integer fastReturn;

    private String packageType;

    private String goodsBrand;

    private String saleType;


}