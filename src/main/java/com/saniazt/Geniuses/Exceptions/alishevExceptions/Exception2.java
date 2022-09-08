package com.saniazt.Geniuses.Exceptions.alishevExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2 {
  public static void main(String[] args) {
    try {
      readFile();
    } catch (FileNotFoundException e) {
      System.out.println("Exception operated in main method.");
    }
  }

  public static void readFile() throws FileNotFoundException {
    File file = new File("123.txt");
    Scanner scanner = new Scanner(file);
  }
}
