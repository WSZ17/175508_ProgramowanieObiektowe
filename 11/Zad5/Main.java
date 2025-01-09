package Zad5;

public class Main<T> {
    public static <T> void swap(T[] table, int a, int b){
        if(a > table.length-1 || b > table.length-1 || a < 0 || b < 0){
            System.out.println("Złe indeksy");
        }
        else {
            T el1 = table[a];
            table[a] = table[b];
            table[b] = el1;
        }
    }

    public static void main(String[] args) {
        String[] lis = {"String", "Napis", "Text"};
        for(String obj:lis){
            System.out.println(obj);
        }
        swap(lis, 0, 2);
        for(String obj:lis){
            System.out.println(obj);
        }
    }
}
