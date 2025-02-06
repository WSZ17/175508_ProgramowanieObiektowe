package Wer_3.vehicle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static <T extends Comparable<T>> boolean isDescending(T[] tab){;
        if(tab == null || tab.length == 0){
            throw new IllegalArgumentException("Pusta tablica - nie można wykonać operacji");
        }
        for(int i = 0; i < tab.length-1; i++){
            if(tab[i].compareTo(tab[i+1]) < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tab1 = {"A", "B", "C", "D"};
        String[] tab2 = {"D", "C", "B", "A"};
        String[] tab3 = {"A", "C", "B", "D"};
        String[] tab4 = {"C", "A", "D", "B"};
        Integer[] tab5 = {1,2,3,4,5};
        Integer[] tab6 = {5,4,3,2,1};
        Integer[] tab7 = {5,5,5,5,5};
        System.out.println(isDescending(tab1));
        System.out.println(isDescending(tab2));
        System.out.println(isDescending(tab3));
        System.out.println(isDescending(tab4));
        System.out.println("Liczby");
        System.out.println(isDescending(tab5));
        System.out.println(isDescending(tab6));
        System.out.println(isDescending(tab7));
    }
}
