package com.leave.centralmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.leave.centralmall.product.dao")
@SpringBootApplication
public class CentralmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CentralmallProductApplication.class, args);
    }

}
