package com.saniazt.Geniuses.NasledovanieOrder;

public class MainForOrder {
  public static void main(String[] args) {
    Orders order1 = new Orders(765182, 761.2, 14.1);
    System.out.println(order1.percentOfFee());
    order1.showOrderInfo();
  }
}
