package Wer_1.moto;

public class Vehicle implements Comparable<Vehicle>{

    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Vehicle v) {
        if(this.model.compareTo(v.model)==0){
            return Integer.compare(this.speed,v.speed);
        }
        else {
            return this.model.compareTo(v.model);
        }
    }
}
