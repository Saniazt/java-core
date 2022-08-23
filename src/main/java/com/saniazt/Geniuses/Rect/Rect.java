package com.saniazt.Geniuses.Rect;

public class Rect {
  double height;
  double width;

  public void info(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public double perimetr() {
    return ((height + width) * 2);
  }

  public double square() {
    return ((height * width) * 2);
  }
}
