package Zad1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
    String name;
    double salary;
    LocalDate employmentDate;

    public Employee(String name, double salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    @Override
    public String toString() {
        return name + ", " + salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    public static void main(String[] args) {
        ArrayList<Employee> pracownicy = new ArrayList<>();
        pracownicy.add(new Employee("Anna", 9000, LocalDate.parse("2008-12-31")));
        pracownicy.add(new Employee("Maciej", 9200, LocalDate.parse("2007-01-10")));
        pracownicy.add(new Employee("Bartosz", 8100, LocalDate.parse("2004-07-14")));
        pracownicy.add(new Employee("Tymoteusz", 7000, LocalDate.parse("2010-09-21")));
        pracownicy.add(new Employee("Karolina", 9500, LocalDate.parse("2000-03-18")));

        System.out.println(pracownicy);
        Collections.sort(pracownicy);
        System.out.println(pracownicy);

    }
}
