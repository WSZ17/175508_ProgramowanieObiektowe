package Zad1;

public class Main <T>{

    public static void main(String[] args) {
        String s1 = "Toyota";
        String s2 = "Honda";
        String s3 = "Honda";

        System.out.println(isEqual(s1,s2));
        System.out.println(isEqual(s2,s3));
    }

    public static <T> boolean isEqual(T value1, T value2){
        return value1.equals(value2);
    }
}
