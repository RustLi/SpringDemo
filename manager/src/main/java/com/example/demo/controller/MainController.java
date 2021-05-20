package com.example.demo.controller;

import com.example.demo.user.dto.UserReqDto;
import com.example.demo.user.service.UserService;
import com.kuaike.common.utils.ApiResult;
import com.kuaike.common.utils.ApiResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello.json")
    public ApiResult contactList(@RequestBody UserReqDto dto) {
        return ApiResultUtils.buildApiResult(userService.getUserList(dto));
    }

}
