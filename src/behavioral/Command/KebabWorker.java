package behavioral.Command;

public class KebabWorker {
    Responsibility doKebab;
    Responsibility prepareMeat;
    Responsibility takePayment;
    Responsibility giveChange;

    public KebabWorker(Responsibility doKebab, Responsibility prepareMeat, Responsibility takePayment, Responsibility giveChange) {
        this.doKebab = doKebab;
        this.prepareMeat = prepareMeat;
        this.takePayment = takePayment;
        this.giveChange = giveChange;
    }
    public void doKebabRecord() {
        doKebab.execute();
    }
    public void prepareMeatRecord() {
        prepareMeat.execute();
    }
    public void takePaymentRecord() {
        takePayment.execute();
    }
    public void giveChangeRecord() {
        giveChange.execute();
    }
}
