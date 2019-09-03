package com.test.demo;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Created by LQ on 2019/8/21 20:10
 */
public  class TestFiler  {
    public static void main(String[] args) {
        try {

            PrintWriter out = new PrintWriter(new FileOutputStream("D:\\abc.text"));
            String name="chen1213";
            out.write(name);
            out.flush();
        }catch (Exception e){
            System.out.print("123123132");
        }
    }

    public class Test {

        synchronized void test() {
            synchronized (this.getClass()) {}
        }
    }
}
