package Zad8;

import java.util.ArrayList;

public class athelete implements Cloneable{
    String name;
    ArrayList<Integer> lapTimes;

    public athelete(String name, ArrayList<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(7);
        al.add(18);
        al.add(2);
        athelete a1 = new athelete("Jarosiewicz", al);
        athelete a2 = null;
        try{
            a2 = (athelete) a1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Nie udało się utworzyć atlety");
        }
        if(a2==null){
            return;
        }
        System.out.println(a1.lapTimes);
        System.out.println(a2.lapTimes);
        ArrayList al1 = new ArrayList();
        al1.addAll(al);
        al1.set(2,9);
        a2.lapTimes = al1;
        //a2.lapTimes.set(2,8) <- nie zadziała bo zmieni w obu
        System.out.println(a2.lapTimes);
        System.out.println(a1.lapTimes);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}