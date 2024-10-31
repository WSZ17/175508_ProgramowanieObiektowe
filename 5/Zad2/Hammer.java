package Zad2;

public class Hammer extends Tool{

    public int number;

    protected Hammer(String nazwaNarzedzia, int number){
        super(nazwaNarzedzia);
        this.number = number;
    }
}
