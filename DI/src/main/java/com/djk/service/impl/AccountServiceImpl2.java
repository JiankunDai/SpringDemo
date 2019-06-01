package com.djk.service.impl;

import com.djk.service.AccountService;

import java.util.Date;

public class AccountServiceImpl2 implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void  saveAccount(){
        System.out.println("service中的saveAccount方法执行了。" + name + " " + age +" " + birthday);
    }
}
