package com.bfc.web.user.service;

import com.bfc.web.user.entity.UserEntity;
import com.bfc.web.user.model.UserModel;
import com.bfc.web.user.model.UserParamsModel;

import java.util.List;

public interface IUserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<UserModel> getUsers();

    /**
     * 登录验证
     * @param user
     * @return
     */
    public UserModel verifyUser(UserParamsModel user);


}
