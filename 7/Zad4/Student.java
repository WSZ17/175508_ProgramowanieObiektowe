package Zad4;

import java.util.ArrayList;

public record Student(String imie, String nazwisko, ArrayList<Integer> oceny) {

    /*public double avgGr(){
        int wynik = 0;
        int count = 0;
        for(int i=0; i<this.oceny.length; i++) {
            wynik += this.oceny[i];
            count += 1;
        }
        return wynik/count;
    }*/
    public double averageGrades() {
        int wynik = 0;
        int count = 0;
        for (int i = 0; i < this.oceny.size(); i++) {
            wynik += this.oceny.get(i);
            count += 1;
        }
        return wynik / count;
    }
}
