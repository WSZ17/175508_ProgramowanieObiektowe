import java.util.ArrayList;

public class listyTablicoweZmien {

    public static double srednia(ArrayList<Double> lista){
        double avg = 0;
        for (int i=0; i < lista.size(); i++){
            avg += lista.get(i);
        }
        return avg/lista.size();

    }

    public static int countZeros(ArrayList<Integer> lista){
        int count = 0;
        for (int i=0; i < lista.size(); i++){
            if(lista.get(i) == 0){
                count += 1;
            }
        }
        return count;
    }
}
