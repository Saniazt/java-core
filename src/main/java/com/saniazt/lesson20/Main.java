package com.saniazt.lesson20;

public class Main {
    public static void main(String[] args) {
    Music mc = Music.CLASSIC; //создание обьекта без new
        Months jan = Months.JANUARY;
       for(Music element: Music.values()){
           System.out.println(element);}
        System.out.println();
       //
    Music mc2 = Music.valueOf(Music.class,"ROCK"); //второй способ создания обьекта enum
        System.out.println(mc2);
        System.out.println(mc);
        System.out.println();
        //
    mc.ordinal(); //этот МЕТОД показывает нам цифру позицию обьекта
        System.out.println(mc.ordinal()); //CLASSIC у нас под позицией 0
        //
    switch (mc){
        case CLASSIC -> System.out.println("Classic");
        case POP -> System.out.println("Pop");
        case ROCK -> System.out.println("Rock");}

        System.out.println();
        System.out.println(mc.getI());
        System.out.println(mc.getName());

        mc.foo();
        jan.foo1();
    }


}
