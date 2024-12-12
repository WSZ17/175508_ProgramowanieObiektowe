package Zad3;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book>{
    String title;
    int numberOfPages;
    LocalDate publicationDate;

    public Book(String title, int numberOfPages, LocalDate publicationDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return title + ", " + numberOfPages + ";";
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.numberOfPages, this.numberOfPages);
    }

    public static void main(String[] args) {
        Book[] ksiazki = new Book[]{
                new Book("Z mgły zrodzony",688, LocalDate.parse("2012-12-31")),
                new Book("Droga Królów",1024, LocalDate.parse("2014-12-31")),
                new Book("Czarnoksiężnik z Archipelagu",190, LocalDate.parse("1998-12-31")),
                new Book("Tajemnica Diabelskiego Kręgu",450, LocalDate.parse("2015-12-31")),
        };


        System.out.println(Arrays.toString(ksiazki));
        Arrays.sort(ksiazki);
        System.out.println(Arrays.toString(ksiazki));
    }
}
