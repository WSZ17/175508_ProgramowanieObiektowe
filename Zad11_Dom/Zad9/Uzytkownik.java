package Zad9;

public class Uzytkownik {
    private Powiadomienie powiadomienie;

    public Uzytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public void powiadomOModernizacji(String informacja){
        powiadomienie.wyslij(informacja);
    }

    public static void main(String[] args) {
        Email email = new Email();
        Uzytkownik uzytkownik = new Uzytkownik(email);
        uzytkownik.powiadomOModernizacji("Modernizacja w trakcie, zawieszenie działania serwerów.");
    }
}
