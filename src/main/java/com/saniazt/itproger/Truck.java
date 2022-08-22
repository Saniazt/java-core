package com.saniazt.itproger;

public class Truck extends Transport {

  public Engine engine = new Engine();
  private boolean isLoaded;

  public Truck(int weight, byte[] coordinate) {
    super(weight, coordinate); // обращается к классу родителю
  }

  public Truck(int weight, byte[] coordinate, boolean isLoaded) {
    super(weight, coordinate); // обращается к классу родителю
    this.isLoaded = isLoaded;
  }

  @Override
  public void moveObject(float speed) {
    System.out.println("Our object is moving with speed: " + speed);
  }

  @Override
  public boolean stopObject() {
    this.speed = 0;
    return true;
  }

  public void setValues(
      float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
    super.setValues(speed, weight, color, coordinate);
    this.isLoaded = isLoaded;
  }

  @Override
  protected String getValues() {
    System.out.println(super.getValues());
    return getLoaded();
  }

  public void setLoaded(boolean loaded) {
    isLoaded = loaded;
  }

  public String getLoaded() {
    if (isLoaded) return ("Truck is loaded");
    else return ("Truck is not loaded");
  }
}
