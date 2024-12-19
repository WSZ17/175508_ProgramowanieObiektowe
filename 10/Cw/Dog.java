package Cw;

import Cw.LoudAnimal;

public class Dog extends Animal implements LoudAnimal {
    public Dog(String imie) {
        super(imie);
    }


    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }

    @Override
    public void sayName() {
        System.out.println(imie);
    }
}
