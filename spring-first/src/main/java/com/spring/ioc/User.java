package com.spring.ioc;

public class User {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("username is " + name + "  age is " + age);
    }

    public static void main(String[] args) {
    }

}
