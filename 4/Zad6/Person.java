package Zad6;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age){
        if(age > 0){
            this.age = age;
        }
        else{
            this.age = 0;
        }
        if(firstName == " " || firstName == null){
            firstName = " ";
        }
        this.firstName = firstName;
        if(lastName == " " || lastName == null){
            lastName = " ";
        }
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Age:" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
