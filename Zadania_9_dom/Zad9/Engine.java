package Zad9;

public class Engine implements Cloneable{
    int power;
    String type;
    int serialNumber;

    public Engine(int power, String type, int serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public static void main(String[] args) {
        Engine e1 = new Engine(80, "GTP567", 2498240);
        Engine e2 = null;
        try{
            e2 = (Engine) e1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Nie udało się utworzyć silnika");
        }
        if(e2==null){
            return;
        }
        System.out.println(e1.type);
        System.out.println(e2.type);
        e2.type = "HTK938";
        System.out.println(e2.type);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
