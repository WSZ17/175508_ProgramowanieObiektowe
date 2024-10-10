import java.util.Locale;

public class napisyTest {

    public static String odwrocNapis(String napis){
        /*StringBuilder odwrot = new StringBuilder();
        for(int i = napis.length()-1; i >= 0; i--){
            odwrot.append(napis.charAt(i));
        }
        return odwrot.toString();*/

        StringBuilder odwrot = new StringBuilder(napis);
        return odwrot.reverse().toString();

    }

    public static boolean czyJedenToOstatni(String napis){
        /*if(napis.toLowerCase().charAt(0)==napis.toLowerCase().charAt(napis.length()-1)){
            return true;
        }
        return false;*/
        return napis.toLowerCase().charAt(0) == napis.toLowerCase().charAt(napis.length() - 1);
    }

    public static String pierwszyOstatni(String napis){
        /*char first = napis.charAt(0);
        char last = napis.charAt(napis.length()-1);
        String middle = napis.substring(1, napis.length()-1);
        return last+middle+first;
        */
        StringBuilder str = new StringBuilder(napis);
        str.setCharAt(0,napis.charAt(napis.length()-1));
        str.setCharAt(str.length()-1, napis.charAt(0));

        return str.toString();
    }
}
