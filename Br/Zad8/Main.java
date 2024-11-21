package Zad8;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(9);
        Laptop laptop = new Laptop(9);
        computer.start();
        laptop.start();
    }
}
