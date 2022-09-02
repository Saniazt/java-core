package com.saniazt.generic;

public class Digit {
  public double value;

  <T extends Number> Digit(T value) {
    this.value = value.doubleValue();
  }
}
