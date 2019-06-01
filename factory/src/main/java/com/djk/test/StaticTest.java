package com.djk.test;

class StaticDemo{

    //静态代码块
    static {
        System.out.println("静态代码块被执行");
    }

    void show(){
        System.out.println("方法被执行");
    }

}

public class StaticTest {

    /**
     * 静态代码块的特点：
     * 随着类的加载而执行，而且只执行一次
     */

    public static void main(String[] args) {

        new StaticDemo().show();
        new StaticDemo().show();
    }

}
