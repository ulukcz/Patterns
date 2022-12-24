package behavioral.Visitor;

public class Movie implements MovieElements {
    MovieElements[] movieElements;

    public Movie() {
        this.movieElements = new MovieElements[]{
                new Preproduction(),
                new InProduction(),
                new PostProduction()
        };
    }

    @Override
    public void shooting(Director director) {
        for (MovieElements m: movieElements) {
           m.shooting(director);
        }
    }
}
