package com.saniazt.Geniuses.NasledovanieOrder;

import java.util.ArrayList;

public class ArrayOrders extends Orders {
  public ArrayOrders(int order_number, double gross, double fee) {
    super(order_number, gross, fee);
  }

  public static void main(String[] args) {
    Orders order = new Orders(871, 2, 51);
    Orders order2 = new Orders(9218, 12, 12);

    ArrayList<Integer> ordersArray = new ArrayList<>();
    ordersArray.add(order.getOrder_number());

    for (int i : ordersArray) {
      System.out.println(ordersArray);
    }
  }
}
