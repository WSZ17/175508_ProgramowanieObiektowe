package mammals;

public class Dog extends animals.Animal {

    public Dog(String specie, int age) {
        super(specie, age);
    }

    public void giveData(){
        System.out.println("Wiek: " + getAge() + ", gatunek: " + this.specie);
    }
}
