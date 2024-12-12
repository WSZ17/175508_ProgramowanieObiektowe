package Zad5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person[] ludzie = new Person[]{
                new Person("Adam", "Kowalski", LocalDate.parse("2001-09-13")),
                new Person("Barbara", "Grunała", LocalDate.parse("2012-03-08")),
                new Person("Karol", "Jarocki", LocalDate.parse("1999-11-13")),
                new Person("Michał", "Nowak", LocalDate.parse("1988-06-13")),
                new Person("Halina", "Grunała", LocalDate.parse("1976-12-13"))
        };

        System.out.println(Arrays.toString(ludzie));
        Arrays.sort(ludzie, new LastNameComparator());
        System.out.println(Arrays.toString(ludzie));
    }
}

class LastNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.lastName.compareTo(o2.lastName)==0){
            return o1.firstName.compareTo(o2.firstName);
        }
        else{
            return o1.lastName.compareTo(o2.lastName);
        }
    }
}