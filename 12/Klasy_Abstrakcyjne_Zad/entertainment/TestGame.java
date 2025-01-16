package Klasy_Abstrakcyjne_Zad.entertainment;

import Klasy_Abstrakcyjne_Zad.AdventureGame;
import Klasy_Abstrakcyjne_Zad.StrategyGame;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();
        games.add(new AdventureGame());
        games.add(new StrategyGame());

        for(Game g:games){
            System.out.println(g.getRating());
        }
    }
}
