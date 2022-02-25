package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: mr.chen
 * @CreateTime: 2022-02-23 14:50
 */
@Mapper
public interface MainMapper {

    @Select("select * from sys_user where  user_name = #{name} ")
    User getUserById(String name);
}
