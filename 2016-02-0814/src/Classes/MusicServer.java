package Classes;

import Interfaces.Listenable;

import java.util.ArrayList;

public class MusicServer {
    private ArrayList<Track> tracks = new ArrayList<>();
    private ArrayList<PlayList> playLists = new ArrayList<>();
    private ArrayList<Genre> genres = new ArrayList<>();

    public void add(Listenable listenable) {
        if (listenable instanceof Track)
            tracks.add((Track) listenable);
        else if (listenable instanceof PlayList)
            playLists.add((PlayList) listenable);
    }

    public void addGenre(Genre genre){
        genres.add(genre);
    }

    public void remove(Listenable listenable){
        if (listenable instanceof Track)
            tracks.remove(listenable);
        else if (listenable instanceof PlayList)
            playLists.remove(listenable);
    }

    public ArrayList<PlayList> getPlayLists() {
        return playLists;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }
}
