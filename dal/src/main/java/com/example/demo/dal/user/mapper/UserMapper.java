package com.example.demo.dal.user.mapper;

import com.example.demo.dal.user.entity.User;
import com.example.demo.dal.user.entity.UserCriteria;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    int deleteByFilter(UserCriteria filter);

    User getUserById(@Param("id") Integer id);
}