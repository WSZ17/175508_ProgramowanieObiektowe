package Cw;

public interface LoudAnimal {
    void makeNoise();
    default void sayName(){
        System.out.println("I don't know my name");
    }

}
