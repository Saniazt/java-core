package com.saniazt.recursion;

public class Recursion {
  public static void counter(int n) {
    if (n == 0) return;
    System.out.println(n);
    counter(n - 1);
  }

  // 4! = 4*3*2*1
  // 15! = 15*14*13.....*1

  public static int factorial(int m) {
    if (m == 1) return 1;
    return m * factorial(m - 1);
  }

  public static int factorial1(int x) {
    if (x == 0) return 1;
    System.out.println("x = " + x);
    x = x * (factorial(x - 1));
    System.out.println("Stack: x = " + x);
    return x;
  }
}
