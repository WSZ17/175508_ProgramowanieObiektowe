package Zad5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.print("Wprowadź dwie liczby");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Nie można dzielić przez zero");
        }
        catch (InputMismatchException e){
            System.out.println("Zły typ danych");
        }
    }

}
