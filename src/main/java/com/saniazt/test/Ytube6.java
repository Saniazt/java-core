package com.saniazt.test;

public class Ytube6 {
  public static void main(String[] args) {
    // Многомерные массивы
    char[][] array = new char[3][3];
    for (int i = 0; i < array.length; i++) array[i] = new char[3];
    array[0][0] = 'C';
    // многомерные массивы это когда массив в массиве:)
    System.out.println(array[0][0]);
  }
}
