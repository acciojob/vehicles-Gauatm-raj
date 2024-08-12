package com.driver;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle", 5);
        System.out.println("Vehicle Name: " + vehicle.getName());
        System.out.println("Vehicle Capacity: " + vehicle.getCapacity());

        // Car object
        Car car = new Car("Sedan",4,4,6,true,"Sedan",4,4);
        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Capacity: " + car.getCapacity());
        System.out.println("Car Doors: " + car.getDoors());

        // F1 object
        F1 f1 = new F1("F1 Car", 2, 2, 350,false);
        System.out.println("F1 Car Name: " + f1.getName());
        System.out.println("F1 Car Capacity: " + f1.getCapacity());
        System.out.println("F1 Car Doors: " + f1.getDoors());
        System.out.println("F1 Car Top Speed: " + f1.getTopSpeed() + " km/h");

        // Boat object
        Boat boat = new Boat("Sailor", 15);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }
}