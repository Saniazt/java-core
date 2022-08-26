package com.saniazt.Geniuses.FigureNasledovanie;

public class MainForFigure {
  public static void main(String[] args) {
    Rect rect = new Rect(5, 10);
    Rect rect2 = new Rect(5);
    Triange triange = new Triange(10);
    System.out.println(rect.area());
    System.out.println(rect2.area());
    System.out.println(triange.area());
  }
}
