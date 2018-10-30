package com.bfc.web.order.controller;

import com.bfc.web.base.model.ResponseModel;
import com.bfc.web.order.model.OrderParams;
import com.bfc.web.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/html/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @GetMapping("/getOrders.do")
    public String getOrders(OrderParams params, HttpServletRequest request, HttpServletResponse response){
        ResponseModel result = orderService.getOrders();
        request.setAttribute("result",result);
        return "/view/order/list";
    }

}
