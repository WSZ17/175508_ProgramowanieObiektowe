package Zad2;

public class Laptop extends ElectronicDevice{

    public Laptop(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Włączono laptop");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączono laptop");
    }
}
