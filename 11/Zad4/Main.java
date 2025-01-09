package Zad4;

import java.util.ArrayList;

public class Main<T> {

    public static <T> void printArray(T[] list){
        for(T obj : list){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Integer[] tab = {5, 8, 1};
        String[] tab2 = {"St", "ri", "ng"};
        printArray(tab);
        printArray(tab2);
    }
}
