package Zad8;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Brrrrrrr");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Pfffffsh");
    }
}
