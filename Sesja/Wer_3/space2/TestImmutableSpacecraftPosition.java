package Wer_3.space2;

public class TestImmutableSpacecraftPosition {
    public static void main(String[] args) {
        ImmutableSpacecraftPosition isp1 = new ImmutableSpacecraftPosition(8, 9, 3);
        ImmutableSpacecraftPosition isp2 = isp1.move(4,-5,6);
        System.out.println(isp1);
        System.out.println(isp2);

    }

}
