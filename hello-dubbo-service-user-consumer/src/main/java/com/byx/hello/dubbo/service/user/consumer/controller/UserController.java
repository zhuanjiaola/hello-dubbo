package com.byx.hello.dubbo.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.byx.hello.dubbo.service.user.api.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "hiError")
    @GetMapping("hi")
    public String sayHi() {
        return userService.sayHi();
    }

    public String hiError() {
        return "Hystrix fallback";
    }

}
