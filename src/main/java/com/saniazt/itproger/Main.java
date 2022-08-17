package com.saniazt.itproger;

public class Main {
    public static void main(String[] args) {
//   Car bmw = new Car(250.5f,2500,"White",new byte[]{0,0,0});
//   bmw.engine.setValues(false,2000);
//   bmw.engine.info();
//
//   Truck truck = new Truck(5600,new byte[]{100,2,1});
//   truck.engine.setValues(true,500);
//   truck.engine.info();
    //truck.setValues(250.5f,2500,"White",new byte[]{0,0,0},true);
      //  System.out.println(truck.getValues());

//        Car flyCar = new Car(250.5f,2500,"White",new byte[]{0,0,0}){
//            @Override
//            public void moveObject(float speed) {
//                super.moveObject(speed);
//
//                this.engine.isReady(true);
//                System.out.println("Car if flying");
//            }
//        };
//        flyCar.moveObject(450);

        Car mercedes = new Car();

        mercedes.setLights(true);
        mercedes.blinkLight();
    }
}
