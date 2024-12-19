package Cw;

import Cw.LoudAnimal;

public class Cat extends Animal implements LoudAnimal {

    public Cat(String imie) {
        super(imie);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void sayName() {
        System.out.println(imie);
    }
}
