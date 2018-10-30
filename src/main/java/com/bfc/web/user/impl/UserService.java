package com.bfc.web.user.impl;

import com.alibaba.fastjson.JSON;
import com.bfc.web.base.redis.RedisUtils;
import com.bfc.web.user.dao.IUserDao;
import com.bfc.web.user.entity.UserEntity;
import com.bfc.web.user.model.UserModel;
import com.bfc.web.user.model.UserParamsModel;
import com.bfc.web.user.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService implements IUserService {

    @Autowired
    IUserDao userDao;

    @Autowired
    RedisUtils redisUtils;

    @Override
    public List<UserModel> getUsers() {
        List<UserModel> users = userDao.selectUsers(null);
        List<UserModel> userModels = JSON.parseArray(JSON.toJSONString(users), UserModel.class);
        return userModels;
    }

    @Override
    public UserModel verifyUser(UserParamsModel user) {
        UserEntity userEntity = userDao.selectUserByUserName(user.getUserName());
        UserModel userModel = JSON.parseObject(JSON.toJSONString(userEntity), UserModel.class);
        if (userModel != null && StringUtils.isNotBlank(userModel.getUserName()))
            redisUtils.set(userModel.getUserName(), userModel);
        return userModel;
    }
}
