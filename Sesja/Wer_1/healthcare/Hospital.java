package Wer_1.healthcare;

import java.util.Objects;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        if(name == null){
            this.name = "";
        }
        else{
            this.name = name;
        }
        if(capacity < 0){
            this.capacity = 50.0;
        }
        else {
            this.capacity = capacity;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            this.name = "";
        }
        else{
            this.name = name;
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity == 0){
            this.capacity = 50.0;
        }
        else {
            this.capacity = capacity;
        }
    }

    @Override
    public String toString() {
        if(name.equals("")){
            return getClass() + ": Capacity: " + getCapacity() + ".";
        }
        else {
            return getClass() + ": Name: " + getName() + ". Capacity: " + getCapacity() + ".";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Double.compare(capacity, hospital.capacity) == 0 && name.equals(hospital.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
