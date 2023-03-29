package com.roy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : adward
 * @date : 2023-03-29 23:31
 */
@SpringBootApplication
@MapperScan("com.roy.mapper")
public class ShardingApp {

    public static void main(String[] args) {
        SpringApplication.run(ShardingApp.class);
    }
}
