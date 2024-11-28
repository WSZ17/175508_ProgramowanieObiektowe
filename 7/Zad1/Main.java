package Zad1;

public class Main {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Droga Królów", "Brandon Sanderson", 45.90, 2015);
        BookDTO b2 = new BookDTO("Z mgły zrodzony", "Brandon Sanderson", 39.90, 2013);
        BookDTO b3 = new BookDTO("Tajemnica Diabelskiego Kręgu", "Anna Kańtoch", 30.00, 2012);
        BookDTO b4 = new BookDTO("Czarnoksiężnik z Archipelagu", "Ursula K. Le Gui", 22.70, 1968);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
