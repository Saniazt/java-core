package com.saniazt.enumPackage.enumAlishev;

public enum Season {
  AUTUMN(15),
  SUMMER(30),
  WINTER(-3),
  SPRING(20);

  private double temp;

  Season(double temp) {
    this.temp = temp;
  }

  public double getTemp() {
    return temp;
  }
}
