package com.saniazt.proba01;

import java.util.Scanner;

public class Proba {

   public int summm = 100;

   public int c = 4+5;

   public float f = 5.6f;

  public float g = summm+f;


    public double moi_ves =  59.5;
    public double moy_rost = 169;

public void vivod(String name){
    System.out.println(name + moi_ves + moy_rost);
}

public void scan_main(){
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Введите первое число: ");
    int n = scan1.nextInt();
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Введите второе число");
    int n2 = scan2.nextInt();
    int n3 =n+n2;
    System.out.println("Сумма ваших чисел: "+n3);
    if (n>n2){
        System.out.println("А так же, первое число больше второго;"+n+">"+n2);
    }
    else {
        System.out.println("А так же, второе число больше первое;"+n2+"<"+n);
    }

}






   public void say(String name){
       System.out.println("Hello, "+name);
   }




    }




