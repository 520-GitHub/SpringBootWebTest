package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.MainMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: mr.chen
 * @CreateTime: 2022-02-23 14:57
 */
@Service
@Slf4j
public class UserAuthServiceImpl implements UserDetailsService {

    @Resource
    MainMapper userAuthMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userAuthMapper.getUserById(username);
        if (u == null) throw new UsernameNotFoundException("用户" + username + "不存在！");
        MDC.put("reqId", username);
        log.info("用户：" + username + "进行了登录");
        UserDetails build = org.springframework.security.core.userdetails.User
                .withUsername(u.getUserName())
                .password(new BCryptPasswordEncoder().encode("123456"))
                .roles(u.getLoginName())
                .build();
        return build;
    }
}
