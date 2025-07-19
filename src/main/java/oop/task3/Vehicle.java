package oop.task3;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    void move(){
        System.out.println("The " + this.getClass().getSimpleName()  + " has " + speed + "km/h speed.");
    }
}
