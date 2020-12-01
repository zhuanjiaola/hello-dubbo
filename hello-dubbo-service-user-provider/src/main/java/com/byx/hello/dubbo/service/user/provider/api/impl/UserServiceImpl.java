package com.byx.hello.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.byx.hello.dubbo.service.user.api.UserService;

/**
 * @author wang zhen xing
 * @date 2020/12/01 20:14
 */
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi() {
        return "Hello Dubbo";
    }
}
