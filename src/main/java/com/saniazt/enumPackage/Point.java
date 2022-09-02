package com.saniazt.enumPackage;

public class Point extends Geom {
  Point(GeomType type) {
    this.type = type;
  }

  void GetPointMethod() {
    System.out.println("Class Point");
  }
}
