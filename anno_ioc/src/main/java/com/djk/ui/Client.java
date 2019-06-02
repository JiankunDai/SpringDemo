package com.djk.ui;

import com.djk.dao.AccountDao;
import com.djk.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;


/**
 * 模拟表现层，用于调业务层
 */

@Controller
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //1.获取核心容器
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        //2.根据id获取bean对象
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        AccountService accountService2 = (AccountService) applicationContext.getBean("accountService");

        //System.out.println(accountService);

        //AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);
        //System.out.println(accountDao);

        accountService.saveAccount();
        accountService.printString();

        System.out.println(accountService == accountService2);

        applicationContext.close();
    }
}
