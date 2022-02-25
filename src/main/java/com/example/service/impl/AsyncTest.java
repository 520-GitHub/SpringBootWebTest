package com.example.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: mr.chen
 * @CreateTime: 2022-02-24 11:10
 */
@Service
public class AsyncTest {

    @Async
    public void test(){
        try {
            Thread.sleep(3000);
            System.out.println("我是异步任务");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
