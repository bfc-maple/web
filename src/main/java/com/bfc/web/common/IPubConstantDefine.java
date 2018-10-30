package com.bfc.web.common;

public interface IPubConstantDefine {

    public interface IBaseConstantDefine{
        public static final String CODE_404="404";
        public static final String MSG_404="数据查询失败";
        public static final String CODE_400="400";
        public static final String MSG_400="操作失败";
        public static final String CODE_200="200";
        public static final String MSG_200="操作成功";
        public static final String CONNECT_CODE ="400";
        public static final String CONNECT_MSG ="链接异常,请稍后重试";


    }

    public interface ILoginConstantDefine{
        public static final String LOGIN_ERROR="用户名或密码有误";
        public static final String USERNAME_ERROR="用户名有误";
        public static final String PASSWORD_ERROR="密码有误";

    }
}
