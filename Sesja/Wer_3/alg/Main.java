package Wer_3.alg;

import java.util.TreeSet;

public class Main {

    public static <E> boolean isUnique(TreeSet<E> elements){
        if(elements == null || elements.size() == 0){
            throw new IllegalArgumentException("Pusty TreeSet");
        }
        return true;
    }

    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("Banana");
        ts1.add("Grapes");
        ts1.add("Apple");
        System.out.println(ts1);
        System.out.println(isUnique(ts1));
        ts1.add("Grapes");
        System.out.println(ts1);
        System.out.println(isUnique(ts1));
    }
}
