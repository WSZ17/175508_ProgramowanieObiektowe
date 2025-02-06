package Wer_3.space;

import java.util.ArrayList;
import java.util.Objects;

public class Spacecraft {
    private String name;
    private String manufacturer;
    private ArrayList<Double> rating;

    public Spacecraft(String name, String manufacturer, ArrayList<Double> rating) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.rating = (ArrayList<Double>) rating.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ArrayList<Double> getRating() {
        return (ArrayList<Double>) rating.clone();
    }

    public void setRating(ArrayList<Double> rating) {
        this.rating = (ArrayList<Double>) rating.clone();
    }

    public void addElement(double el){
        this.rating.add(el);
    }

    public void removeElement(double el){
        int index = -1;
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0; i<this.rating.size(); i++){
            if(this.rating.get(i)==el){
                index = i;
                break;
            }
        }
        if(index == -1){
            throw new IllegalArgumentException("Element not found");
        }
        for(int i=0; i<index; i++){
            list.add(this.rating.get(i));
        }
        for(int i=index+1; i<this.rating.size(); i++){
            list.add(this.rating.get(i));
        }
        this.rating = list;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getName() + ", " + getManufacturer() + ", " + getRating() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return Objects.equals(name, that.name) && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, rating);
    }
}

