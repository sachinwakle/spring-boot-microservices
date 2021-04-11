package io.sawa.ratings.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sawa.ratings.model.Rating;
import io.sawa.ratings.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class UserRatingResource {

    @GetMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
	List<Rating> ratings = Arrays.asList(new Rating("MV01", "5"), new Rating("MV02", "4"));
	UserRating userRating = new UserRating();
	userRating.setUserRatings(ratings);
	return userRating;
    }

}
