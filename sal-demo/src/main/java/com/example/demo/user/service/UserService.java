package com.example.demo.user.service;

import com.example.demo.user.dto.UserReqDto;
import com.example.demo.user.dto.UserRespDto;

import java.util.List;

public interface UserService {
    UserRespDto getUserList(UserReqDto dto);
}
