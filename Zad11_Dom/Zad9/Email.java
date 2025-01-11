package Zad9;

public class Email implements Powiadomienie {
    @Override
    public void wyslij(String wiadomosc) {
        System.out.println(wiadomosc);
    }
}
