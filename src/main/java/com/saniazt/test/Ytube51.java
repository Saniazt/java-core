package com.saniazt.test;

import java.util.Scanner;

public class Ytube51 {
  public static void main(String[] args) {
    int[] a;
    // Создали массив, но не выделили память, тк хз сколько будет элементов
    int n;
    // создали переменную, при вводе числа, в дальнейшем это будет размер памяти
    Scanner in = new Scanner(System.in);
    System.out.println("Enter numbers of array");
    n = in.nextInt();
    a = new int[n];
    // в строке выше мы выделяем память(конкретное кол-во)
    for (int i = 0; i < n; i++) {
      System.out.println("Enter a[" + i + "] = ");
      a[i] = in.nextInt();
    }
  }
}
