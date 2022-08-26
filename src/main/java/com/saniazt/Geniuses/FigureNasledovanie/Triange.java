package com.saniazt.Geniuses.FigureNasledovanie;

public class Triange extends Figure {
  private double c;

  Triange(double a, double b, double c) {
    super(a, b);
    this.c = c;
  }

  public Triange(double size) {
    super(size, size);
    this.c = size;
  }

  @Override
  public double area() {
    double p = (getA() + getB() + c) / 2;
    double s = p * (p - getA()) * (p - getB()) * (p - c);
    return Math.sqrt(s);
  }
}
