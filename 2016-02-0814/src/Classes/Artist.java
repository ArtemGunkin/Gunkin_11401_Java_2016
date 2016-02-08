package Classes;

import Interfaces.CanEdit;
import Interfaces.HasGenre;
import Interfaces.Listenable;

import java.util.ArrayList;

public class Artist implements CanEdit, HasGenre {
    private String name;
    private ArrayList<Genre> genres = new ArrayList<>();
    private ArrayList<Listenable> tracks = new ArrayList<>();

    public Artist(String name) {
        this.name = name;
    }

    public Artist(String name, Genre genre) {
        this.name = name;
        genres.add(genre);
    }

    @Override
    public void add(Listenable listenable) {
        tracks.add(listenable);
    }

    @Override
    public void remove(Listenable listenable) {
        tracks.remove(listenable);
    }

    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    @Override
    public void addGenre(Genre genre) {
        genres.add(genre);
    }
}
