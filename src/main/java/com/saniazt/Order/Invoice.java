package com.saniazt.Order;

import java.util.Scanner;

public abstract class Invoice {
    public static String enterInvoice(){
        System.out.println("Enter invoice number: ");
        Scanner scanInv = new Scanner(System.in);
        int invoice = scanInv.nextInt();
        return ("Invoice number is: "+invoice);
        }

    public static void pm(String Payment_Method){
        System.out.println("Payment method is: "+Payment_Method);
        }


    public static void settalite(int a){
        if(a>10)
            System.out.println("Settelite is BIG");
        else System.out.println("Settelite is SMALL");
    }





}
