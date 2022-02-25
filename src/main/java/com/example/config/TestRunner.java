package com.example.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 项目运行时 创建一个线程执行 初始化工作
 *
 * @Author: mr.chen
 * @CreateTime: 2022-02-24 16:21
 */
//@Order(2) //多个初始化可以通过order指定顺序
@Component
public class TestRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("TestRunner初始化");

    }
}
