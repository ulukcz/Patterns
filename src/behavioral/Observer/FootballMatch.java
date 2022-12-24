package behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class FootballMatch implements Observed {
    List<String> goals = new ArrayList<>();

    List<Observer> watchers = new ArrayList<>();

    public void addGoal(String goal) {
        this.goals.add(goal);
        notifyObserver();
    }
    public void removeGoal(String goal) {
        this.goals.remove(goal);
        notifyObserver();
    }
    @Override
    public void addObserver(Observer observer) {
        this.watchers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.watchers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: watchers) {
            observer.handleEvent(this.goals);
        }
    }
}
