package Zad1;

public class TestMyComparator implements MyComparator{

    @Override
    public int compare(int a, int b) {
        /*if(a<b){
            return -1;
        }
        if(a==b){
            return 0;
        }
        else
            return 1;
        */
        return Integer.compare(a,b);
    }

    public static void main(String[] args) {
        TestMyComparator tmc = new TestMyComparator();
        System.out.println(tmc.compare(8,8));
    }
}
