package Wer_4.consistency;

public class Main {
    public static <T> boolean areBothNotNull(T object1, T object2){
        return (!(object1 == null) && !(object2 == null));
    }

    public static void main(String[] args) {
        String[] s1 = {"Str", "ing"};
        String[] s2 = null;
        String[] s3 = {"St", "ri", "ng"};
        System.out.println(areBothNotNull(s1,s2));
        System.out.println(areBothNotNull(s1,s3));
        System.out.println(areBothNotNull(s2,s3));
    }
}
