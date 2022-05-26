package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys")
*/
public class Kata1 {
    public static List<Map> execute() {
        List<Movie> movies = DataUtil.getMovies();
        //List<Movie> lista = new Arrays.asList("","","","");

        List<Map> lista = new ArrayList<>();

        //Movie o =(x) -> x.g

        lista = movies.stream()
                .map((x) ->ImmutableMap.of(x.getId(), x.getInterestingMoments(), x.getTitle(), x.getBoxarts()))
                .collect(Collectors.toList());

        return lista;


//        Map<String, lista> mapa = movies.stream().collect(Collectors.toMap(x -> x.getId(), x -> x));
//
//        return ImmutableList.of(ImmutableMap.of(movie.getId, 5, "title", "Bad Boys"));
//
//        List < ModeloCoche > modelos = Arrays.asList(modelo1, modelo2, modelo3);

    }
}
