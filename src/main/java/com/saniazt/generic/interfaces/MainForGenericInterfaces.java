package com.saniazt.generic.interfaces;

public class MainForGenericInterfaces {
  public static void main(String[] args) {
    Point2<Float> pp1 = new Point2<>();
    pp1.setCords(8.7f, 8.98f);

    System.out.println(pp1.getCords(TypeCoord.COORD_X));
    System.out.println(pp1.getCords(TypeCoord.COORD_Y));
  }
}
