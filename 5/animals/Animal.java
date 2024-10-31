package animals;

public class Animal {

    protected String specie;
    private int age;

    public Animal(String specie, int age){
        this.specie = specie;
        this.age = age;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
