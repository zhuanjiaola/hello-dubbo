package com.byx.hello.dubbo.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.byx.hello.dubbo.service.user.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang zhen xing
 * @date 2020/12/01 21:17
 */
@RestController
@RequestMapping("dubbo")
public class UserController {

    @Reference(version = "${user.service.version}")
    private UserService userService;

    @GetMapping("hi")
    public String sayHi() {
        return userService.sayHi();
    }


}
