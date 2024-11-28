package Zad;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Anna", -1);
        Person p2 = new Person("Anna", 23);
        Person p3 = new Person("Anna", 26);
        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1.imie());
        p1.przedstaw_sie();
    }
}
