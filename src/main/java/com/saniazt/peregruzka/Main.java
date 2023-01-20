package com.saniazt.peregruzka;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int summ(int a, int b){
        return a+b;
    }
    public static int summ(int a, int b, int g){
        return a+b+g;
    }


        public static String makeReadable(int seconds) {
        if(seconds == 0) return "00:00:00";
        else {
            Duration duration = Duration.ofSeconds(seconds);
            String hours = String.format("%02d",duration.toHours());
            String minutes = String.format("%02d",duration.toMinutesPart());
            String seconds2 = String.format("%02d",duration.toSecondsPart());
            return hours + ":" + minutes + ":" + seconds2;
        }
        }



    public static void main(String[] args) {
        System.out.println(summ(12,20));
        System.out.println(summ(12,20,20));
        System.out.println(makeReadable(5));
    }
}
