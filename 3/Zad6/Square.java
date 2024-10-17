package Zad6;

public class Square {
    public int side;

    public Square(int side){
        this.side = side;
    }

    public Square(){
        this(1);
    }

    public static void main(String[] args){
        Square triang = new Square();
        System.out.println(triang.side);
    }
}
