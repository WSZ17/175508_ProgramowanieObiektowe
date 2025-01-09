package delegate;

public class Disneyland implements Biletomat{

    @Override
    public void wystawBilet() {
        System.out.println("Wystawiono bilety do Disneylandu");
    }
}
