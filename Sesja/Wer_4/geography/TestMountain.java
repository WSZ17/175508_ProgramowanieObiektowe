package Wer_4.geography;

import java.util.ArrayList;

public class TestMountain {

    public static void main(String[] args) {
        ArrayList<Double> h1 = new ArrayList<>();
        h1.add(9.9);
        h1.add(9.9);
        h1.add(9.9);
        h1.add(9.9);
        h1.add(9.9);
        ArrayList<Double> h2 = (ArrayList<Double>) h1.clone();
        h2.remove(0);
        h2.add(0,8.7);
        Mountain m1 = new Mountain("Mt. Everestt", h1);
        Mountain m2 = null;
        try{
            m2 = (Mountain) m1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        m1.setHeight(h2);
        System.out.println(m1);
        System.out.println(m2);
    }
}
