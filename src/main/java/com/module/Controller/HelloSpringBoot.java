package com.module.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nameM
 */
@RequestMapping({"hello"})
@RestController
public class HelloSpringBoot {
    @GetMapping("/login")
    public String hello(){
        return "hello";
    }
}
