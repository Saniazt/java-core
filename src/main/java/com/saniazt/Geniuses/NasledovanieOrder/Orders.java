package com.saniazt.Geniuses.NasledovanieOrder;

public class Orders extends OrderInfo {
  public Orders(int order_number, double gross, double fee) {
    super(order_number, gross, fee);
  }

  @Override
  public double percentOfFee() {
    return (getFee() / getGross());
  }
}
