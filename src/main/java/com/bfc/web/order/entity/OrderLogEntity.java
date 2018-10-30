package com.bfc.web.order.entity;

import java.util.Date;

public class OrderLogEntity {
    private Integer orderLogId;

    private String orderCode;

    private String orderLocation;

    private String orderOperation;

    private Date createTime;

    public Integer getOrderLogId() {
        return orderLogId;
    }

    public void setOrderLogId(Integer orderLogId) {
        this.orderLogId = orderLogId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation == null ? null : orderLocation.trim();
    }

    public String getOrderOperation() {
        return orderOperation;
    }

    public void setOrderOperation(String orderOperation) {
        this.orderOperation = orderOperation == null ? null : orderOperation.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}