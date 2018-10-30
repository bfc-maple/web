package com.bfc.web.goods.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class StoreModel implements Serializable {
    private Integer storeId;

    private String storeName;

    private String storeCode;

    private String favoritePercentage;

    private String storeOfPersonNickname;

    private String phone;

    private BigDecimal storeAssureMoney;

    private Date createTime;

    private Date updateTime;

    private Double storeLevel;

    private String businessPicture;

    private Integer del;
}
