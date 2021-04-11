package io.sawa.movie.catalog.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.sawa.movie.catalog.model.Movie;
import io.sawa.movie.catalog.model.MovieRating;
import io.sawa.movie.catalog.model.RatingContainer;
import io.sawa.movie.catalog.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.GET, path = "/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {

	RatingContainer ratingContainer = restTemplate.getForObject("http://ratings-data-service/ratings/users/foo",
		RatingContainer.class);

	List<MovieRating> movieRatings = ratingContainer.getUserRatings().stream().map(rating -> {
	    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/info/mv01", Movie.class);
	    return new MovieRating(movie.getName(), rating.getRating(), "awesome movie");
	}).collect(Collectors.toList());

	UserRating user = new UserRating();
	user.setRatings(movieRatings);
	user.setUsername("Foo");

	return user;
    }

}
