package com.funtl.login.demo.service;

import com.funtl.login.demo.entity.User;

/**
 * Created by liuhuan on 2020/3/30 10:18
 */
public interface UserService {
    public User login(String loginId,String loginPwd);
}
