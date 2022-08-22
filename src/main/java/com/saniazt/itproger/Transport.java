package com.saniazt.itproger;

public abstract class Transport {
  // public доступен во всех классах
  // protected доступен только внутри этого класса + внутри классов наследников
  // private виден только в пределах этого класса
  protected float speed;
  private int weight;
  private String color;
  private byte[] coordinate;

  public Transport() {} // конструктор по умолчанию для Truck и Car

  public Transport(float _speed, int _weight, String _color, byte[] _coordinate) {
    System.out.println("Object created");
    setValues(_speed, _weight, _color, _coordinate);
    //   System.out.println(getValues());
  }

  public Transport(int weight, byte[] coordinate) {
    this.weight = weight;
    this.coordinate = coordinate;
    // System.out.println(getValues());
  }

  public abstract void moveObject(float speed); // это абстрактный метод, их не нужно реализовывать

  public abstract boolean stopObject();

  protected void setValues(float speed, int weight, String color, byte[] coordinate) {
    this.speed = speed;
    this.weight = weight;
    this.color = color;
    this.coordinate = coordinate;
  }

  protected String getValues() {
    String info =
        "Object speed: "
            + this.speed
            + ". Weight: "
            + this.weight
            + ". Color: "
            + this.color
            + ". \n";
    String infoCoordinates = "Coordinates:\n";
    for (int i = 0; i < coordinate.length; i++) {
      infoCoordinates += coordinate[i] + "\n";
    }
    return info + infoCoordinates;
  }

  class Engine {
    private boolean isReady;
    private int km;

    public void setValues(boolean isReady, int km) {
      this.isReady = isReady;
      this.km = km;
    }

    public void isReady(boolean isReady) {
      this.isReady = isReady;
    }

    public void info() {
      if (isReady) System.out.println("Engine is OK");
      else System.out.println("Engine is not working, probeg is " + km + " km");
    }
  }
}
