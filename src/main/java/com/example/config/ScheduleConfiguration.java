package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Author: mr.chen
 * @CreateTime: 2022-02-24 11:17
 */
@Configuration
public class ScheduleConfiguration {

    //@Scheduled(fixedRate = 3000)
    @Scheduled(cron = "*/3 * * * * ?")
    public void test(){
        System.out.println("我是一个循环定时3秒钟的任务");
    }
}
