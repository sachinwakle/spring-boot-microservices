package io.sawa.movie.catalog.model;

import java.util.List;

public class RatingContainer {

    public RatingContainer() {
    }

    List<Rating> userRatings;

    public List<Rating> getUserRatings() {
	return userRatings;
    }

    public void setUserRatings(List<Rating> userRatings) {
	this.userRatings = userRatings;
    }

}
