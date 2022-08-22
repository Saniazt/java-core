package com.saniazt.test;

public class ForTest {
  public static void main(String[] args) {
    //    int[] num = new int[100];
    //    for (int i = 0; i < num.length; i++) {
    //      num[i] = i * 10;
    //    }
    //    for (int i : num) {
    //      System.out.println(i);
    //    }

    int[] first = new int[900];
    for (int i = 0; i < first.length; i++) {
      first[i] = i + 100;
    }
    int[] second = new int[first.length];
    for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
      second[j] = first[i];
    }
    for (int i : second) {
      System.out.println(i);
    }
  }
}
