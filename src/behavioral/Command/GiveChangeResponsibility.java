package behavioral.Command;

public class GiveChangeResponsibility implements Responsibility{
    KebabMan kebabMan;
    public GiveChangeResponsibility(KebabMan kebabMan) {
        this.kebabMan = kebabMan;
    }

    @Override
    public void execute() {
        kebabMan.giveChange();
    }
}
