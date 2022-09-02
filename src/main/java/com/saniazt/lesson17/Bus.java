package com.saniazt.lesson17;

public class Bus {
    public String model, color;
    public Engine engin;
    public Transmission transmission;
    public final String Serial_Number = "D242d92"; //константа с большой буквы
    public final int Serial_Number_2 = 12342; // константа с большой буквы + слова разделяется _

    public void go(){
        System.out.println("Go");
    }
    public String showKM(){ //этот метод возращает int
        int km = 65;
        String str = "70km";
        return str; //обязательно
    }

    public Engine showEngine(){
        engin = new Engine();
        return engin;
    }

    public void showKM2(int km2){
        km2 = km2 +2;
        System.out.println(km2);
    }

    public void showDistance(String distance1){
        distance1 = distance1 + " Ничего себе дистанция!";
        System.out.println(distance1);
    }
}
