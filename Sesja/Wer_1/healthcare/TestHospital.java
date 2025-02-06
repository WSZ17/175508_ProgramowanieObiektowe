package Wer_1.healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Św. Teresy", 63.9);
        Hospital h2 = new Hospital(null, 57.0);
        Clinic c1 = new Clinic("Św. Jerzego", 78.5, -1.0);
        Clinic c2 = new Clinic(null, -9.8, 4.9);
        Clinic c3 = new Clinic("Św. Jerzego", 78.5, -1.0);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c2.equals(c3));
        System.out.println(c1.equals(c3));
    }
}
