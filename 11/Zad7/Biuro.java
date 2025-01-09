package Zad7;

public class Biuro {
    private Printer printer;

    public Biuro(Printer printer) {
        this.printer = printer;
    }

    public void drukujDokument(String tekst){
        printer.drukuj(tekst);
    }

    public static void main(String[] args) {
        StandardowyPrinter sp = new StandardowyPrinter();
        Biuro niuro = new Biuro(sp);
        niuro.drukujDokument("niuro");
    }
}
