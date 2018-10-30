package com.bfc.web.goods.model;

import com.bfc.web.base.utils.DateUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GoodsModel implements Serializable {
    private Integer goodsId;

    private Integer storeId;

    private String goodsName;

    private String goodsType;

    private String goodsTitle;

    private BigDecimal goodsPrice;

    private Integer buyCount;

    private String isShipping;

    private String address;

    private String picture;

    private String createTime;

    private String updateTime;

    private String isOnline;

    private String isStock;

    private String del;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public String getIsShipping() {
        return isShipping;
    }

    public void setIsShipping(int isShipping) {
        this.isShipping = isShipping==1?"不包邮":"包邮";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = DateUtils.dateToString(createTime,"");
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = DateUtils.dateToString(updateTime,"");
    }

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(int isOnline) {
        this.isOnline = isOnline==0?"下架":"在售";
    }

    public String getIsStock() {
        return isStock;
    }

    public void setIsStock(int isStock) {
        this.isStock = isStock==0?"售㼦":"有货";
    }

    public String getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del==0?"失效":"有效";
    }
}
