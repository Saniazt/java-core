package com.saniazt.test;

import java.util.Scanner;

public class myself {
  public static void main(String[] args) {

    System.out.println("Enter first number please: ");

    Scanner num1 = new Scanner(System.in);
    double m;

    do {
      System.out.println("Cannot be over 100");
      m = num1.nextDouble();
      if (m < 100) System.out.println("OKEY, давай второе число:");
    } while (m > 100);

    Scanner num2 = new Scanner(System.in);
    double z;

    do {
      System.out.println("Enter second number please: ");
      z = num2.nextDouble();
      double y;
      y = z + m;
      if (z < 100) System.out.println("Сумма чисел" + y);
    } while (z > 100);
  }
}
