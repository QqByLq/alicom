package com.syc.dubbo.domain;

import java.io.Serializable;

/**
 * 以后凡是利用各种网络访问框架,传递对象,该对象都必须实现序列化!
 * 比如Dubbo,Netty,HttpClient,UrlConnection,OkHttp...
 */
public class User implements Serializable {

    private Integer id;

    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
