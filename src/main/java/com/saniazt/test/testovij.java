package com.saniazt.test;

import java.util.Scanner;

public class testovij {
    public static void main(String[] args) {
        System.out.println("Привет, как тебя зовут?");
        Scanner n1 = new Scanner(System.in);
        String name;
        name = n1.nextLine();
        System.out.println("Какая у тебя сейчас погода, " + name + "?");
        int n;
        Scanner n2 = new Scanner(System.in);
        n = n2.nextInt();

        if (n > 20) {
            System.out.println("Погода прекрасная, можно идти в футболке!!");
        }
        else if (n < 20 && n>=0) {
            System.out.println("Лучше взять кофту");
        }
        else {
            System.out.println("Попробуй еще раз, хорошего дня:)");

        }

        }

    }
