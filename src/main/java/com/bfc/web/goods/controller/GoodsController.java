package com.bfc.web.goods.controller;

import com.bfc.web.base.model.ResponseModel;
import com.bfc.web.common.IPubConstantDefine;
import com.bfc.web.goods.model.GoodsDetailsModel;
import com.bfc.web.goods.model.GoodsModel;
import com.bfc.web.goods.model.GoodsParamsModel;
import com.bfc.web.goods.service.IGoodsDetailsService;
import com.bfc.web.goods.service.IGoodsService;
import com.bfc.web.goods.service.IStoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/html/goods")
@Slf4j
public class GoodsController {

    @Autowired
    IGoodsService goodsService;

    @Autowired
    IStoreService storeService;

    @Autowired
    IGoodsDetailsService goodsDetailsService;

    @GetMapping("/getGoods.do")
    public String getGoods(GoodsParamsModel params, HttpServletRequest request, HttpServletResponse response) {
//        log.info("getGoods input params : {},userinformation : {}", JSON.toJSONString(params), JSON.toJSONString(request.getSession().getAttribute("user")));
        ResponseModel result = new ResponseModel();
        try {
            List<GoodsModel> models = goodsService.getGoods(params);
            if (models == null || models.isEmpty())
                result.message(IPubConstantDefine.IBaseConstantDefine.CODE_404, IPubConstantDefine.IBaseConstantDefine.MSG_404);
            else
                result.success(models);
        } catch (Exception e) {
   //         log.error("getGoods has exception : {}", e.getMessage());
            result.message(IPubConstantDefine.IBaseConstantDefine.CONNECT_CODE, IPubConstantDefine.IBaseConstantDefine.CONNECT_MSG);
        }
        request.setAttribute("result", result);
        return "view/goods/list";
    }

    @GetMapping("/edit.do")
    public String edit(Integer goodsId, HttpServletRequest request, HttpServletResponse response) {
        if (0 != goodsId) {
            GoodsModel goods = goodsService.getGoodsByGoodsId(goodsId);
            request.setAttribute("goods", goods);
        }
        request.setAttribute("stores", storeService.getStores(null));
        return "view/goods/edit";
    }

    @PostMapping("/addOrUpdate.do")
    public String addOrUpdate(GoodsModel goods, HttpServletResponse response, HttpServletRequest request) {
   //     log.info("addOrUpdate controller input params : {}", JSON.toJSONString(goods));
        ResponseModel result = new ResponseModel();
        try {
            int i = goodsService.addOrUpdate(goods);
            if (i < 1)
                result.message(IPubConstantDefine.IBaseConstantDefine.CODE_400, IPubConstantDefine.IBaseConstantDefine.MSG_400);
            else
                result.message(IPubConstantDefine.IBaseConstantDefine.CODE_200, IPubConstantDefine.IBaseConstantDefine.MSG_200);
        } catch (Exception e) {
  //          log.error("addOrUpdate method exception : {}", e.getMessage());
            result.message(IPubConstantDefine.IBaseConstantDefine.CONNECT_CODE, IPubConstantDefine.IBaseConstantDefine.CONNECT_MSG);
        }
        request.setAttribute("result", result);
        return "redirect:/html/goods/getGoods.do";
    }

    @GetMapping("/delete.do")
    public String delete(int goodsId, HttpServletRequest request, HttpServletResponse response) {
        GoodsModel params = new GoodsModel();
        params.setGoodsId(goodsId);
        params.setDel(0);
        return addOrUpdate(params, response, request);
    }

    @GetMapping("/detailsPage.do")
    public String detailsPage(int goodsId, HttpServletRequest request, HttpServletResponse response) {
        try {
            GoodsDetailsModel details = goodsService.getDetails(goodsId);
            request.setAttribute("details", details);
        } catch (Exception e) {
   //         log.error("detailsPage has exception : {}", e.getMessage());
        }
        return "view/goods/details";
    }

    @PostMapping("/details.do")
    public String details(GoodsDetailsModel detail,HttpServletRequest request,HttpServletResponse response) {
        ResponseModel result=new ResponseModel();
        try {
            int i = goodsDetailsService.addOrUpdate(detail);
            if (i<1) result.message(IPubConstantDefine.IBaseConstantDefine.CODE_400, IPubConstantDefine.IBaseConstantDefine.MSG_400);
            else result.message(IPubConstantDefine.IBaseConstantDefine.CODE_200, IPubConstantDefine.IBaseConstantDefine.MSG_200);
        } catch (Exception e) {
    //        log.error("details has exception : {}", e.getMessage());
            result.message(IPubConstantDefine.IBaseConstantDefine.CONNECT_CODE, IPubConstantDefine.IBaseConstantDefine.CONNECT_MSG);
            return "";
        }
        request.setAttribute("result",result);
        return "redirect:/html/goods/getGoods.do";
    }
}
