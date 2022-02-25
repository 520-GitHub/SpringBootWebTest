package com.example.controller;

import com.example.listener.TestEvent;
import com.example.listener.TestListener;
import com.example.service.impl.AsyncTest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: mr.chen
 * @CreateTime: 2022-02-23 14:28
 */
@Slf4j
@Controller
public class MainController {

    @Resource
    AsyncTest asyncTest;
    @Resource
    TestListener listener;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest  request){
        listener.onApplicationEvent(new TestEvent("我是监听器"));

        MDC.put("reqId",request.getSession().getId());
        log.info("访问登入页面");
        //asyncTest.test();
        return "login";
    }
}
