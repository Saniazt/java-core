package com.saniazt.firstTest1;

import java.util.Scanner;

public class RequestTWO extends Request {
    public static double a, b;

    public static double request_int1() {
        System.out.println("So, " + name + " type your first number: ");
        Scanner int1_scam = new Scanner(System.in);
        a = int1_scam.nextDouble();
        return a;}

    public static double request_int2() {
        System.out.println("And, " + name + " type your second number: ");
        Scanner int2_scam = new Scanner(System.in);
        b = int2_scam.nextDouble();
        return b;}
}
