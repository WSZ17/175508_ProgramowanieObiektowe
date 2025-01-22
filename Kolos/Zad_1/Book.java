package Zad_1;

public record Book(String title, String author, int pages) {
    public Book{
        if(pages<0){
            throw new IllegalArgumentException("Liczba stron nie może być ujemna");
        }
    }

    public boolean islarge(){
        if(this.pages >= 400){
            return true;
        }
        else {
            return false;
        }
    }
}
