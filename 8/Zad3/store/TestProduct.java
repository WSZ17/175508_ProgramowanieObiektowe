package Zad3.store;

import Zad3.Book;
import Zad3.Clothing;

import java.util.ArrayList;

public class TestProduct {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Book());
        products.add(new Book());
        products.add(new Book());
        products.add(new Clothing());
        products.add(new Clothing());

        for(Product p: products){
            System.out.println(p.getPrice());
        }
    }
}
