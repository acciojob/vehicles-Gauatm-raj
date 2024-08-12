package com.driver;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Go");
        Car car=new Car("Honda",4,4,6,true,"Sedan",6);

        F1 mercedes = new F1("mercedes", false);

        mercedes.move(0, 0);
        mercedes.changeSpeed(0,0);
        mercedes.stop();
        mercedes.changeGear(1);
        mercedes.move(50,0);
        mercedes.changeSpeed(50,0);
        mercedes.changeGear(1);
        mercedes.move(75,0);

        mercedes.steer(60);

        Boat boat = new Boat("Sailor", 15);

    }
}