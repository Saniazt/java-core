package com.saniazt.Geniuses.Exceptions.alishevExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
  public static void main(String[] args) {
    File file = new File("sdf");

    try {
      Scanner scanner = new Scanner(file); // код который может вызвать исключение
      System.out.println("After Scanner: ");
    } catch (FileNotFoundException e) {
      System.out.println("File is not found"); // обработка исключения
    }
    System.out.println("After try-catch block");
  }
}
