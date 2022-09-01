package com.saniazt.vlozhenieKlassi.Dog;

public class Cat {
  private String name;
  private int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println(
        name + " is eating now!!" + ". " + name + " and she is " + age + " years old");
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void meow(String mat) {
    System.out.println("MEOW " + mat);
  }

  public void sravnenie() {
    if (age > 10) {
      System.out.println(name + "OLD");
    } else System.out.println(name + "is in good condition");
  }
}
