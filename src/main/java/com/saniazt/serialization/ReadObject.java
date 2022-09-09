package com.saniazt.serialization;

import java.io.*;

public class ReadObject { // В этом классе будем считывать обьекты
  public static void main(String[] args) {
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
      FileInputStream fis = new FileInputStream(file);
      ObjectInputStream ois = new ObjectInputStream(fis);

      Person person1 = (Person) ois.readObject();
      Person person2 = (Person) ois.readObject();

      System.out.println(person1);
      System.out.println(person2);
      ois.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
