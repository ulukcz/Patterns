package behavioral.Command;

public class TakePaymentResponsibility implements Responsibility{
    KebabMan kebabMan;
    public TakePaymentResponsibility(KebabMan kebabMan) {
        this.kebabMan = kebabMan;
    }

    @Override
    public void execute() {
        kebabMan.takePayment();
    }
}
