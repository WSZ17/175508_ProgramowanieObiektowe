package Zad8;

import java.util.ArrayList;

public class Athelete implements Cloneable{
    String name;
    ArrayList<Integer> lapTimes;

    public Athelete(String name, ArrayList<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(7);
        al.add(18);
        al.add(2);
        Athelete a1 = new Athelete("Jarosiewicz", al);
        Athelete a2 = null;
        try{
            a2 = (Athelete) a1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Nie udało się utworzyć atlety");
        }
        if(a2==null){
            return;
        }
        System.out.println(a1.lapTimes);
        System.out.println(a2.lapTimes);
        //a2.lapTimes =
        System.out.println(a2.lapTimes);
        System.out.println(a1.lapTimes);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
