package com.test.demo;

/**
 * Created by LQ on 2019/8/27 19:16
 */
public class Demo3 {
    public static void main(String[] args) {
        ChildClass clazz = new ChildClass();
        ChildClass.staticMethod();
       clazz.method();
    }
}

class ParentClass{

    public ParentClass(){
        System.out.println("A");
    }

    public static void staticMethod(){
        System.out.println("B");
    }

    public void method(){
        System.out.println("C");
    }
}

class ChildClass extends ParentClass{
    public ChildClass(){
        System.out.println("X");
    }

    public static void staticMethod(){
        System.out.println("Y");
    }

    public void method(){
        System.out.println("Z");
    }
}