package com.djk.dao.impl;

import com.djk.dao.AccountDao;
import org.springframework.stereotype.Repository;


@Repository(value = "accountDao1")
public class AccountDaoImpl implements AccountDao {

    public void saveAccount() {
        System.out.println("save account111111111");
    }
}
