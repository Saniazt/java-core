package com.saniazt.serialization;

import java.io.*;
import java.util.Arrays;

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
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

      //      int personCount = ois.readInt(); // для поочередного считывания
      //      Person[] people = new Person[personCount];
      //      for (int i = 0; i < personCount; i++) {
      //        people[i] = (Person) ois.readObject();
      //      }
      Person[] people = (Person[]) ois.readObject();
      System.out.println(Arrays.toString(people));
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
