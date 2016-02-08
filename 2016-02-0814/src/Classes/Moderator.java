package Classes;

import Interfaces.CanEdit;
import Interfaces.Listenable;

public class Moderator implements CanEdit {
    private MusicServer server;

    @Override
    public void add(Listenable listenable) {
        server.add(listenable);
    }

    @Override
    public void remove(Listenable listenable) {
        server.remove(listenable);
    }
}
