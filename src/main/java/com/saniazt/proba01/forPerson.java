package com.saniazt.proba01;

public class forPerson {
    public int height = 156;
    public String name = "Default";

    public void say (String name){
        System.out.println("Hello, "+name);
    }

    public forPerson(int h, String n){
        height = h;
        name = n;
    }

    public forPerson(){}

    public forPerson(String n){
        name = n;
    }
}
