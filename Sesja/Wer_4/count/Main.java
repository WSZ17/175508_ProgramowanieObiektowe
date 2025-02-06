package Wer_4.count;

import java.util.LinkedList;

public class Main {
    public static <E extends Comparable<E>> int countGreaterThan(LinkedList<E> list, E element){
        int count = 0;
        for(E el:list){
            if(el.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("a");
        ll1.add("b");
        ll1.add("g");
        ll1.add("s");
        ll1.add("z");
        ll1.add("c");
        String st = new String("c");
        System.out.println(countGreaterThan(ll1,st));
    }
}
