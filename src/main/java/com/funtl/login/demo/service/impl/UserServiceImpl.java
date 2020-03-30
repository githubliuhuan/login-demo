package com.funtl.login.demo.service.impl;

import com.funtl.login.demo.dao.UserDao;
import com.funtl.login.demo.dao.impl.UserDaoImpl;
import com.funtl.login.demo.entity.User;
import com.funtl.login.demo.service.UserService;

/**
 * Created by liuhuan on 2020/3/30 10:26
 */
public class UserServiceImpl implements UserService {

    // 数据访问层的具体实现
    private UserDao userDao = new UserDaoImpl();

    /**
     * 登录
     * @param loginId
     * @param loginPwd
     * @return
     */
    @Override
    public User login(String loginId, String loginPwd) {
        return userDao.login(loginId,loginPwd);
    }
}
