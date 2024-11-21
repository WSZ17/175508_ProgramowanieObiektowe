package Zad4;

import java.util.ArrayList;

public class Merging {
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.addAll(list1);
        lista.addAll(list2);
        return lista;
    }
}
