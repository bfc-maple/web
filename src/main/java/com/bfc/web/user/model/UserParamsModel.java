package com.bfc.web.user.model;

import java.io.Serializable;

public class UserParamsModel implements Serializable {

    private static final long serialVersionUID = 8402655290282341483L;
    private String userName;
    private String password;


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
}
