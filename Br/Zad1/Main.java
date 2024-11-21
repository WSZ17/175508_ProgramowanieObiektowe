package Zad1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0; i<15; i++){
            lista.add(i);
        }
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println(oddElementsSum.oddElementsSuma(lista));
    }

}
