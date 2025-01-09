package delegate;

public class Main {

    public static void main(String[] args) {
        Muzeum muzeum = new Muzeum();
        Koncert koncert = new Koncert();
        Disneyland disneyland = new Disneyland();

        KierownikWycieczki kierownikWycieczki = new KierownikWycieczki(muzeum);
        kierownikWycieczki.zalatwBilet();
        kierownikWycieczki.setBiletomat(koncert);
        kierownikWycieczki.zalatwBilet();
        Biletomat pielgrzymka = new Biletomat() {
            @Override
            public void wystawBilet() {
                System.out.println("Pielgrzymki są darmowe :)");
            }
        };
        kierownikWycieczki.setBiletomat(pielgrzymka);
        kierownikWycieczki.zalatwBilet();
    }

}
