package com.saniazt.parsing;

public class Parsing {
  private String name;
  private int age;
  private String position;
  private double height;

  public Parsing(String name, int age, String position, double height) {
    this.name = name;
    this.age = age;
    this.position = position;
    this.height = height;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getPosition() {
    return position;
  }

  public double getHeight() {
    return height;
  }
}
