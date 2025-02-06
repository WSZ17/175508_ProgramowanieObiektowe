package Wer_1.healthcare;

import java.util.Objects;

public class Clinic extends Hospital{

    private double rating;

    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        if(rating >= 0.0 && rating <= 5.0){
            this.rating = rating;
        }
        else {
            this.rating = 3.0;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating >= 0.0 && rating <= 5.0){
            this.rating = rating;
        }
        else {
            this.rating = 3.0;
        }
    }

    @Override
    public String toString() {
        if(getName().equals("")){
            return getClass() + ": Capacity: " + getCapacity() + ". \n Rating: " + getRating() + ".";
        }
        else{
            return getClass() + ": Name: " + getName() + ". Capacity: " + getCapacity() + ". \n Rating: " + getRating() + ".";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clinic clinic = (Clinic) o;
        return Double.compare(rating, clinic.rating) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rating);
    }
}
