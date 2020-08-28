package com.qiangesoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiangesoft.*.dao")
public class LqBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(LqBlogApplication.class, args);
    }

}
