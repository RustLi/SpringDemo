package com.example.demo.user.service.impl;

import com.example.demo.dal.user.entity.User;
import com.example.demo.dal.user.mapper.UserMapper;
import com.example.demo.user.dto.UserReqDto;
import com.example.demo.user.dto.UserRespDto;
import com.example.demo.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserRespDto getUserList(UserReqDto dto) {
        log.info("getUserList: 111 dto:{}",dto);
        User user = userMapper.getUserById(dto.getUserId());
        log.info("getUserList: user:{}",user);
        if (Objects.isNull(user)){
            log.info("getUserLIst user is null");
            return null;
        }
        UserRespDto respDto = new UserRespDto();
        respDto.setUserId(user.getId());
        respDto.setAge(user.getAge());
        respDto.setName(user.getName());
        return respDto;
    }
}
