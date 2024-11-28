package Zad3;

public record PointR(int x, int y) {

    public PointC konNaKlas(int x, int y){
        return new PointC(this.x, this.y);
    }
}
