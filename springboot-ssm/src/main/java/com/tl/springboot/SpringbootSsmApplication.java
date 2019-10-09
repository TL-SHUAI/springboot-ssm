package com.tl.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@EnableTransactionManagement //开启声明式事务
@SpringBootApplication
@MapperScan(basePackages = "com.tl.springboot.mapper")
public class SpringbootSsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSsmApplication.class, args);
    }

}
