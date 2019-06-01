package com.djk.service.impl;

import com.djk.bean.BeanFactory;
import com.djk.dao.AccountDao;
import com.djk.dao.impl.AccountDaoImpl;
import com.djk.service.AccountService;

/**
 * 账户的业务层实现类
 */

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();

    public AccountServiceImpl() {
        System.out.println("object build!");;
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }

    /**
     * private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");
     *
     *     //private int i = 1;
     *
     *     public void saveAccount() {
     *         int i = 1;
     *         accountDao.saveAccount();
     *         System.out.println(i);
     *         i++;
     *     }
     */

}
