package com.funtl.login.demo.dao.impl;

import com.funtl.login.demo.dao.UserDao;
import com.funtl.login.demo.entity.User;


/**
 * Created by liuhuan on 2020/3/30 9:42
 */
public class UserDaoImpl implements UserDao {
    /**
     * 用户登录
     * @param loginId 登录ID
     * @param loginPwd 登录密码
     * @return String：登录结果
     */
    @Override
    public User login(String loginId, String loginPwd) {
        User user = null;
        if ("admin".equals(loginId)) {
            if ("admin".equals(loginPwd)) {
                user = new User();
                user.setLoginId("admin");
                user.setLoginPwd("admin");
                user.setUsername("Lusifer");
            }
        }
        return user;
    }
}
