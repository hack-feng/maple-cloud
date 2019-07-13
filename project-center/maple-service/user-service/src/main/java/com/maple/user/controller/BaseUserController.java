package com.maple.user.controller;


import com.maple.user.service.IBaseUserService;
import com.maple.userapi.bean.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 基础信息-用户信息 前端控制器
 * </p>
 *
 * @author maple
 * @since 2019-07-13
 */
@RestController
@RequestMapping("/baseUser")
public class BaseUserController {

    @Autowired
    private IBaseUserService userService;

    @GetMapping(value = "getList")
    public List<BaseUser> getList(){
        List<BaseUser> list = userService.list(null);
        return list;
    }

}

