package Zad3;

import java.util.ArrayList;

public class Avg {
    public static double average(ArrayList<Double> lista){
        double srednia = 0;
        int count = 0;
        for(int i=0; i<lista.size(); i++){
            srednia += lista.get(i);
            count += 1;
        }
        return srednia/count;
    }
}
