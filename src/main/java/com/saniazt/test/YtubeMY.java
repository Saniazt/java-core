package com.saniazt.test;

import org.w3c.dom.Text;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.StringJoiner;


public class YtubeMY
{
    public static void main(String[] args) {
        System.out.println("Hello, lets play the game, What is Your name?");
        Scanner str = new Scanner(System.in);
        Str zero;
        zero = String.nextLine();

        Scanner num = new Scanner(System.in);
        int first, second;

        do {
            System.out.println("Enter your first number:");
            first = num.nextInt();
            if (first == 0)
                System.out.println("Cannot be 0, choose another number");
        }
        while (first == 0);

        System.out.println("Enter your second number:");
        second = num.nextInt();
        if (first > second)
            System.out.println("Great!"+first+">"+second);
        else
            System.out.print("bad luck");
        switch (first){
            case 0:
                System.out.println("Zero cannot be accepted");
                break;
        }

    }
}
