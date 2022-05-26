package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve id, title, and a 150x200 box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
*/
public class Kata4 {
    public static List<Map> execute() {
        List<MovieList> x = DataUtil.getMovieLists();

        return x.stream()
                .flatMap(e -> e.getVideos().stream()
                        .map(m -> ImmutableMap.of("ID", m.getId(), "Title", m.getTitle(),
                                "BoXArt", m.getBoxarts().stream()
                                        .filter(b -> b.getWidth() == 150 && b.getHeight() == 200).findFirst())))
                .collect(Collectors.toList());


    }
}
