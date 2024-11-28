package Zad3;

public class PointC {
    int x;
    int y;

    public PointC(int x, int y){
        this.x = x;
        this.y = y;
    }

    public PointR konNaRekord(){
        return new PointR(this.x, this.y);
    }

}
