package Cloneable_Zad;

import java.time.LocalDate;

public class Laptop implements Cloneable{
    String brand;
    String model;
    LocalDate purchaseDate;

    public Laptop(String brand, String model, LocalDate purchaseDate) {
        this.brand = brand;
        this.model = model;
        this.purchaseDate = purchaseDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", "GT-98", LocalDate.parse("2002-03-24"));
        Laptop l2 = null;
        try{
            l2 = (Laptop) l1.clone();
        }
        catch (CloneNotSupportedException c){
            System.out.println(c.getMessage());
        }
        finally {
            l1.purchaseDate = LocalDate.now();
        }
        System.out.println(l1.purchaseDate);
        System.out.println(l2.purchaseDate);
    }

}
