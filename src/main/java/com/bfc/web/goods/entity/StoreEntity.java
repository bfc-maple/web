package com.bfc.web.goods.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class StoreEntity {
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