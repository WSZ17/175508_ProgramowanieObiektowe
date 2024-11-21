package Zad4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista_1 = new ArrayList<>();
        for(int i=0; i<15; i++) {
            lista_1.add(i);
        }
        ArrayList<Integer> lista_2 = new ArrayList<>();
        for(int i=15; i<30; i++) {
            lista_2.add(i);
        }
        System.out.println(lista_1);
        System.out.println(lista_2);
        System.out.println(Merging.mergeArrays(lista_1,lista_2));
    }
}
