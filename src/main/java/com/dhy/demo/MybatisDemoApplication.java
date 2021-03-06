package com.dhy.demo;


import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@MapperScan("com.dhy.demo.dao")
@SpringBootApplication
public class MybatisDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
	}

}
