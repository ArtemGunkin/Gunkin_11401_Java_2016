package Classes;

import Interfaces.HasGenre;
import Interfaces.Listenable;

import java.util.ArrayList;

public class Track implements Listenable, HasGenre {
    private ArrayList<Genre> genres;
    private String name;
    private Artist artist;

    public Track(String name, Artist artist, ArrayList<Genre> genres) {
        this.genres = genres;
        this.name = name;
        this.artist = artist;
    }

    public Track(String name, Artist artist, Genre genre) {
        genres = new ArrayList<>();
        genres.add(genre);
        this.name = name;
        this.artist = artist;
    }

    @Override
    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    @Override
    public void play() {
        System.out.println("Now playing " + artist + " - " + name);
    }
}
