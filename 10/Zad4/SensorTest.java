package Zad4;

public class SensorTest {
    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor();
        PressureSensor ps = new PressureSensor();
        ps.reset();
        ts.reset();
        System.out.println(ps.readValue());
        System.out.println(ts.readValue());
        System.out.println(ps.getStatus());
        System.out.println(ts.getStatus());

    }
}
