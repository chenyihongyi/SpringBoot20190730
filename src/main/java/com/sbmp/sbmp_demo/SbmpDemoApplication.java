package com.sbmp.sbmp_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class SbmpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmpDemoApplication.class, args);
	}

}
