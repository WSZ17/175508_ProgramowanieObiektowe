package Zad_1;

public class TestBook {
    public static void main(String[] args) {
        //Book b1 = new Book("aaa", "aaa", -900);
        Book b2 = new Book("bbb", "bbb", 40);
        Book b3 = new Book("ccc", "ccc", 900);

        //b1.islarge();
        System.out.println(b2.islarge());
        System.out.println(b3.islarge());
    }
}
