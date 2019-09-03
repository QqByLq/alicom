package com.test.demo;

/**
 * Created by LQ on 2019/8/27 19:11
 */
public class TryCatch {
    public static void main(String[] args) {
        TryCatch c = new TryCatch();
        c.method();
    }

    private void method() {
        try {
            System.out.println("A");
            int i = 10/0;
            System.out.println("B");
        }catch (Exception e){
            System.out.println("C");
        }finally {
            System.out.println("D");
            System.out.println("tijiaoceshi");
        }
    }
}
