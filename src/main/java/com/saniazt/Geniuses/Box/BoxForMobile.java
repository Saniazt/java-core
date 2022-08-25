package com.saniazt.Geniuses.Box;

public class BoxForMobile extends Box {
  private int count;

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.println(count);
  }

  public void setDimens(double height, double weight, double width, int count) {
    super.setDimens(height, weight, width);
    this.count = count;
  }

}
