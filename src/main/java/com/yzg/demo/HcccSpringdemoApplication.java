package com.yzg.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yzg.demo.mapper")
public class HcccSpringdemoApplication {

	public static void main(String[] args) {

		System.out.println("hello world!");
		SpringApplication.run(HcccSpringdemoApplication.class, args);
	}

}
