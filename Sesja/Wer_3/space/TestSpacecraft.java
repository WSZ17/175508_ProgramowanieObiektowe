package Wer_3.space;

import java.util.ArrayList;

public class TestSpacecraft {
    public static void main(String[] args) {
        ArrayList<Double> a1 = new ArrayList<>();
        ArrayList<Double> a2 = new ArrayList<>();
        for(double i=0; i<11; i++){
            a1.add(i);
            a2.add(i);
        }
        Spacecraft s1 = new Spacecraft("n1", "m1",a1);
        Spacecraft s2 = new Spacecraft("n2", "m2",a2);

        System.out.println(s1);
        System.out.println(s2);

        s1.addElement(7.8);
        s2.removeElement(7.0);

        System.out.println(s1);
        System.out.println(s2);

    }

}
