package Wer_1.playlist;

import java.util.Arrays;
import java.util.Comparator;

public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    public static void main(String[] args) {

        Song[] songs = new Song[]{
                new Song("Song 1", "Artist 1", 100),
                new Song("Song 2", "Artist 2", 200),
                new Song("Song 1", "Artist 1", 300),
                new Song("Song 2", "Artist 4", 200),
                new Song("Song 5", "Artist 5", 100)
        };

        for (Song s: songs) {
            System.out.println(s);
        }
        System.out.println("After:");
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for (Song s: songs) {
            System.out.println(s);
        }
    }
}

class DurationComparator implements Comparator<Song>{

    @Override
    public int compare(Song s1, Song s2) {
        return Integer.compare(s1.getDuration(), s2.getDuration());
    }
}

class ArtistTitleComparator implements Comparator<Song>{

    @Override
    public int compare(Song s1, Song s2) {
        if(s1.getArtist().compareTo(s2.getArtist()) == 0){
            return s1.getTitle().compareTo(s2.getTitle());
        }
        else {
            return s1.getArtist().compareTo(s2.getArtist());
        }
    }
}