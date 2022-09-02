package com.saniazt.generic.nasledovanie;

public class Point3D<T3D> extends PointProp<T3D> {
  protected T3D x, y, z;

  protected Point3D(T3D x, T3D y, T3D z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
}
