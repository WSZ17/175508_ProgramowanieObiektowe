package Zad_3;

public class TestWindow {
    public static void main(String[] args) {
        InfoMessage im = new InfoMessage();
        WindowDisplay wd1 = new WindowDisplay(im);
        Error_Message er = new Error_Message();
        WindowDisplay wd2 = new WindowDisplay(er);

        wd1.wyslij("Operacja zakończona pomyślnie");
        wd2.wyslij("Błąd");
    }
}
