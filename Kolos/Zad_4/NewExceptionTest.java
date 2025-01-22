package Zad_4;

import java.util.Scanner;

public class NewExceptionTest {

    public static String getValidUserInput() throws InputTooShortException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Prosze podac ciag o dlugosci co najmniej 4 znakow");
        String napis = scan.nextLine();
        if(napis.length() < 4){
            throw new InputTooShortException("Zbyt krotka dlugosc ciagu");
        }
        else{
            return "Ok";
        }
    }

    public static void main(String[] args) {
        try{
            System.out.println(getValidUserInput());
        }
        catch(InputTooShortException i){
            System.out.println(i.getMessage());
        }
    }
}
