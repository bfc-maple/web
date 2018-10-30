package com.bfc.web.user.model;

import com.bfc.web.base.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;

public class UserModel implements Serializable {

    private Integer userId;

    private String name;

    private Integer orgId;

    private String gender;

    private String userName;

    private String password;

    private String phone;

    private String email;

    private String address;

    private String createTime;

    private String updateTime;

    private String loginTime;

    private String lastLoginTime;

    private String online;

    private int count;

    private String del;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender==0?"女":"男";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = DateUtils.dateToString(createTime,"");
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = DateUtils.dateToString(updateTime,"");
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = DateUtils.dateToString(loginTime,"");
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = DateUtils.dateToString(lastLoginTime,"");
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online==1?"在线":"不在线";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del==0?"有效":"无效";
    }
}
