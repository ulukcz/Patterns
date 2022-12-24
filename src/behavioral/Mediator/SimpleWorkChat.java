package behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleWorkChat  implements Chat{
    User owner;
    List<User> workers = new ArrayList<>();

    public void  setOwner(User owner) {
        this.owner = owner;
    }
    public void addWorkerToChat(User worker) {
        this.workers.add(worker);
    }
    @Override
    public void sendMessage(String message, User user) {
        for (User w: workers) {
            if (w != user) {
                w.getMessage(message);
            }
        }
        owner.getMessage(message);
    }

}
