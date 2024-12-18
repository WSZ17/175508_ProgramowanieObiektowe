package Zad7;

public class Teacher implements Cloneable{
    String name;
    String subject;
    int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name + " " + subject + " " + experience;
    }

    public static void main(String[] args){
        Teacher t1 = new Teacher("Kowalska", "Matematyka", 4);
        Teacher t2 = null;
        try{
            t2 = (Teacher) t1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Nie udało się sklonować nauczyciela");
        }
        if(t2 == null){
            return;
        }
        System.out.println(t1.experience);
        System.out.println(t2.experience);
        t2.experience = 2;
        System.out.println(t2.experience);

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
