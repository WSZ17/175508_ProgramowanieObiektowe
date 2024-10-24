package Zad2;

public class Calculator {

    public static double Dodawanie(int a, int b){
        return a+b;
    }
    public static double Odejmowanie(int a, int b){
        return a-b;
    }
    public static double Mnozenie(int a, int b){
        return a*b;
    }
    public static double Dzielenie(int a, int b){
        if(b != 0){
            return a/b;
        }
        return 0;
    }
}
