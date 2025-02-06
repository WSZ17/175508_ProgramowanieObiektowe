package Wer_2.art;

public class TestArtGallery {
    public static void main(String[] args) {
        ArtGallery ag1 = ArtGallery.getInstance("KL");
        ag1.getInstance("WM");
        ag1.getInstance("MO");

        System.out.println(ag1.getName());
    }
}
