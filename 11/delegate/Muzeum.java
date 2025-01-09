package delegate;

public class Muzeum implements Biletomat{
    @Override
    public void wystawBilet() {
        System.out.println("Wystawiono bilet do muzeum");
    }
}
