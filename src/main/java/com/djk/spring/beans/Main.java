package com.djk.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        /*
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("daijiankun");

         */

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");

        helloWorld.hello();
    }
}
