package com.scijiu;

;

public class scijiu {
    //成员变量
    String name = "scijiu";

    public static void main(String[] args) {
        //局部变量
        String name = "hello";
        int a = 1;
        int b = 2;
        if (a > b) {
            System.out.println(a + "+" + b + "=" + (a + b));
        } else {
            System.out.println(a + "-" + b + "=" + (a - b));

        }
        boolean c=a==2==!false&&true;
        System.out.println(c);
        System.out.println('你');
        System.out.println('你'+32);
        System.out.println("你");
        System.out.println("你"+32);
//        System.out.println('');
    }
}
