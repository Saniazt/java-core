package com.saniazt.test;

import org.w3c.dom.Text;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.StringJoiner;


public class YtubeMY
{
    public static void main(String[] args) {

            System.out.println("Hello, lets play the game, What is Your name?");


            Scanner scanner1 = new Scanner(System.in);
            String name;
            name = scanner1.nextLine();
        System.out.println("Nice to meet you, "+name+". How old are you,"+name+"?");

        Scanner scanner2 = new Scanner(System.in);
        Integer age;
        age = scanner2.nextInt();
        if (age < 0)
            System.out.println("Looks like you are so young!");
        if (age >= 18)
            System.out.println("Great age with great opportunities!");




        Scanner num = new Scanner(System.in);
        double first, second;


        do {
            System.out.println("Okey "+name+" Enter your first number:");
            first = num.nextDouble();
            if (first == 0)
                System.out.println("Cannot be 0, choose another number");
        }
        while (first == 0);

        System.out.println("Perfect, "+name+" Enter your second number:");
        second = num.nextDouble();
        if (first > second)
            System.out.println("Great!"+first+">"+second);
        else
            System.out.print("bad luck");



    }
}
