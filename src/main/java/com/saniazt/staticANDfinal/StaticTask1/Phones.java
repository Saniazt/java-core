package com.saniazt.staticANDfinal.StaticTask1;

public class Phones {
  private static int countOfPhones;

  public Phones() {
    countOfPhones++;
  }

  public static void HowManyPhones() {
    System.out.println(countOfPhones);
  }
}
