package com.test.service.impl;

import com.test.mapper.UserMapper;

import com.test.pojo.User;
import com.test.pojo.UserExample;
import com.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by LQ on 2019/7/27 11:11
 */
@Service
public class UserserviceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    /*获取登录信息*/
    @Override
    public User selectByUsername(String username) {
        UserExample empExample = new UserExample();

        UserExample.Criteria criteria =  empExample.createCriteria();

        criteria.andUnameEqualTo(username);

        List<User> empList = userMapper.selectByExample(empExample);

        return empList.size()>0?empList.get(0):null;
    }
}
