package com.syc.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.syc.dubbo.domain.User;
import com.syc.dubbo.service.HelloService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 利用@Service注解进行服务的注册和发布.
 */
@Component
@Service(version = "1.0.0", timeout = 5000, retries = 2, interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {

    public String sayHello(String msg) {

        return "接收的参数:" + msg + ". 你好,我是你大爷...";
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();

        Random random = new Random();
        for (int i = 0; i < random.nextInt(100); i++) {
            users.add(new User(i, "user-" + i));
        }

        return users;
    }

}
