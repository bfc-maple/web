package com.bfc.web.order.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderParams implements Serializable {

    private String orderCode;
}
