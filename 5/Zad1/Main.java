package Zad1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Kowalski", 7);
        Person person = new Person("Stefan", "Nowak");
        person.przedstawSie();
        employee.przedstawSie();
    }
}
