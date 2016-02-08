package Classes;

public class Main {
    public static void main(String[] args) {
        Genre altGenre = new Genre("Alternative");

        Artist coldplay = new Artist("Coldplay");
        coldplay.addGenre(altGenre);

        Track track = new Track("Clocks", coldplay, altGenre);

        MusicServer server = new MusicServer();
        server.add(track);

        User user = new User("User");
        user.add(track);

        user.startPlaying();
    }
}
