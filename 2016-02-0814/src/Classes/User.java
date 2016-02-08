package Classes;

import Interfaces.Listenable;

import java.util.ArrayList;

public class User {
    private String name;
    private Player player;
    private ArrayList<Listenable> tracks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void startPlaying(){
        player = new Player();
        player.listen(tracks);
    }

    public void add(Listenable listenable){
        tracks.add(listenable);
    }
}
