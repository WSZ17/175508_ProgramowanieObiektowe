package Zad1;

import java.util.Objects;

public class Student {
    public static String uczelnia = "UWM";
    public String imie;
    public String nazwisko;
    public double ocena;

    public Student(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", ocena=" + ocena +
                '}';
    }

    public void przedstaw_sie(){
        System.out.println("Nazywam się " + imie + " " + nazwisko + "i uczę się na " + uczelnia);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.ocena, ocena) == 0 && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, ocena);
    }

}

/*

    @Override
    public String toString(){
        return "Nazywam się " + imie + " " + nazwisko + "i uczę się na " + uczelnia;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Student o){
            return this.imie.equals(o.imie) && this.nazwisko.equals(o.nazwisko);
        }
        return false;
    }

    @Override
    public int hashCode(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }
 */
