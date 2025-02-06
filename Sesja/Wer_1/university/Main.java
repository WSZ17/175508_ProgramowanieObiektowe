package Wer_1.university;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("John", 3.5));
        list.add(new Student("Alex", 4.2));
        list.add(new Student("Sarah", 3.9));
        list.add(new Student("Sarah", 3.9));
        list.add(new Student("Sarah", 3.9));
    }

    public static <T>  int countElements(Collection<T> items, T element){
        int counter = 0;
        for (var el:items) {
            if(el.equals(element)){
                counter++;
            }
        }
        return counter;
    }
}
