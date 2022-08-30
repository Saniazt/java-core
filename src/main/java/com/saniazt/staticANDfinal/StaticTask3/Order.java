package com.saniazt.staticANDfinal.StaticTask3;

public class Order extends PaymentSystem {
  private int invoice;
  private int orderID;
  static int countOfOrders;

  public Order(int invoice, int orderID) {
    this.invoice = invoice;
    this.orderID = orderID;
    countOfOrders++;
  }

  public int getInvoice() {
    return invoice;
  }

  public void setInvoice(int invoice) {
    this.invoice = invoice;
  }

  public int getOrderID() {
    return orderID;
  }

  public void setOrderID(int orderID) {
    this.orderID = orderID;
  }

  Order() {
    countOfOrders++;
  }

  public String showInfo() {
    return "Invoice is " + invoice + ". Order is " + orderID;
  }

  public static String howMuchOrders() {
    return "Orders count is " + countOfOrders;
  }
}
