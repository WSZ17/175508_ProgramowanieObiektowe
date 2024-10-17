package Zad5;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName){
        this(firstName, lastName, 0);
    }

    public static void main(String[] args){
        Person perso = new Person("Elżbieta", "Kowalska");
        System.out.println(perso.firstName);
        System.out.println(perso.lastName);
        System.out.println(perso.age);

    }

}
