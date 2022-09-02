package com.saniazt.generic;

public class MainForPoint {
  public static void main(String[] args) {
    Point<Float> p1 = new Point<>(5f, 19f);
    Point<Double> p2 = new Point<>(5.0, 19.0);

    System.out.println(p1.getX() + " and " + p1.getY());
    System.out.println(p2.x + " and " + p2.y);

    for (Object cord : p1.getCords()) System.out.println((Float) cord);

    double max = p1.getMax();
    System.out.println(max);

    System.out.println(p1.equalsPoint(p2));

    // для обобщенного метода:
    Short ar[] = {1, 2, 3, 4};
    Short val = 4;
    boolean flIn = MathForGeneric.isIn(val, ar);
    System.out.println(flIn);

    // для обобщенного констуруктора:
    Digit d1 = new Digit(10);
    Digit d2 = new Digit(12.4);
    Digit d3 = new Digit(10.48f);
    System.out.println(d1.value + " " + d2.value + " " + d3.value);
  }
}
