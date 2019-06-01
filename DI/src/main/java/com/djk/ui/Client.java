package com.djk.ui;

import com.djk.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 模拟表现层，用于调业务层
 */

public class Client {

    public static void main(String[] args) {

        //1.获取核心容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        //2.根据id获取bean对象
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");

        accountService.saveAccount();

    }
}
