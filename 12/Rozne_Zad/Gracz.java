package Rozne_Zad;

public class Gracz {
    private Bron bron;

    public Gracz(Bron bron) {
        this.bron = bron;
    }

    public void zaatakuj(){
        bron.uzyjBroni();
    }

    public static void main(String[] args) {
        Miecz miecz = new Miecz();
        Gracz gracz = new Gracz(miecz);
        gracz.zaatakuj();
        Luk luk = new Luk();
        Gracz gr = new Gracz(luk);
        gr.zaatakuj();
    }
}
