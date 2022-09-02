package com.saniazt.enumPackage;

public class MainForEnum {

  public static void main(String[] args) {
    final int N = 3;
    Geom[] g = new Geom[N];

    g[0] = new Line(GeomType.LINE);
    g[1] = new Point(GeomType.POINT);
    g[2] = new Line(GeomType.LINE);

    for (Geom fig : g) {
      String value = fig.type.getValue();
      System.out.println(value);
    }
  }
}
