package com.saniazt.Geniuses.Man;

public class Man {
  private String name;
  private int age;

  public Man(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void showInfo() {
    System.out.println("Name " + name);
    System.out.println("Age is " + age);
  }

  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else System.out.println("Age should be over 0 ");
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
}
