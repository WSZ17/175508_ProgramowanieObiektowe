import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable{
    String imie;
    double sredniaOcen;
    int rokUrodzenia;

    public Student(String imie, double sredniaOcen, int rokUrodzenia) {
        this.imie = imie;
        this.sredniaOcen = sredniaOcen;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return sredniaOcen + ", " + rokUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Adam", 4.0,1998));
        students.add(new Student("Adam", 3.0,1999));
        students.add(new Student("Adam", 4.0,1999));
        System.out.println(students);
        Collections.sort(students, new AvgGradeStudentComparator());
        System.out.println(students);
        students.sort(new YearOfBirthStudentComparator());
        System.out.println(students);

        Student s1 = new Student("A", 3.5, 2004);
        Student s2 = null;
        try{
            s2 = (Student) s1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Nie udało się sklonować studenta");
        }
        if(s2 == null){
            return;
        }
        s2.rokUrodzenia = 2006;
        System.out.println(s1.getRokUrodzenia());
    }

    /*@Override
    public int compareTo(Student o) {
        if(this.sredniaOcen > o.sredniaOcen) {
            return 1;
        }
        else if(this.sredniaOcen < o.sredniaOcen) {
            return -1;
        }
        else{
            return 0;
        }
    }*/

    /*@Override
    public int compareTo(Student o) {
        return Double.compare(this.sredniaOcen, o.sredniaOcen);
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Student o) {
        if(Double.compare(this.sredniaOcen, o.sredniaOcen) == 0){
            return Integer.compare(o.rokUrodzenia, this.rokUrodzenia);
        }
        else{
            return Double.compare(this.sredniaOcen, o.sredniaOcen);
        }
    }
}

class AvgGradeStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.sredniaOcen, o2.sredniaOcen);
    }
}

class YearOfBirthStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.rokUrodzenia, o1.rokUrodzenia);
    }
}
