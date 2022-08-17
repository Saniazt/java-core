package com.saniazt.Order;

public class Customer {

    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("Name of the customer is: "+this.name+" He/She is: "+this.age+" years old");
    }

    public static class Refferal {
        public void no() {
            System.out.println("Has no refferal");
        }
        public void yes(int id) {
            System.out.println("Refferal number is: "+id);
        }

    }
    public static String paid(int a, int b){
        int c;
        c = a+b;
        return ("Total paid is: "+c);
    }
    public static String paid(int a, int b,int discount){
        int c;
        c=a+b-discount;
        return ("Total paid with discount is: "+c);
    }
}