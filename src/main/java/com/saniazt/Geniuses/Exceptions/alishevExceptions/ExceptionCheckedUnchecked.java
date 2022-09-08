package com.saniazt.Geniuses.Exceptions.alishevExceptions;

public class ExceptionCheckedUnchecked {
  public static void main(String[] args) {
    // Checked (Compile time exceptions) = исключительные случаи в работе программы(нужно
    // обрабатывать)
    // Unchecked (Run time exceptions) = ошибка в работе програмы(нужно устранять)

    // int a = 1 / 0; // это Unchecked exception

    /* String name = null; //Unchecked
    name.length();
    */

    int[] array = new int[2]; // Unchecked
    System.out.println(array[2]);
  }
}
