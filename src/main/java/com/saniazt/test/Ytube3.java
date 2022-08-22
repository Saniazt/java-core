package com.saniazt.test;

import java.util.Scanner;

public class Ytube3 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int first, second = 50;
    boolean isTrue = false;
    System.out.println("Enter first number:");
    first = num.nextInt();

    isTrue = first == 51;

    if (first >= second || isTrue) {
      System.out.println("Number is 10");
      System.out.println("\n");
    } else if (first == 45) System.out.println("Number is equal 45");
    else {
      System.out.println("Number is lower than " + second);
    }
    switch (first) {
      case 31:
        System.out.println("Number is equal 51");
        break;
      case 48:
        System.out.println("Number is equal 48");
        break;
      case 57:
        System.out.println("Number is equal 57");
        break;
      default:
        System.out.println("Number is equal smth");
    }
  }
}
