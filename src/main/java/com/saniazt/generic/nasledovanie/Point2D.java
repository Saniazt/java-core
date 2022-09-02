package com.saniazt.generic.nasledovanie;

public class Point2D<T2D> extends PointProp<T2D> {
  protected T2D x, y;

  protected Point2D(T2D x, T2D y) {
    this.x = x;
    this.y = y;
  }
}
