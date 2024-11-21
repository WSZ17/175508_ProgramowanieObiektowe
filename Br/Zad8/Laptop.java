package Zad8;

public class Laptop extends Computer{
    public int numbah;

    public Laptop(int numbah){
        super(numbah);
    }

    @Override
    public void start(){
        System.out.println("Laptop started.");
    }
}
