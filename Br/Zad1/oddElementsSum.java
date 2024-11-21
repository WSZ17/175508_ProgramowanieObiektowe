package Zad1;

import java.util.ArrayList;

public class oddElementsSum {

    public static int oddElementsSuma(ArrayList<Integer> lista){
        int suma = 0;
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i)%2!=0){
                suma += lista.get(i);
            }
        }
        return suma;
    }
}
