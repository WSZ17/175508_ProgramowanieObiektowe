package Zad_5;

public class TestPerson {
    public static <T extends Person> boolean compareObjects(T ob1, T ob2){
        if(ob1.getClass() == ob2.getClass()){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(compareObjects(p1,p2));
        System.out.println(compareObjects(s1,p1));
        System.out.println(compareObjects(s1,p2));
        System.out.println(compareObjects(s1,s2));
    }
}
