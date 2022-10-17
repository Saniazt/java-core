package com.saniazt.test;

import com.saniazt.interfaces.Array;

import java.util.Arrays;

public class codeWars2 {
  public static long findNextSquare(long sq) {

    long chislo = (long) Math.sqrt(sq);
    return chislo * chislo == sq ? (chislo + 1) * (chislo + 1) : -1;
  }

  public static int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      for (int i1 = 0; i < numbers.length; i--) {
        if (target - numbers[i] == numbers[i1]) {

        }
      }
    } return result;
  }

  public static boolean isTriangle(int a, int b, int c){
    if(a<b+c && a>0&&b==c) return true;
    else return false;
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
