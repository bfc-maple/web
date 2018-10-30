package com.bfc.web.goods.entity;

import java.util.Date;

public class GoodsAssessEntity {
    private Integer goodsAssessId;

    private Integer goodsId;

    private String clientName;

    private Double clientLevel;

    private Integer findType;

    private Integer visitedCount;

    private Integer agreeCount;

    private Date createTime;

    private Date updateTime;

    public Integer getGoodsAssessId() {
        return goodsAssessId;
    }

    public void setGoodsAssessId(Integer goodsAssessId) {
        this.goodsAssessId = goodsAssessId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public Double getClientLevel() {
        return clientLevel;
    }

    public void setClientLevel(Double clientLevel) {
        this.clientLevel = clientLevel;
    }

    public Integer getFindType() {
        return findType;
    }

    public void setFindType(Integer findType) {
        this.findType = findType;
    }

    public Integer getVisitedCount() {
        return visitedCount;
    }

    public void setVisitedCount(Integer visitedCount) {
        this.visitedCount = visitedCount;
    }

    public Integer getAgreeCount() {
        return agreeCount;
    }

    public void setAgreeCount(Integer agreeCount) {
        this.agreeCount = agreeCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}