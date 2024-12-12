package Zad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return  name + ", " + price;
    }

    public static void main(String[] args) {
        ArrayList<Product> produkty = new ArrayList<>();
        produkty.add(new Product(12, "Szczotka", 12.50));
        produkty.add(new Product(34, "Pasta", 1.50));
        produkty.add(new Product(81, "Kubek", 19.99));
        produkty.add(new Product(28, "Mydło", 2.45));
        produkty.add(new Product(95, "Gąbka", 3.15));
        produkty.add(new Product(57, "Nić dentystyczna", 2.45));

        System.out.println(produkty);
        produkty.sort(new ProductComparator());
        System.out.println(produkty);
    }
}

class ProductComparator implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        if(Double.compare(o1.price, o2.price) == 0){
            return Integer.compare(o1.id,o2.id);
        }
        else
            return Double.compare(o1.price,o2.price);
    }

}
