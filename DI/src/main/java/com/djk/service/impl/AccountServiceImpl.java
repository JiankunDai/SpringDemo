package com.djk.service.impl;

import com.djk.service.AccountService;

import java.util.Date;

/**
 * 账户的业务层实现类
 */

public class AccountServiceImpl implements AccountService {

    //如果是经常变化的数据，并不适用于注入的方式
    private String username;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String username, Integer age, Date birthday) {
        this.username = username;
        this.age = age;
        this.birthday = birthday;
    }

    public void  saveAccount(){
        System.out.println("service中的saveAccount方法执行了。" + username + " " + age +" " + birthday);
    }

}
