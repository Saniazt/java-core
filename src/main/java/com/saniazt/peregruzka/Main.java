package com.saniazt.peregruzka;

public class Main {
    public static int summ(int a, int b){
        return a+b;
    }
    public static int summ(int a, int b, int g){
        return a+b+g;
    }

    public static void main(String[] args) {
        System.out.println(summ(12,20));
        System.out.println(summ(12,20,20));
    }
}
