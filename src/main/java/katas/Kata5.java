package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.Optional;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();
        Double e;

        e = movies.stream()
                .reduce((acu, elemt) -> acu.getRating() > elemt.getRating() ? acu : elemt).get().getRating();
                //.map(x -> x.getRating()).get();
        return e;


    }
}
