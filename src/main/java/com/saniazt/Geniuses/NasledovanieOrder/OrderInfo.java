package com.saniazt.Geniuses.NasledovanieOrder;

public abstract class OrderInfo {
  private int order_number;
  private double gross;
  private double fee;

  public OrderInfo(int order_number, double gross, double fee) {
    this.order_number = order_number;
    this.gross = gross;
    this.fee = fee;
  }

  public int getOrder_number() {
    return order_number;
  }

  public double getGross() {
    return gross;
  }

  public double getFee() {
    return fee;
  }

  public final double net() {
    return gross - fee;
  }

  public final void showOrderInfo() {
    System.out.println("Order number is " + order_number + ". Net is " + net());
  }

  public abstract double percentOfFee();
}
