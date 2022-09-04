package com.saniazt.Fibonacci;

public class Fibonacci {
  public static int fib(int n) {
    if (n == 1 || n == 0) return n; // base step
    return fib(n - 1) + fib(n - 2); // recursive step
  }
}
