package com.saniazt.Geniuses.Exceptions;

public class MainForException {
  public static void main(String[] args) {
    int a = 0;
    try {
      int b = 7 / a;
    } catch (ArithmeticException e1) {
      System.out.println("Cant be 0");
    } catch (Exception e) {

    } finally {
      {
        System.out.println("We are in finally");
      }
    }

    System.out.println("Hello");
  }
}
