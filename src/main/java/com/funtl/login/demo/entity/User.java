package com.funtl.login.demo.entity;

import java.io.Serializable;

/**
 * Created by liuhuan on 2020/3/30 9:34
 */
public class User implements Serializable {
    private String username;
    private String loginId;
    private String loginPwd;
    // private int age;

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }


    public User(String username, String loginId, String loginPwd, int age) {
        this.username = username;
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }
}
