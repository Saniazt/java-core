package com.saniazt.itproger;

public class Car extends Transport implements iLights {

  private boolean isOn;
  public Engine engine = new Engine();

  public Car(float _speed, int _weight, String _color, byte[] _coordinate) {
    super(_speed, _weight, _color, _coordinate);
  }

  public Car() {}
  ;

  @Override
  public void moveObject(float speed) {
    System.out.println("Our object is moving with speed: " + speed);
  }

  @Override
  public boolean stopObject() {
    this.speed = 0;
    return true;
  }

  @Override
  public void setLights(boolean set) {
    this.isOn = set;
  }

  @Override
  public void blinkLight() {
    System.out.println("Blinkiing");
  }
}
