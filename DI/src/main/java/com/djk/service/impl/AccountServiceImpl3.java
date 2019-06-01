package com.djk.service.impl;

import com.djk.service.AccountService;

import java.util.*;

public class AccountServiceImpl3 implements AccountService {

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String, String> myMap;
    private Properties myProperties;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProperties(Properties myProperties) {
        this.myProperties = myProperties;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myStrs);
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProperties);
    }


}
