package com.saniazt.lesson20;

public enum Music { //enum хранит в себе набор констант
    CLASSIC(5,"classic"),ROCK(8,"rock"),POP(12,"pop"); //это набор констант, и мы их обьявили как обьекты

    private int i;
    private String name;

    Music(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }
    public void foo(){
        System.out.println(Music.CLASSIC.getI());
        System.out.println(Music.CLASSIC.getName());
        System.out.println();
    }
}
