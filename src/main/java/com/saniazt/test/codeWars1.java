package com.saniazt.test;

public class codeWars1 {


        public static String bmi(double weight, double height) {
            double bmi1 = weight/(height*height);
            if (bmi1  <= 18.5) {
                return "Underweight";
            } else if (bmi1  <= 25.0) {
                return "Normal";
            } else if (bmi1 <= 30.0) {
                return "Overweight";
            } else if (bmi1  > 30) {
                return "Obese";
            } else {
                return "";
            }
        }
    }

