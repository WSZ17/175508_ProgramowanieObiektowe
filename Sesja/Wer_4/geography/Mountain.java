package Wer_4.geography;

import java.util.ArrayList;

public class Mountain implements Cloneable{
    private String name;
    private ArrayList<Double> height;

    public Mountain(String name, ArrayList<Double> height) {
        this.name = name;
        if(height.size()>5){
            throw new IllegalArgumentException("Zbyt wiele danych");
        }
        else {
            this.height = (ArrayList<Double>) height.clone();
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(ArrayList<Double> height) {
        this.height = (ArrayList<Double>) height.clone();
    }

    @Override
    protected Mountain clone() throws CloneNotSupportedException {
        Mountain mountain = (Mountain) super.clone();
        mountain.height = new ArrayList<>(height);
        return mountain;
    }

    @Override
    public String toString() {
        return getName() + ", " + getHeight();
    }

}
