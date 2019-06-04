package com.djk.service.impl;

import com.djk.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    public void saveAccount() {
        System.out.println("执行了保存");
        //int i=1/0;
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新"+i);

    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
