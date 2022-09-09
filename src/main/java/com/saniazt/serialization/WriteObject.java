package com.saniazt.serialization;

import java.io.*;

public class WriteObject { // В этом классе будем записывать обьекты
  public static void main(String[] args) {
    Person person1 = new Person(1, "Bob");
    Person person2 = new Person(2, "Mike");
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
            + "people.bin"
            + separetor;
    File file = new File(path);
    try {
      FileOutputStream fos = new FileOutputStream(file);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(person1);
      oos.writeObject(person2);
      oos.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
