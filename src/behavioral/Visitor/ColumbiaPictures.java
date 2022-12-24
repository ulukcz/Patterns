package behavioral.Visitor;

public class ColumbiaPictures {
    public static void main(String[] args) {
        Movie movie = new Movie();

        Director john = new ShortMovieDirector();
        Director spielberg = new TheaterMovieDirector();

        System.out.println("Giving money for short movie");
        movie.shooting(john);

        System.out.println("Giving money for blockbuster");
        movie.shooting(spielberg);
    }
}
