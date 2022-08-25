package com.saniazt.parsing;

public class MainForParsing {
  public static void main(String[] args) {

    String info = "This is Ivan, He is 28 years old, he is a progger, his height is 174sm.";
    String name1 = info.substring(8, 12);
    String age1 = info.substring(20, 22);
    int age2 = Integer.parseInt(age1);
    String position1 = info.substring(42, 49);
    String height1 = info.substring(65, 68);
    int height2 = Integer.parseInt(height1);

    Parsing person = new Parsing(name1, age2, position1, height2);

    System.out.println(person.getName());
    System.out.println(person.getAge());
    System.out.println(person.getPosition());
    System.out.println(person.getHeight());
  }
}
