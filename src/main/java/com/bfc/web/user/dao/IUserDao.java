package com.bfc.web.user.dao;

import com.bfc.web.user.entity.UserEntity;
import com.bfc.web.user.model.UserModel;
import com.bfc.web.user.model.UserParamsModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {

    List<UserModel> selectUsers(UserParamsModel params);
    /**
     * 根据用户名查询用户信息
     * @param UserName
     * @return
     */
    UserEntity selectUserByUserName(String UserName);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}