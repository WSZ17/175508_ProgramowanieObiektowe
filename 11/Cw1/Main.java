package Cw1;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Filemon");
        String napis = "Cześć!";

        wypisz(animal);
        wypisz(napis);
    }

    public static <T> void wypisz(T object){
        System.out.println(object);
    }
}
