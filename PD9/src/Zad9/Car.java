package Zad9;

public class Car implements Cloneable{
    String make;
    String model;
    Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Skoda", "Octavia", new Engine(87, "HLS-8236", 8392004));
        Car c2 = null;
        try{
            c2 = (Car) c1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Nie udało się utworzyć samochodu");
        }
        if(c2==null){
            return;
        }
        System.out.println(c1.engine);
        System.out.println(c2.engine);
        c2.engine = new Engine(90,"JKS-2983", 298477284);
        System.out.println(c2.engine);
        System.out.println(c1.engine);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}