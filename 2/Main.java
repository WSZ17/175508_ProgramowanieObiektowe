import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź tekst do odwrócenia: ");
        String wejscie = scanner.nextLine();
        System.out.println(napisyTest.odwrocNapis(wejscie));

        Gwiazdka.drzewko(3,'*');

       /*System.out.println(napisyTest.odwrocNapis("Czesc"));

        System.out.println(napisyTest.czyJedenToOstatni("Czesc"));

        System.out.println(napisyTest.pierwszyOstatni("Hello"));*/

        /*ArrayList<Double> liczebki = new ArrayList<>();
        for(int i=0; i<15; i++){
            liczebki.add((double)i);
        }

        System.out.println(liczebki);
        System.out.println(listyTablicoweZmien.srednia(liczebki));

        ArrayList<Integer> liczby = new ArrayList<>();
        for(int i=0; i<10; i++){
            liczby.add(0);
        }

        System.out.println(liczby);
        System.out.println(listyTablicoweZmien.countZeros(liczby));
        */

        /*ArrayList<Integer> liczby = new ArrayList<>();
        for(int i=0; i<15; i++){
            liczby.add(i);
        }

        System.out.println(listyTablicoweTest.minimumValue(liczby));
        */

        /*ArrayList<Integer> listaLiczbCalkowitych = new ArrayList<>();
        listaLiczbCalkowitych.add(3);
        listaLiczbCalkowitych.add(4);
        listaLiczbCalkowitych.add(5);
        listaLiczbCalkowitych.add(6);
        listaLiczbCalkowitych.add(7);
        listaLiczbCalkowitych.add(8);
        listaLiczbCalkowitych.add(9);
        listaLiczbCalkowitych.add(10);
        listaLiczbCalkowitych.add(11);
        listaLiczbCalkowitych.add(12);

        for (int i = 0; i < listaLiczbCalkowitych.size(); i++){
            System.out.println(listaLiczbCalkowitych.get(i));
        }

        for (Integer liczbyCalkowite : listaLiczbCalkowitych){
            System.out.println(liczbyCalkowite);
        }

        for (int i = listaLiczbCalkowitych.size() - 1; i >= 0; i--){
            System.out.print(listaLiczbCalkowitych.get(i) + " ");
        }

        System.out.println(listaLiczbCalkowitych);
        System.out.println(listaLiczbCalkowitych.reversed());

        for (Integer element : listaLiczbCalkowitych.reversed()){
            System.out.println(element);
        }*/
    }
}