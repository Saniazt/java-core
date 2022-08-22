package com.saniazt.test;

import java.util.Scanner;

public class Ytube52 {

  public static void main(String[] args) {

    int[] a;
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter numbers of arrays: ");
    n = in.nextInt();
    a = new int[n];
    for (int m = 0; m < n; m++) {
      System.out.print("Enter a[" + m + "] = ");
      a[m] = in.nextInt();
    }
    for (int m = 0; m < n; m++)
      ;
    System.out.println();
  }
}
