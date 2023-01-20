package com.saniazt.lesson18;

public class StaticVariablesAndMethods {
    public static int variable; //поля и методы static - относятся к классу а не к обьекту
    public int variable2;

    static {
        variable = foo(); // логический блок, используется для инициализации полей
    }
    public static int foo(){ //static метод foo, является методом класса А НЕ ОБЬЕКТЫ
        System.out.println(variable);
        return 1;
    }
    public static void show(){
        System.out.println("No");
        foo();
    }
}
