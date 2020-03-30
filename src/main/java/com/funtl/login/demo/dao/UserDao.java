package com.funtl.login.demo.dao;

import com.funtl.login.demo.entity.User;

/**
 * 用户数据访问
 * Created by liuhuan on 2020/3/30 9:35
 */
public interface UserDao {
    public User login(String loginId, String loginPwd);
}
