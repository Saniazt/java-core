package com.saniazt.Order;

public class Main extends Invoice {
  public static void main(String[] args) {
    System.out.println(enterInvoice());
    Invoice.pm("SC");
    Invoice.settalite(671);
    Customer customer1 = new Customer("Olek", 18);
    customer1.info();
    Customer.Refferal referal = new Customer.Refferal();
    referal.no();
    System.out.println(Customer.paid(1, 2, 19));
  }
}
