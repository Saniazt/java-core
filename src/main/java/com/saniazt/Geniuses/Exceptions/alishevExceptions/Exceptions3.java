package com.saniazt.Geniuses.Exceptions.alishevExceptions;

import java.util.Scanner;

public class Exceptions3 {
  public static void main(String[] args) throws ScannerException {
    // пользователь будет вводить число, если это не 0 - выброс исключения
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int x = Integer.parseInt(scanner.nextLine());

      if (x != 0) {
        throw new ScannerException("User entered not zero");
      }
    }
  }
}
