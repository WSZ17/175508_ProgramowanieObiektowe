import java.util.ArrayList;

public class listyTablicoweTest {

    public static int minimumValue(ArrayList<Integer> lista){
        int minimum = lista.getFirst();
        for(int i = 1; i < lista.size(); i++){
            if(lista.get(i) < minimum){
                minimum = lista.get(i);
            }
        }
        return minimum;
    }
}
