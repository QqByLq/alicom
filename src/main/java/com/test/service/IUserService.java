package com.test.service;


import com.test.pojo.User;

/**
 * Created by LQ on 2019/7/27 11:01
 */
public interface IUserService {
    /**
     * 通过username查找用户
     * @param username
     * @return
     */
    User selectByUsername(String username);

}
