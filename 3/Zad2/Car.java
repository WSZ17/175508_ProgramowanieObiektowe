package Zad2;

public class Car {

    public String brand;
    public String model;
    public int speed;

    public void accelerate(int value){
        this.speed += value;
    }

    public void decelerate(int value){
        if(value > speed){
            this.speed = 0;
        }
        else
            this.speed -= value;
    }

}
