package com.saniazt.lesson17;

public class Main {
  public static void main(String[] args) {
    Bus bus = new Bus();
    System.out.println(bus.showKM());
    System.out.println(bus.showEngine());
    int km2 = 98;
    bus.showKM2(km2);
    String distance1 = "78";
    bus.showDistance(distance1);
  }
}
