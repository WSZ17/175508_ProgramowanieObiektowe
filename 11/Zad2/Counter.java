package Zad2;

import java.util.ArrayList;

public class Counter<T>{
    private ArrayList<T> lista = new ArrayList<>();
    private int count = 0;

    public void add (T element){
        this.lista.add(element);
        count += 1;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Counter<String> counter = new Counter();
        counter.add("String");
        counter.add("Napis");
        System.out.println(counter.getCount());
    }
}
