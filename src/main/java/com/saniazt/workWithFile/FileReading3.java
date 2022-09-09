package com.saniazt.workWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading3 {
  public static void main(String[] args) throws FileNotFoundException {
    String separetor = File.separator;
    String path =
        separetor
            + "C:"
            + separetor
            + separetor
            + "Users"
            + separetor
            + separetor
            + "1"
            + separetor
            + separetor
            + "Desktop"
            + separetor
            + separetor
            + "java_files"
            + separetor
            + separetor
            + "Rita.txt"
            + separetor;
    File file = new File(path);

    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
      System.out.println(scanner.nextLine());
    }
    scanner.close();
  }
}
