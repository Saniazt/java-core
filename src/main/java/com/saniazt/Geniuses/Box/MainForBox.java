package com.saniazt.Geniuses.Box;

public class MainForBox {
  public static void main(String[] args) {
    Box box1 = new Box(10, 21, 21);
    Box box2 = box1.increase(3);
    box1.showVolume();
    box2.showVolume();
    int result = box1.compare(box2);
    switch (result) {
      case -1:
        System.out.println("Our box is smaller");
        break;
      case 1:
        System.out.println("Our box is bigger");
        break;
      case 0:
        System.out.println("Boxed are equal");
        break;
    }
  }
}
