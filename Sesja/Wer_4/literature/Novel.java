package Wer_4.literature;

import java.util.Arrays;
import java.util.Objects;

public class Novel {
    private String title;
    private String author;
    private double[] ratings;

    public Novel(String title, String author, double[] ratings) {
        this.title = title;
        this.author = author;
        this.ratings = ratings.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings.clone();
    }

    public void addElements(double el){
        double[] lista = new double[this.ratings.length+1];
        for(int i=0; i<this.ratings.length;i++){
            lista[i] = this.ratings[i];
        }
        lista[lista.length-1] = el;
        this.ratings = lista;
    }

    public void removeElements(double el){
        double[] lista = new double[this.ratings.length-1];
        int index = -1;
        for(int i=0; i<this.ratings.length; i++){
            if(this.ratings[i] == el){
                index = i;
                break;
            }
        }
        if(index==-1){
            throw new IllegalArgumentException("Nie znaleziono elementu");
        }
        for(int i=0; i<index; i++){
            lista[i] = this.ratings[i];
        }
        for(int i=index+1; i<this.ratings.length; i++){
            lista[i-1] = this.ratings[i];
        }
        this.ratings = lista;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getTitle() + ", " + getAuthor() + ", " + Arrays.toString(getRatings()) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Novel novel = (Novel) o;
        return Objects.equals(title, novel.title) && Objects.equals(author, novel.author) && Arrays.equals(ratings, novel.ratings);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, author);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }
}
