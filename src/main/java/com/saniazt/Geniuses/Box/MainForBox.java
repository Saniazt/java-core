package com.saniazt.Geniuses.Box;

public class MainForBox {
  public static void main(String[] args) {
    Box box1 = new Box(12, 12, 91);
    box1.setHeight(12);
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
    System.out.println("----------------------------");
    Box box3 = new Box();
    box3.setDimens(12, 2, 4);
    box3.showInfo();
    System.out.println("----------------------------");
    BoxForMobile box4 = new BoxForMobile();
    box4.setDimens(3, 4, 1, 5);
    box4.showInfo();
  }
}
