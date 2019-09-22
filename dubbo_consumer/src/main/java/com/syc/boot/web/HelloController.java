package com.syc.boot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.syc.dubbo.domain.User;
import com.syc.dubbo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
public class HelloController {

    //Reference:实现服务的远程调用,并且给接口对象实现注入.
    //@Autowired
    @Reference(version = "1.0.0", interfaceClass = HelloService.class)
    private HelloService helloService;

    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping("/hello/{msg}")
    public String sayHello(@PathVariable("msg") String msg) {
        return helloService.sayHello(msg);
    }

    @GetMapping("/users")
    public List<User> users() {
        return helloService.getUsers();
    }


}
