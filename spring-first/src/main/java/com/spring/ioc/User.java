package com.spring.ioc;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("username is " + name);
    }

    public static void main(String[] args) {
    }

}
