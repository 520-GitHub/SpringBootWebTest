package com.example.entity;

import lombok.Data;

@Data
public class User {
    private Long userId;
    private Long deptId;
    private Long parentId;
    private Long roleId;
    private String loginName;
    private String userName;
    private String email;
    private String phoneNumber;
    private String sex;
    private String avatar;
    private String password;
}
