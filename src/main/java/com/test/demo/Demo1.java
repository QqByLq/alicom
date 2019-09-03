package com.test.demo;

/**
 * Created by LQ on 2019/8/21 18:03
 */
public class Demo1 {

    public int count(){
        return 1%9;
    }



    public static void main(String[] args) {
       for (int i= 100;i<1000;i++){
            int a = i%10;//个位
            int b = i/10%10;//十位
            int c = i/100;//百位
            if(i == (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))){
                System.out.println(i);
            }
        }
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.count());
    }
}

