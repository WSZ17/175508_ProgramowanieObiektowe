package Wer_2.checking;

import java.util.HashSet;

public class Main{
    public static <E> boolean checkDisjoint (HashSet<E> set1, HashSet<E> set2){
        if(set1 == null || set2 == null){
            throw new IllegalArgumentException("Przynajmniej jeden zestaw jest pusty");
        }
        for (E e1: set1) {
            for (E e2: set2) {
                if(e1.equals(e2)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashSet<String> st1 = new HashSet<>();
        HashSet<String> st2 = new HashSet<>();
        st1.add("Banana");
        st1.add("Apple");
        st2.add("Watermelon");
        st2.add("Grape");
        System.out.println(checkDisjoint(st1, st2));
    }
}
