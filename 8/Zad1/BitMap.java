package Zad1;

public class BitMap extends ComputerGraphic{

    public BitMap(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Wczytano BitMapę");
    }

    @Override
    public void saveFile() {
        System.out.println("Zapisano BitMapę");
    }
}
