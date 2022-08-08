package com.saniazt.proba01;
// создаем класс наследник
public class Student extends forPerson {
    int course = 1;

    public Student(int height, String name, int course) {
        super(height, name);
        this.course = course;
    }

    void tell() {
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(course);
    }
}

