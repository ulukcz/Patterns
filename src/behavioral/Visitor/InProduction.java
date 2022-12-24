package behavioral.Visitor;

public class InProduction implements MovieElements{
    @Override
    public void shooting(Director director) {
        director.create(this);
    }
}
