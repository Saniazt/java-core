package com.saniazt.test;

import java.util.Scanner;

public class ScannerUtils {
    public static int getNextInt() {
        Scanner str = new Scanner(System.in);
        int nextInt = str.nextInt();
        System.out.println(nextInt);
        return nextInt;
    }
}
