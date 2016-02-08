package Interfaces;

import java.util.ArrayList;

public interface Manager {
    void listen(ArrayList<Listenable> listenableList);

    void listen(Listenable listenable);

    void resume(Listenable listenable);

    void pause(Listenable listenable);
}
