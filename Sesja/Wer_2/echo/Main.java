package Wer_2.echo;

public class Main {

    public static <T> void echoIfEquivalent(T a, T b, T c){
        if(a.equals(b) && a.equals(c) && b.equals(c)){
            System.out.println("Wszystkie trzy są równoważne");
        }
        else {
            System.out.println("Elementy nie są równoważne");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Karolina", 22);
        Student s2 = new Student("Ania", 21);
        Student s3 = new Student("Basia", 22);
        Student s4 = new Student("Kasia", 22);
        echoIfEquivalent(s1, s2, s3);
        echoIfEquivalent(s1, s3, s4);
    }
}
