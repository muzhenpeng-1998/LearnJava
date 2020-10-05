package com.example.study.IOC.why_ioc.service.impl;

import com.example.study.IOC.why_ioc.dao.UserDao;
import com.example.study.IOC.why_ioc.service.UserService;

public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMysqlImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
