package com.djk.spring.beans;

public class HelloWorld {

    public HelloWorld() {
        System.out.println("HelloWorld constructor...");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName: " + name);
        this.name = name;
    }

    public void hello() {
        System.out.println("hello:" + getName());
    }
}
