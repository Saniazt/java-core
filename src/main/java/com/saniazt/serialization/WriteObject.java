package com.saniazt.serialization;

import java.io.*;

public class WriteObject { // В этом классе будем записывать обьекты
  public static void main(String[] args) {
    Person[] people = {
      new Person(1, "Bob", 177.6), new Person(2, "Mike", 198.7), new Person(3, "Tom", 981.9)
    };
    int x = 10;
    int y = 5;
    int[] number = {x, y};
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
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
      //      oos.writeInt(people.length); // для поочередного записывания
      //      for (Person person : people) {
      //        oos.writeObject(person);
      //      }
      oos.writeObject(people);
      oos.writeObject(number);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
