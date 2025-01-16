package Statycznosc_Zad;

import java.util.Arrays;

public class Main<T>{
    public static <T extends Comparable<T>> T sortAndReturnFirst(T[] table) throws EmptyArrayExcepction {
        if(table == null || table.length == 0){
            throw new EmptyArrayExcepction("Nie można");
        }
        Arrays.sort(table);
        return table[0];
    }
}