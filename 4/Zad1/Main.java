package Zad1;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Stefan", "Kowalski");
        Student student2 = new Student("Karolina", "Kozłowska");
        Student student3 = new Student("Karolina", "Kozłowska");

        //System.out.println(Student.uczelnia);

        /*student1.przedstaw_sie();
        Student.uczelnia = "ART";
        student1.przedstaw_sie();
        student2.przedstaw_sie();
         */

        System.out.println(student1);
        System.out.println(student1.equals(student2));
        System.out.println(student3.equals(student2));
        System.out.println(student2.hashCode() + " " + student3.hashCode());
    }
}
