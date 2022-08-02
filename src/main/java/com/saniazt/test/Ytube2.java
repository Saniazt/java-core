package com.saniazt.test;

import java.util.Scanner;

public class Ytube2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second;
        boolean isTrue = true;
        System.out.print("Enter your first number:");
        first = num.nextInt();
        System.out.print("Enter your second number:");
        second = num.nextInt();

        if(first > second && isTrue) // больше
            System.out.print("First number is bigger");
        if(first == second) { // равно
            System.out.println("Numbers are equal");
            System.out.println("Nice match!!!");
        }
        else if(second > 1000) {
            System.out.println("WOW ITS TOO BIG");
        }
        else{
            System.out.println("Number is bigger than "+first);
        }
    }
}
