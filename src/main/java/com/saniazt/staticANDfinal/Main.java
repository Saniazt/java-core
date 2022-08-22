package com.saniazt.staticANDfinal;

public class Main {
  public static void main(String[] args) {

    int x = Math.summ(12, 23);
    System.out.println(x);
    Math a = new Math();
    System.out.println(a.x);
    Math.x = 24;
    System.out.println(a.x);
    Math b = new Math();
    System.out.println(b.x);
    ////
    Math z = new Math();
    int j = z.mult(12, 12);
    System.out.println(j);
    ///
    Math v = new Math();
    int zx = v.dilenya(12, 6);
    System.out.println(zx);
  }
}
