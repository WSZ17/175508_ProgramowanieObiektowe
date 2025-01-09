package delegate;

public class KierownikWycieczki {

    private Biletomat biletomat;

    public KierownikWycieczki(Biletomat biletomat) {
        this.biletomat = biletomat;
    }

    public void zalatwBilet(){
        biletomat.wystawBilet();
    }

    public void setBiletomat(Biletomat biletomat) {
        this.biletomat = biletomat;
    }
}
