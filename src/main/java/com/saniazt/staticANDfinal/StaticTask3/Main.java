package com.saniazt.staticANDfinal.StaticTask3;

public class Main {
  public static void main(String[] args) {
    PaymentSystem paymentSystem = new PaymentSystem();
    Order o1 = new Order();
    o1.setInvoice(981);
    o1.setPaymentSource("Paypal");
    o1.setOrderID(816);
    System.out.println(o1.showInfo());
    System.out.println(Order.howMuchOrders());
    Order o2 = new Order(1827, 129);
    o2.showInfo();
    System.out.println(Order.howMuchOrders());
    o1.WhatPaymentSource(o1.getOrderID());
    String ss = "My name is Sasha";
    StringBuffer sb = new StringBuffer();
    sb.append(ss).append(";").append(98);
    System.out.println(sb);
    sb.delete(4, 5);
    System.out.println(sb);
  }
}
