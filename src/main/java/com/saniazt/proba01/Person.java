package com.saniazt.proba01;

public class Person {



    public static void main(String[] args) {
        forPerson Sasha = new forPerson(175,"sasha");
        System.out.println(Sasha.name + "'s height is " + Sasha.height);

        forPerson Rita = new forPerson();
        System.out.println("Rita's height: "+Rita.height);

        forPerson Dima = new forPerson("Dima");
        System.out.println(Dima.name);
        System.out.println("");

        Student freshman = new Student(176, "Viktor",2);
        freshman.tell();

        Student freshman2 = new Student(181, "Vlad",4);
        freshman2.tell();


    }
}