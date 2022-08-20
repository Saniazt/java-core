package com.saniazt.firstTest1;


import java.util.Scanner;

public class Request {
   public static String name;
   public static  int age;

   public static String getName(){
       System.out.println("Hello, what is your name?");
       Scanner name_scam = new Scanner(System.in);
       name = name_scam.nextLine();
       return name;
   }

   public static int getAge(){
       System.out.println("How old are you, ?"+ name);
       Scanner age_scam = new Scanner(System.in);
       age = age_scam.nextInt();
       return age;
   }

   public static void info1(){
       if (age>18){
           System.out.println("You are so big!");
       }
       else System.out.println("You are very young boy!:)");
   }




}
