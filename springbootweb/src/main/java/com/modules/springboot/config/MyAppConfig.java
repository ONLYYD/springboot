package com.modules.springboot.config;

import com.modules.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指明当前类是配置类 替代之前的spring配置文件
 */
@Configuration
public class MyAppConfig {
//方法名必须是id名字
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean注解");
        return new HelloService();
    }
}
