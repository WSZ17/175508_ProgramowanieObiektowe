package Cw1;

public class Box <T,U>{
    T value1;
    U value2;

    public Box(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    public T getValue1() {
        return this.value1;
    }

    public U getValue2() {
        return this.value2;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Filemon");
        Animal animal2 = new Animal("Bonifacy");
        Box<Animal, Animal> box1 = new Box<>(animal, animal2);
        System.out.println(box1.getValue1().name);

        box1.setValue2(animal2);
        System.out.println(box1.getValue1().name);
        String napis = "Cześć!";
        Box<String, Animal> box3NaNapis = new Box<>(napis,animal);
        System.out.println(box3NaNapis.getValue1());

        Box<Animal,String> box2 = new Box<>(animal, napis);

    }
}
