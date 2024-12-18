package Zad6;

import java.util.Arrays;
import java.util.Comparator;

public class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return title + " " + artist + " " + duration;
    }

    public static void main(String[] args) {

        Song[] piosenki = new Song[]{
            new Song("Clint Eastwood", "Gorillaz", 4),
                new Song("Supermassive Black Hole", "Muse", 6),
                new Song("House Of THe Rising Sun", "The Animals", 4),
                new Song("DARE", "Gorillaz", 5),
                new Song("CHOKE", "I Don't Know How But They Found Me", 6)
        };
        System.out.println(Arrays.toString(piosenki));
        Arrays.sort(piosenki, new DurationComparator());
        System.out.println(Arrays.toString(piosenki));
        Arrays.sort(piosenki, new ArtistTitleComparator());
        System.out.println(Arrays.toString(piosenki));
    }

}

class DurationComparator implements Comparator<Song>{

    @Override
    public int compare(Song song, Song t1) {
        return Integer.compare(song.duration, t1.duration);
    }
}

class ArtistTitleComparator implements Comparator<Song>{

    @Override
    public int compare(Song song, Song t1) {
        if(song.artist.compareTo(t1.artist)==0){
            return song.title.compareTo(t1.title);
        }
        else{
            return song.artist.compareTo(t1.artist);
        }
    }
}