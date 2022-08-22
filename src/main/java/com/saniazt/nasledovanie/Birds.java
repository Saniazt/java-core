package com.saniazt.nasledovanie;

public class Birds {
  private String name;
  private String wings;

  public Birds(String name, String wings) {
    this.name = name; // если super говорит о супер классе, то this говорит об это классе
    this.wings = wings;
  }

  public void walk() {
    System.out.println("Ho-ho-ho " + name + " " + wings);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWings() {
    return wings;
  }

  public void setWings(String wings) {
    this.wings = wings;
  }
}
