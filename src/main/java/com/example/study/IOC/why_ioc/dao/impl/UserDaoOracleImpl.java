package com.example.study.IOC.why_ioc.dao.impl;

import com.example.study.IOC.why_ioc.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("从oracle中获取数据");
    }
}
