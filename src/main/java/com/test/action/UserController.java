package com.test.action;

import com.test.pojo.SportResult;
import com.test.pojo.User;
import com.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by LQ on 2019/7/27 11:00
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/checklogin")
    public SportResult checklogin(String username, String password, HttpSession session){
        User user = userService.selectByUsername(username);

        if (user==null){
            return SportResult.notOk("用户名不存在");
        }else{
            if (user.getUpwd().equals(password)){
                session.setAttribute("user",user);
                return SportResult.ok();
            }else {
                return SportResult.notOk("密码错误");
            }
        }
    }

}
