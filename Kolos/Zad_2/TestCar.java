package Zad_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestCar {
    public static void main(String[] args) {
        ArrayList<Car> samochody = new ArrayList<>();
        samochody.add(new Car("Honda", 190000, 2012));
        //list.add(new Car("Toyota", -90, 2016));
        samochody.add(new Car("Toyota", 200000, 2016));
        //list.add(new Car("Opel", 2000000, -2012));
        samochody.add(new Car("Opel", 110000, 2006));

        System.out.println(samochody);
        samochody.sort(new MilageComparator());
        System.out.println(samochody);
    }
}
