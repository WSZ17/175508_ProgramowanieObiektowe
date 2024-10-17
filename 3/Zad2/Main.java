package Zad2;

public class Main {
    public static void main(String[] args){

        Car car = new Car();
        car.brand = "Opel";
        car.model = "Vectra";
        car.speed = 70;

        System.out.println(car.speed);

        car.accelerate(5);

        System.out.println(car.speed);

        car.decelerate(100);

        System.out.println(car.speed);

    }

}