package com.saniazt.test;

import java.util.Scanner;

public class Ytube {
    public static void main(String[] args) {
        float num1 = 18.2f;
        int num2 = 5;

        Scanner str = new Scanner(System.in);
        int nextInt1 = str.nextInt();
        System.out.println(nextInt1);
        int nextInt = ScannerUtils.getNextInt();
        System.out.println("So we have:");
        System.out.println((num1 + num2) / nextInt*nextInt1);

    }

}
