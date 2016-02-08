package Classes;

import Interfaces.Listenable;

import java.util.ArrayList;

public class PlayList implements Listenable {
    private ArrayList<Track> tracks;

    public PlayList(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        for (Track track : tracks)
            track.play();
    }
}
