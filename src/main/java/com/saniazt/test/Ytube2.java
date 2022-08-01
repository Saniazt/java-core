package com.saniazt.test;

import java.util.Scanner;

public class Ytube2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second;
        System.out.print("Enter your first number:");
        first = num.nextInt();
        System.out.print("Enter your second number:");
        second = num.nextInt();

        if(first > second) // больше
            System.out.print("First number is bigger");
        if(first < second) // меньше
            System.out.println("Second is bigger");
        if(first == second) { // равно
            System.out.println("Numbers are equal");
            System.out.println("Nice match!!!");
        }
    }

}
