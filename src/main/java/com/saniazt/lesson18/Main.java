package com.saniazt.lesson18;

public class Main {
    public static void main(String[] args) {
        StaticVariablesAndMethods s = new StaticVariablesAndMethods();
        StaticVariablesAndMethods s1 = new StaticVariablesAndMethods();
        StaticVariablesAndMethods s2 = new StaticVariablesAndMethods();

        StaticVariablesAndMethods.variable = 5;
        StaticVariablesAndMethods.foo();

    }
}
