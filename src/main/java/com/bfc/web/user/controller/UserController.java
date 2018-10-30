package com.bfc.web.user.controller;

import com.alibaba.fastjson.JSON;
import com.bfc.web.base.model.ResponseModel;
import com.bfc.web.base.redis.RedisUtils;
import com.bfc.web.common.IPubConstantDefine;
import com.bfc.web.user.model.UserModel;
import com.bfc.web.user.model.UserParamsModel;
import com.bfc.web.user.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/html/user")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/login.do")
    public String login(@ModelAttribute("user") UserParamsModel user, HttpServletRequest request, HttpServletResponse response) {


        if (user != null && !StringUtils.isBlank(user.getPassword()) && !StringUtils.isBlank(user.getUserName())) {
            UserModel userModel = userService.verifyUser(user);
            if (null != userModel) {
                if (StringUtils.isNotBlank(userModel.getPassword()) && user.getPassword().equals(userModel.getPassword())) {
                    request.getSession().setAttribute("user",userModel);
                    return "redirect:/html/goods/getGoods.do";
                }else {
                    request.setAttribute("msg",IPubConstantDefine.ILoginConstantDefine.PASSWORD_ERROR);
                    return "view/login";
                }
            }else{
                request.setAttribute("msg",IPubConstantDefine.ILoginConstantDefine.USERNAME_ERROR);
                return "view/login";
            }
        }else {
            request.setAttribute("msg",IPubConstantDefine.ILoginConstantDefine.LOGIN_ERROR);
            return "view/login";
        }
    }

    @GetMapping("/getUsers.do")
    public String getUsers(HttpServletRequest request, HttpServletResponse response) {
        ResponseModel result = new ResponseModel();
        Object user = request.getSession().getAttribute("user");
        System.out.println(JSON.toJSONString(user));
        List<UserModel> users = null;
        try {
            users = userService.getUsers();
            if (users == null || users.isEmpty()) {
                result.message(IPubConstantDefine.IBaseConstantDefine.CODE_404, IPubConstantDefine.IBaseConstantDefine.MSG_404);
            }
            result.success(users);
        } catch (Exception e) {
            result.message(IPubConstantDefine.IBaseConstantDefine.CONNECT_CODE, IPubConstantDefine.IBaseConstantDefine.CONNECT_MSG);
        }
        request.setAttribute("result", result);
        return "view/user/list";
    }

}
