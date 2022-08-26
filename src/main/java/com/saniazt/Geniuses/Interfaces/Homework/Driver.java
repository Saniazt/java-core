package com.saniazt.Geniuses.Interfaces.Homework;

public class Driver extends Worker implements Can_Drive {
  public Driver(String name) {
    super(name);
  }

  @Override
  public void canDrive() {
    System.out.println("Can drive");
  }
}
