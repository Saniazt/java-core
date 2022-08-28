package com.saniazt.Geniuses.Exceptions;

public class MainFOrExceptionHW {
  public static void main(String[] args) {
    int[] inet = new int[10];
    try {
      inet[11] = 12;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Cant be over 10 index");
    }
  }
}
