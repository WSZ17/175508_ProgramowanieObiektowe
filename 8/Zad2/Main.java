package Zad2;

import java.awt.image.SampleModel;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> devices = new ArrayList<>();
        devices.add(new Laptop("Lenovo", "GT-970", 2021));
        devices.add(new Television("LG", "J-80", 2020));
        devices.add(new Smartphone("Xiaomi", "Poco M3", 2022));
        devices.add(new Smartphone("Samsung", "Galaxy L3", 2022));
        devices.add(new Laptop("Dell", "375GT", 2024));

        for(ElectronicDevice ed: devices){
            ed.turnOn();
            ed.turnOff();
        }
    }
}
