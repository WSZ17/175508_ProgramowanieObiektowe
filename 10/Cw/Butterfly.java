package Cw;

import java.util.ArrayList;

public class Butterfly extends Animal {

    public Butterfly(String imie) {
        super(imie);
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Filemon"));
        animals.add(new Dog("Reksio"));
        animals.add(new Butterfly("Cytrynek"));

        for(Animal a: animals){
            if(a instanceof LoudAnimal){
                ((LoudAnimal) a).makeNoise();
                ((LoudAnimal) a).sayName();
            }
        }
        Dog d1 = new Dog("Burek");
    }

}
