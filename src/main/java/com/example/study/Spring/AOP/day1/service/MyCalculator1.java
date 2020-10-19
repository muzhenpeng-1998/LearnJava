package com.example.study.Spring.AOP.day1.service;

import org.springframework.stereotype.Service;

@Service
public class MyCalculator1 implements Calculator {
    @Override
    public Integer add(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i+j;
        return result;
    }

    @Override
    public Integer sub(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i-j;
        return result;
    }

    @Override
    public Integer mul(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i*j;
        return result;
    }

    @Override
    public Integer div(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i/j;
        return result;
    }
}
