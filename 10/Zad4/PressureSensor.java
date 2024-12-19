package Zad4;

public class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 235.89;
    }

    @Override
    public String getStatus() {
        return "Oczekiwanie na działanie użytkownika";
    }

    @Override
    public void reset() {
        System.out.println("Pomyślnie zresetowano urządzenie");
    }
}
