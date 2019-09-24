package com.modules.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有方法写给浏览器
@RestController
public class Test {
    //获得配置文件的数值
    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello-World" + name;
    }
}
