package behavioral.Command;

public class DoKebabResponsibility implements Responsibility{
    KebabMan kebabMan;
    public DoKebabResponsibility(KebabMan kebabMan) {
        this.kebabMan = kebabMan;
    }

    @Override
    public void execute() {
        kebabMan.doKebab();
    }
}
