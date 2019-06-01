package com.djk.ui;

import com.djk.bean.BeanFactory;
import com.djk.service.AccountService;
import com.djk.service.impl.AccountServiceImpl;


/**
 * 模拟表现层，用于调业务层
 */

public class Client {

    public static void main(String[] args) {

        //AccountService accountService = new AccountServiceImpl();
        for (int i = 0; i < 5; i++) {
            AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
            accountService.saveAccount();
        }
    }
}
