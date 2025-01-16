package Wyjatki_Zad;

import static java.lang.Integer.parseInt;

public class Main {
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
            if(!(dane.contains("@"))) {
                throw new NiepoprawnyFormatDanychException("Napis nie zawiera małpy");
            }
    }
    public static void main(String[] args) {
        try{
            sprawdzFormatDanych("Person");
        }
        catch (NiepoprawnyFormatDanychException n){
            System.out.println(n.getMessage());
        }
    }
}