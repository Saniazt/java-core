package com.saniazt.generic;

public class Point<T extends Number> { // в Т нельзя примитивные типы
  public T x, y;

  public Point(T x, T y) {
    this.x = x;
    this.y = y;
  }

  public T getX() {
    return x;
  }

  public T getY() {
    return y;
  }

  Object[] getCords() {
    return new Object[] {x, y};
  }

  double getMax() {
    double xd = x.doubleValue();
    double yd = y.doubleValue();
    return (xd < yd) ? yd : xd;
  }

  boolean equalsPoint(
      Point<? extends Number>
          p1) { // ? здесь это метасимвольный аргумент, тк мы не знаем какой тип данных будет + мы
    // поставили ограничения этому аргументу
    return (this.x.doubleValue() == p1.x.doubleValue())
        && this.y.doubleValue() == p1.y.doubleValue();
  }
}
