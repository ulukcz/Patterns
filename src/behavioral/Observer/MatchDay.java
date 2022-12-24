package behavioral.Observer;

public class MatchDay {
    public static void main(String[] args) {
        FootballMatch fraarg = new FootballMatch();

        fraarg.addGoal("Messi Scored (Argentina) 1 - 0");
        fraarg.addGoal("Di Maria Scored (Argentina) 2 - 0");
        fraarg.addGoal("Mbappe Scored (France) 2 - 1");

        Observer watcher1 = new TVWatcher("Josef Pechar");
        Observer watcher2 = new TVWatcher("Jan Hus");

        fraarg.addObserver(watcher1);
        fraarg.addObserver(watcher2);

        fraarg.addGoal("Mbappe Scored again (France) 2 - 2");
        System.out.println("===============");
        fraarg.removeGoal("Mbappe Scored again (France) 2 - 2");

    }
}
