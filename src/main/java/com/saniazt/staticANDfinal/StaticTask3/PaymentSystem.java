package com.saniazt.staticANDfinal.StaticTask3;

public class PaymentSystem {
  private String PaymentSource;

  public String getPaymentSource() {
    return PaymentSource;
  }

  public void setPaymentSource(String paymentSource) {
    PaymentSource = paymentSource;
  }

  public void WhatPaymentSource(int Order) {
    System.out.println("Payment source for order " + Order + " is " + PaymentSource);
  }
}
