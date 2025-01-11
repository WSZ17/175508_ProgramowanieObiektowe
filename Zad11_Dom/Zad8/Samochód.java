package Zad8;

public class Samochód {
    private Silnik silnik;

    public Samochód(Silnik silnik) {
        this.silnik = silnik;
    }

    public void start(){
        silnik.uruchom();
    }

    public void stop(){
        silnik.zatrzymaj();
    }

    public static void main(String[] args) {
        BenzynowySilnik bs = new BenzynowySilnik();
        Samochód samochód = new Samochód(bs);
        samochód.start();
        samochód.stop();
    }
}
