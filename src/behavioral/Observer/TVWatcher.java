package behavioral.Observer;

import java.util.List;

public class TVWatcher implements Observer {
    String name;

    public TVWatcher(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> goals) {
        System.out.println(name + ", in this match some team score a goal: " + goals);
    }
}
