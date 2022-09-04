package com.saniazt.recursion.TestRecursion;

public class TestRecursion {
  public static int recursionTest(int m) {
    if (m == 1) return 1;
    return m * recursionTest(m - 1);
  }
}
