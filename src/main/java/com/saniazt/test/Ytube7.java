package com.saniazt.test;

import javax.swing.*;
import java.util.Scanner;

public class Ytube7 {
    public static void main(String[] args) {



        Scanner first = new Scanner(System.in);
        System.out.println("Введите любую цифру");
        int a = first.nextInt();

        if (a > 10) {
            System.out.println("Вы ввели число больше 10");}
        else {
            System.out.println("Вы ввели меньше число 10");}
    }
}
