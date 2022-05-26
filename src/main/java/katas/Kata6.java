package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();

        String e;

        e = movies.stream()
                .flatMap(m -> m.getBoxarts().stream())
                .reduce((acu, elemt) -> acu.getHeight() > elemt.getWidth() ? acu : elemt)
                .map(b -> b.getUrl()).get();
        return e;
        //return "someUrl";
    }
}
