package com.saniazt.proba01;

public class Proba2 {
    public static void main(String[] args) {
        System.out.println(new Proba().summm);

        int d = new Proba().c;
        System.out.println(d);

        System.out.println(new Proba().f);

        System.out.println(new Proba().g);

        Proba sasha = new Proba(); // создаем в нашем ЭТОМ файле обьект класса проба которые находится в Proba

        System.out.println("Вес Саши: " + sasha.moi_ves + "; Рост Саши: "+ sasha.moy_rost);

        System.out.println();

       sasha.vivod("Sashas");

        sasha.scan_main();

       //  Proba.say("George");так выводим если добавить static в Proba
        new Proba().say("George"); // так без static






    }


}
