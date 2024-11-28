package Zad2;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Zielona",14,"11-700", "Mrągowo");
        Person person = new Person("Agata", "Kowalska", new Address("Zielona",14,"11-700", "Mrągowo"));
        Person person2 = new Person("Jan", "Nowak", address);
        System.out.println(person);
        System.out.println(person2);

    }
}
