package com.bfc.web.goods.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class GoodsDetailsModel implements Serializable {

    private static final long serialVersionUID = 3221836311181863504L;
    private Integer goodsDetailsId;

    private Integer goodsId;

    private String goodsName;

    private Integer isShipping;

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
