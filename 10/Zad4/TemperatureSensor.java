package Zad4;

public class TemperatureSensor implements Sensor{
    @Override
    public double readValue() {
        return 78.8;
    }

    @Override
    public String getStatus() {
        return "W trybie czuwania";
    }

    @Override
    public void reset() {
        System.out.println("Pomyślnie zresetowano urządzenie");
    }
}
