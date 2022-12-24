package behavioral.Command;

public class PrepareMeatResponsibility implements Responsibility{
    private KebabMan kebabMan;

    public PrepareMeatResponsibility(KebabMan kebabMan) {
        this.kebabMan = kebabMan;
    }

    @Override
    public void execute() {
        kebabMan.prepareMeat();
    }
}
