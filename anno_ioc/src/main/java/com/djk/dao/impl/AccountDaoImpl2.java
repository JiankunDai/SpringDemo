package com.djk.dao.impl;

import com.djk.dao.AccountDao;
import org.springframework.stereotype.Repository;


@Repository(value = "accountDao2")
public class AccountDaoImpl2 implements AccountDao {

    public void saveAccount() {
        System.out.println("save account22222222222222");
    }
}
