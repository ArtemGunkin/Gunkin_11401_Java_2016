package Classes;

import Interfaces.Listenable;
import Interfaces.Manager;

import java.util.ArrayList;

public class Player implements Manager{
    private Listenable playingNow;
    private Listenable lastPlayed;
    private ArrayList<Track> tracks;

    public Player(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public Player() {
    }

    @Override
    public void listen(ArrayList<Listenable> listenableList) {
        for (Listenable listenable : listenableList)
            listen(listenable);
    }

    @Override
    public void listen(Listenable listenable) {
        playingNow = listenable;
        System.out.println((Track) playingNow);
    }

    @Override
    public void resume(Listenable listenable) {
            playingNow = lastPlayed;
    }

    @Override
    public void pause(Listenable listenable) {
            lastPlayed = playingNow;
            playingNow = null;
    }
}
