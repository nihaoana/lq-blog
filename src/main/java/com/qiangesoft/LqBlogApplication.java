package com.qiangesoft;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiangesoft.*.dao")
public class LqBlogApplication {

    private static final Logger logger= LoggerFactory.getLogger(LqBlogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LqBlogApplication.class, args);
        logger.info(LqBlogApplication.class.getSimpleName() + " start success!");
    }

}
