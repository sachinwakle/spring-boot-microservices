package io.sawa.movie.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sawa.movie.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

    @GetMapping("/info/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId) {
	return new Movie("Batman", "MV01");
    }

}
