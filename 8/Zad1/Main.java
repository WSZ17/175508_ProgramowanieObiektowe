package Zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ComputerGraphic> graphics = new ArrayList<>();
        graphics.add(new BitMap(67,82,"Island"));
        graphics.add(new Vector(56,17,"vector_1"));
        graphics.add(new BitMap(79,36,"City"));
        graphics.add(new BitMap(126,237,"Plane"));
        graphics.add(new Vector(27,62,"vector_2"));

        for(ComputerGraphic cg: graphics){
            cg.loadFile();
            cg.saveFile();
        }
    }
}
