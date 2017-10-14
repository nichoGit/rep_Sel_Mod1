package com.qalabs.javabasics;


class Bike {
    private String brand;
    private int speed;

    Bike(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    void speedUp (String brand){
        if (brand.equals("road bike")){
            this.speed += 5;
            System.out.println(String.format("%s speed %d", this.brand, this.speed));
        }else if (brand.equals("mountain bike")){
            this.speed += 3;
            System.out.println(String.format("%s speed %d", this.brand, this.speed));
        }else{
            this.speed += 1;
            System.out.println(String.format("%s speed %d", this.brand, this.speed));
        }

    }

    void speedUp() {
        this.speed += 1;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }

    void speedUp(int speed1) {
        this.speed += speed1 ;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }

    String getBrand (){
        return this.brand;
    }
}

class MountainBike extends Bike {
    private int seatHeight;

    MountainBike(String brand) {
        super(brand);
        this.seatHeight = 0;
    }

    public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
    }
}

class roadBike extends Bike {

    roadBike(String brand) {
        super(brand);
    }

}


public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
       //Bike bike = new Bike("bike");
       //bike.speedUp();

        // Hold mountain bike instance into same bike variable, no problem
        roadBike bike = new roadBike("road bike");
        bike.speedUp(bike.getBrand());
        //System.out.println(bike.getBrand());
    }
}
