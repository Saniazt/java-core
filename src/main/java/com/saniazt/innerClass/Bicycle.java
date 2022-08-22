package com.saniazt.innerClass;

// Пример внутренего класса
public class Bicycle {
  private String model;
  private int weight;
  private double size;

  public Bicycle(String model, int weight, double size) {
    this.model = model;
    this.weight = weight;
    this.size = size;
  }

  public void start() {
    System.out.println("Поехали");
  }

  public class HandleBar {
    public void right() {
      System.out.println("Руль направо");
    }

    public void left() {
      System.out.println("Руль влево");
    }
  }

  public class Seat {
    public void up() {
      System.out.println("Сидение поднято");
    }

    public void down() {
      System.out.println("Сидение опустилось");
    }
  }

  public class Korzina {
    public void take() {
      System.out.println("Корзина взята");
    }

    public void not_take() {
      System.out.println("Зачем нам та корзина!)");
    }
  }
}
