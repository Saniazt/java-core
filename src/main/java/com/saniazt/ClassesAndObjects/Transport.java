package com.saniazt.ClassesAndObjects;

public class Transport {
    // public доступен во всех классах
   // protected доступен только внутри этого класса + внутри классов наследников
    // private виден только в пределах этого класса
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(){} // конструктор по умолчанию для Truck и Car

    public Transport(float _speed, int _weight,String _color,byte[] _coordinate){
        System.out.println("Object created");
        setValues(_speed,_weight,_color,_coordinate);
        System.out.println(getValues());
    }

    public Transport(int weight, byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValues());
    }

    protected void setValues(float speed, int weight,String color,byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues(){
        String info = "Object speed: "+this.speed+". Weight: "+this.weight+". Color: "+this.color+". \n";
        String infoCoordinates = "Coordinates:\n";
        for(int i=0; i < coordinate.length; i++){
            infoCoordinates += coordinate[i]+"\n";
        }
        return info + infoCoordinates;
    }


}
