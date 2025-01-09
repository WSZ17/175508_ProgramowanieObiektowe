package Zad6;

import java.util.InputMismatchException;

public class Main<T>{
    public static <T extends Comparable<T>> T minValue(T[] tab){
        if(tab.length == 0 || tab == null){
            throw new IllegalArgumentException("Pusta tablica, nie można wykonać operacji");
        }
        T min = tab[0];
        for(T obj: tab){
            if(min.compareTo(obj) > 0){
                min = obj;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String[] lis1 = {"String", "Napis", "Text"};
        Integer[] lis2 = {4, 8, 2};
        Double[] lis3 = {9.6, 3.5, 1.4};
        Double[] l4 = new Double[0];

        System.out.println(minValue(lis1));
        System.out.println(minValue(lis2));
        System.out.println(minValue(lis3));
        System.out.println(minValue(l4));
    }
}
