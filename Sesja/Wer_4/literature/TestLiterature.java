package Wer_4.literature;

public class TestLiterature {
    public static void main(String[] args) {
        Novel n1 = new Novel("aaa", "aaa", new double[]{8.9,6.4,3.7,1.2,8.2});
        Novel n2 = new Novel("bbb", "bbb", new double[]{7.9,6.1,6.2,9.2,3.4});
        Novel n3 = new Novel("aaa", "aaa", new double[]{8.9,6.4,3.7,1.2,8.2});

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1.equals(n3));
        System.out.println(n1.equals(n2));
        System.out.println("\n");
        System.out.println(n1);
        n1.addElements(3.5);
        System.out.println(n1);
        System.out.println(n2);
        n2.removeElements(6.2);
        System.out.println(n2);
    }
}
