package behavioral.State;

public class KebabWorker {
    Requirments requirments;

    public void setRequirments(Requirments requirments) {
        this.requirments = requirments;
    }

    public void changeRequirments() {
        if (requirments instanceof PrepareMeat) {
            setRequirments(new DoingKebab());
        } else if (requirments instanceof DoingKebab) {
            setRequirments(new TakePayment());
        } else if (requirments instanceof TakePayment) {
            setRequirments(new Cleaning());
        } else if (requirments instanceof Cleaning) {
            setRequirments(new PrepareMeat());
        }
    }
    public void action() {
        requirments.action();
    }
}
