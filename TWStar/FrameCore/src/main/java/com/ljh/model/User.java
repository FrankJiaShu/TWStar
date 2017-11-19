package com.ljh.model;

import org.springframework.stereotype.Component;

/**
 * Created by ljh on 2017/11/12.
 */
@Component
public class User {
    /*账号*/
    private String userId;
    /*用户名*/
    private String userName;
    /*密码*/
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

}

