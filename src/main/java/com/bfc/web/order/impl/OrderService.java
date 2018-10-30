package com.bfc.web.order.impl;

import com.alibaba.fastjson.JSON;
import com.bfc.web.base.model.PageModel;
import com.bfc.web.base.model.ResponseModel;
import com.bfc.web.common.IPubConstantDefine;
import com.bfc.web.order.dao.IOrderDao;
import com.bfc.web.order.entity.OrderEntity;
import com.bfc.web.order.model.OrderModel;
import com.bfc.web.order.service.IOrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Lists;
import org.thymeleaf.util.ListUtils;

import java.util.ArrayList;
import java.util.List;

@Service("orderService")
public class OrderService implements IOrderService {

    @Autowired
    IOrderDao orderDao;

    public ResponseModel getOrders() {
        ResponseModel result = new ResponseModel();
        Page<Object> page = PageHelper.startPage(1, 10);
        List<OrderEntity> orders = orderDao.selectOrders();
        if (orders == null || orders.size() < 1) {
            result.message(IPubConstantDefine.IBaseConstantDefine.CODE_404, IPubConstantDefine.IBaseConstantDefine.MSG_404);
            return result;
        }
        List<OrderModel> models = JSON.parseArray(JSON.toJSONString(orders), OrderModel.class);
        if (ListUtils.isEmpty(models)){
            result.message(IPubConstantDefine.IBaseConstantDefine.CODE_404, IPubConstantDefine.IBaseConstantDefine.MSG_404);
            return result;
        }
        result.success(models);
        return result;
    }
}
