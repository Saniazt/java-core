package com.saniazt.generic.nasledovanie;

public class MainForExtendGen {
  public static void main(String[] args) {
    Point2D<Integer> ph1 = new Point2D<>(1, 6);
    Point3D<Float> ph2 = new Point3D<>(1.7f, 8f, 8.2f);
    PointProp<Double> ph3 = new Point3D<>(3.9, 2.8, 4.8);

    if (ph3 instanceof Point3D<?>) System.out.println("ph3 is point2d object");
    // instanceof проверяет принадлежность к классу

    ((Point2D<Integer>) ph1).x = 5;
  }
}
