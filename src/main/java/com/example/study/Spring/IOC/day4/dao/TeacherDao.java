package com.example.study.Spring.IOC.day4.dao;

import com.example.study.Spring.IOC.day4.bean.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao extends BaseDao<Teacher>{
    public void save() {
        System.out.println("保存老师");
    }
}
