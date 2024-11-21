package Zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0; i<15; i++) {
            lista.add(i);
        }
        System.out.println(lista);
        zamianaArray.reverseArray(lista);
    }
}
