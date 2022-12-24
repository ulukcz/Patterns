package behavioral.Visitor;

public class Preproduction implements MovieElements{
    @Override
    public void shooting(Director director) {
        director.create(this);
    }
}
