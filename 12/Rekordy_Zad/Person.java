package Rekordy_Zad;

public record Person(String imie, int wiek) {
    public Person{
        if(wiek<0){
            throw new IllegalArgumentException("Wartości ujemne nie są obsługiwane");
        }
    }
}
