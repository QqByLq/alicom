package com.test.demo;

import java.util.Scanner;

/**
 * Created by LQ on 2019/8/21 18:16
 */
public class Demo2 {
        /**
         * 输入某年某月某日，判断这一天是这一年的第几天？
         *
         */
        public static void main(String[] args) {
            int year;
            int month;
            int days;
            int day=0;

            int d=0;//累计天数


                Scanner scanner = new Scanner(System.in);
                System.out.println("输入年:");
                year = scanner.nextInt();
                System.out.println("输入月:");
                month = scanner.nextInt();
                System.out.println("输入日:");
                days = scanner.nextInt();

                if (month < 0 || month > 12 || days < 0 || days > 31) {
                    System.out.println("input error!");
                }else {
                for (int i = 1; i <month; i++) {

                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        day = 31;
                        break;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        day = 30;
                        break;
                    }
                    case 2: {
                        /**
                         * 闰年:①：非整百年数除以4，无余为闰，有余为平；②整百年数除以400，无余为闰有余平
                         * 二月：平年28天、闰年29天
                         */
                        if ((year % 100 !=0 &&year % 4 == 0) || (year % 100 == 0 && year%400==0)) {
                            day = 29;
                        } else {
                            day = 28;
                        }
                    }
                }
                d+=day;
            }
            System.out.println("这是"+year+"年的"+(d+days)+"天");
        }
        }
}
