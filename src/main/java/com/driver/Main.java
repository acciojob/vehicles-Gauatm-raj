package com.driver;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Go");
        Car car=new Car("Honda",4,4,5,true,"Sedan",6);

        F1 mercedes = new F1("mercedes", false);

        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        mercedes.steer(30);
        mercedes.accelerate(129);
        Boat boat = new Boat("Sailor", 15);

    }
}