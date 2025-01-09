package Zad3;

public class Triple <T, U, V>{
    T value1;
    U value2;
    V value3;

    public T getFirst() {
        return value1;
    }

    public U getSecond() {
        return value2;
    }

    public V getThird() {
        return value3;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    public void setValue3(V value3) {
        this.value3 = value3;
    }

    public static void main(String[] args) {
        Triple<String, Integer, Double> trip = new Triple<>();
        trip.setValue1("Stin");
        trip.setValue2(3);
        trip.setValue3(6.9);
        System.out.println(trip.getFirst());
        System.out.println(trip.getSecond());
        System.out.println(trip.getThird());
    }
}
