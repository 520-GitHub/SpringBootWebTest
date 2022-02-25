package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//开启 异步
@EnableAsync
//开启定时任务
@EnableScheduling
@SpringBootApplication
public class SpringBootWebTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebTestApplication.class, args);
    }

}
