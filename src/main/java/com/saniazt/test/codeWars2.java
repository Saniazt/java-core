package com.saniazt.test;

public class codeWars2 {
  public static long findNextSquare(long sq) {

    long chislo = (long) Math.sqrt(sq);
    return chislo * chislo == sq ? (chislo + 1) * (chislo + 1) : -1;
  }

  public static int rentalCarCost(int d) {
    int h = 0;
    if (d < 7) return h = d * 40;
    else if (d >= 3) {
      return h = (d * 40) - 20;
    } else return d * 40 - 50;
  }

  public static void main(String[] args) {
    System.out.println(findNextSquare(543463445));
  }
}
