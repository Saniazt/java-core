package com.saniazt.workWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile2 {
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
    PrintWriter pw = new PrintWriter(file);

    pw.println("Hello");
    pw.println("I love u too");

    pw.close();
  }
}
