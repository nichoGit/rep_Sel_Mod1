package com.qalabs.javabasics;

interface Vehicle {

    void speedUp();
    void printSpec();
}

class Tank implements Vehicle {
    private int speed;

    Tank() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 1;
        System.out.println(String.format("New speed %s", this.speed));
    }
    public void printSpec() {
        System.out.println("TANK");
    }
}
class Truck implements Vehicle{
    private int speed;
    Truck() {
        this.speed = 0;
    }
    public void speedUp(){
        this.speed += 3;
        System.out.println(String.format("New speed %s", this.speed));
    }
    public void printSpec() {
        System.out.println("TRUCK");
    }
}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.printSpec();

        Vehicle mytruck = new Truck();
        mytruck.printSpec();
    }
}
