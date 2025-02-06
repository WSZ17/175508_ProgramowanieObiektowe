package Wer_1.moto;

public class Main {

    public static <T extends Comparable<T>> T maxValue(T[] tab){
        if(tab == null || tab.length == 0){
            throw new IllegalArgumentException("Funkcja nie przyjmuje pustych tablic");
        }
        T max = tab[0];
        for(var el: tab){
            if(el.compareTo(max) > 0){
                max = el;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Vehicle[] list = new Vehicle[]{
                new Vehicle("Opel", 80),
                new Vehicle("Skoda", 60),
                new Vehicle("Hyundai", 70),
                new Vehicle("Fiat", 50),
                new Vehicle("Ford", 40),
        };
        for (var el :list) {
            System.out.println(el);
        }
        System.out.println(maxValue(list));
    }
}
