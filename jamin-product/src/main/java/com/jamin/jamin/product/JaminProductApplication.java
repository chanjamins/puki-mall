package com.jamin.jamin.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jamin.jamin.product.dao")
public class JaminProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaminProductApplication.class, args);
    }

}
