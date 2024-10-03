public class Main {
    public static void main(String[] args) {
        /*student.imie = "Karol";
        student.nazwisko = "Kowalski";
        student.nrIndeksu = 150;*/
        /*student2.imie = "Aneta";
        student2.nazwisko = "Kowalska";
        student2.nrIndeksu = 151;*/
        Student student = new Student(150,"Karol", "Kowalski");
        Student student2 = new Student(151, "Aneta", "Kowalska");
        //System.out.println(student.imie);
        //System.out.println(student2.imie);

        student.przedstawSie();
        student2.przedstawSie();

        /*
        int liczbaCalkowita = 4;
        float liczbaZmiennoprzecinkowa;
        double liczbaZmiennoprzecinkowaZPrecyzjaDoDwochMiejsc;
        byte osiemBitow;
        boolean wartoscLogiczna ;
        char pojedynczyZnak = 's' ;
        String ciagZnakow = "A";

        System.out.printf("Hello world!");
        System.out.println("Liczba całkowita to: " + liczbaCalkowita);

        ciagZnakow = ciagZnakow + "b";
        System.out.println(ciagZnakow);


        souf + TAB daje System.out.printf-a

        if(true){

        }

        else if(false){

        }

        else{

        }

        for (int i = 1; i <= 5; i++){
            System.out.println("i = " + i);
        }*/

    }
}