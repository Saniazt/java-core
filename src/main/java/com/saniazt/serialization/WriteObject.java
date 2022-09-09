package com.saniazt.serialization;

import java.io.*;

public class WriteObject { // В этом классе будем записывать обьекты
  public static void main(String[] args) {
    Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};
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
      //      oos.writeInt(people.length); // для поочередного записывания
      //      for (Person person : people) {
      //        oos.writeObject(person);
      //      }
      oos.writeObject(people);
      oos.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
