package Zad1;

public class Employee extends Person{

    public int lataPracy;
    public Employee(String firstname, String lastname, int lataPracy){
        super(firstname,lastname);
        this.lataPracy = lataPracy;
    }

    @Override
    public void przedstawSie() {
        super.przedstawSie();
        System.out.print("i pracuję od " + this.lataPracy + " lat.");
    }
}
