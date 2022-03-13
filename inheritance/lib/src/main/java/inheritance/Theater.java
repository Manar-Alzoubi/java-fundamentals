package inheritance;

import java.util.ArrayList;

public class Theater extends Review{


    private String name;
    static ArrayList<String> allMovies = new ArrayList <>();
    ArrayList<Review> reviews= new ArrayList <>();

     // constructor
    public Theater(String name, String new_) {
       super(name);
    }
    // add movie to list
    public void addMovie(String movieToAdd)
    {
        allMovies.add(movieToAdd);
    }

    //delete movie from list
    public void deleteMovie(String movieToDelete)
    {
        allMovies.remove(movieToDelete);
    }
    public void addReview(String name, String description, int starsNum, String comment) {
        Review newReview = new Review(name  , description , starsNum,comment );
        this.reviews.add(newReview);
    }

    public void movAddReview(String name, String description, int starsNum, String comment) {
        Review newReview = new Review(name  , description ,starsNum, comment );
        this.allMovies.add(String.valueOf(newReview));
    }
    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", stars=" + getNumOfStars() +
                ", movies="+ allMovies+
                ", reviews=" + reviews +
                '}';
    }

    public static ArrayList<String> getAllMovies() {
        return allMovies;
    }


}
