package behavioral.Strategy;

public class KebabWorker {
    Requirements requirments;

    public void setRequirments(Requirements requirments) {
        this.requirments = requirments;
    }
    public void executeAction() {
        requirments.action();
    }
}
