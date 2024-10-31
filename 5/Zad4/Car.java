package Zad4;

public class Car extends Vehicle{

    public String name;

    public Car(String name){
        this.name = name;
    }

    /*@Override
    public void drive(){
        System.out.println("The car is moving.");
    }*/

    @Override
    public void drive(){
        super.drive();
        System.out.println(name);;
    }
}
