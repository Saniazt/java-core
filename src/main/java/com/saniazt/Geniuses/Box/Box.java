package com.saniazt.Geniuses.Box;

public class Box {

  private double weight;
  private double height;
  private double width;

  public Box(double weight, double height, double width) {
    this.weight = weight;
    this.height = height;
    this.width = width;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  Box(Box box) {
    this.width = box.width;
    this.height = box.height;
    this.weight = box.weight;
  }

  public double volume() {
    return height * weight * width;
  }

  public void showVolume() {
    System.out.println(volume());
  }

  public int compare(Box box) {
    double thisVolume = volume();
    double boxVolume = box.volume();
    int result;
    if (thisVolume > boxVolume) {
      result = 1;
    } else if (thisVolume < boxVolume) {
      result = -1;
    } else {
      result = 0;
    }
    return result;
  }

  public void setDimens(double height, double weight, double width) {
    this.weight = weight;
    this.height = height;
    this.width = width;
  }

  Box increase(int i) {
    return new Box(weight * i, width * i, height * i);
  }
}
