package Zad1;

public class Person {
    private String firstname;
    protected String lastname;

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public Person (String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void przedstawSie(){
        System.out.println("Nazywam sie " + getFirstName() + " " + getLastName());
    }
}
