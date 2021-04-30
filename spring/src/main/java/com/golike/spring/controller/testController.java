package com.golike.spring.controller;

import com.golike.spring.config.KeyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class testController {

    @Autowired
    KeyConfig keyConfig;

    @RequestMapping("/key")
    public String testKey(){
        System.out.println(keyConfig.getKey());
        String msg = keyConfig.getKey();
        return msg;
    }
}
