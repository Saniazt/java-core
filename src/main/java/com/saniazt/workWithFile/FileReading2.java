package com.saniazt.workWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileReading2 {
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
            + "test2.txt"
            + separetor;
    File file = new File(path);

    Scanner scanner = new Scanner(file);
    String line = scanner.nextLine();
    String[] numbersString = line.split(" ");
    int[] numbers = new int[3];
    int counter = 0;
    for (String number : numbersString) {
      numbers[counter++] = Integer.parseInt(number);
    }
    System.out.println(Arrays.toString(numbers));
    scanner.close();
  }
}
