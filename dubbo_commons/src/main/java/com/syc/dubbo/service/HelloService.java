package com.syc.dubbo.service;

import com.syc.dubbo.domain.User;

import java.util.List;

/**
 * 面向接口的远程调用.
 */
public interface HelloService {

    String sayHello(String msg);

    List<User> getUsers();

}
