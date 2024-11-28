package Zad4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> oceny = new ArrayList<>();
        for(int i=1; i<7; i++){
            oceny.add(i);
        }
        Student student = new Student("Jaś", "Nowacki", oceny);
        System.out.println(student.averageGrades());
    }
}
