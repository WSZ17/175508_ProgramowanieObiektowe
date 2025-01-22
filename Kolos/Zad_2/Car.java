package Zad_2;

import java.util.Comparator;

public class Car{
    String brand;
    int milage;
    int yearOfProduction;

    public Car(String brand, int milage, int yearOfProduction) {
        this.brand = brand;
        if(milage < 0){
            throw new IllegalArgumentException("Ujemna liczba");
        }
        else {
            this.milage = milage;
        }
        if (yearOfProduction < 0){
            throw new IllegalArgumentException("Ujemna liczba");
        }
        else{
            this.yearOfProduction = yearOfProduction;
        }
    }

    @Override
    public String toString() {
        return brand + " " + milage + " " + yearOfProduction;
    }

}

class MilageComparator implements Comparator<Car>{

    @Override
    public int compare(Car c1, Car c2) {
        return Integer.compare(c1.milage, c2.milage);
    }
}
