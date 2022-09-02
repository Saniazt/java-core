package com.saniazt.enumPackage;

import java.awt.*;

public class Line extends Geom {
  Line(GeomType type) {
    this.type = type;
  }

  void GetLineMethod() {
    System.out.println("Class Line");
  }
}
