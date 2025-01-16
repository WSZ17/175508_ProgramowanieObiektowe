package Statycznosc_Zad;

public class Book implements Comparable<Book>{
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    public static void main(String[] args){

        Book[] ksiazki = new Book[]{
                new Book("Droga Królów", "Brandon Sanderson"),
                new Book("Z mgły zrodzony", "Brandon Sanderson"),
                new Book("Tajemnica Diabelskiego Kręgu", "Anna Kańtoch"),
                new Book ("Czarnoksiężnik z Archipelagu", "Ursula K. Le Gui")
        };

        try{
            System.out.println(Main.sortAndReturnFirst(ksiazki));
        }
        catch (EmptyArrayExcepction e){
            System.out.println(e.getMessage());
        }
    }
}
