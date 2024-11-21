package Zad3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        for(double i=0; i<15; i++) {
            lista.add(i);
        }
        System.out.println(lista);
        System.out.println(Avg.average(lista));
    }
}
