package com.saniazt.ClassesAndObjects;

public class Truck extends Transport {

    private boolean isLoaded;
    public Truck(int weight, byte[] coordinate){
        super(weight,coordinate); //обращается к классу родителю
    }
    public Truck(int weight, byte[] coordinate,boolean isLoaded){
        super(weight,coordinate); //обращается к классу родителю
        this.isLoaded = isLoaded;
    }
    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }

    public void getLoaded(){
        if(isLoaded)
            System.out.println("Truck is loaded");
        else
            System.out.println("Truck is not loaded");
    }
}
