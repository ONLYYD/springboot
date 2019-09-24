package com.modules.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 //加入配置文件，使我们自己编写的文件也能自动识别
//@ImportResource(locations = {"classpath:bean.xml"})
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("启动成功");

	}

}
