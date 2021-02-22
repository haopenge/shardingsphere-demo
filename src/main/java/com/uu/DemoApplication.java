package com.uu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.uu.dao")
@SpringBootApplication
public class DemoApplication {
	
    public static void main(final String[] args){
       SpringApplication.run(DemoApplication.class, args);
    }
}
