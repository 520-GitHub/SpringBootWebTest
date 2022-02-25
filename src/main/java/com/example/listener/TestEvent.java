package com.example.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: mr.chen
 * @CreateTime: 2022-02-24 11:43
 */
public class TestEvent extends ApplicationEvent {
    public TestEvent(Object source) {
        super(source);
    }
}
