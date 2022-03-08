package inheritance;

import java.util.ArrayList;

public class Theater extends Review{


    private String name;
    static ArrayList<String> allMovies = new ArrayList <>();

     // constructor
    public Theater(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                '}';

    }

    public static ArrayList<String> getAllMovies() {
        return allMovies;
    }

    public static void setAllMovies(ArrayList<String> allMovies) {
        Theater.allMovies = allMovies;
    }

    public ArrayList<String> AddReview(Review rev1) {
        return getAllMovies();
    }
}
