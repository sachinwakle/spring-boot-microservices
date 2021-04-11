package io.sawa.movie.catalog.model;

import java.util.List;

public class UserRating {
    private String username;
    private List<MovieRating> ratings;


    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public List<MovieRating> getRatings() {
	return ratings;
    }

    public void setRatings(List<MovieRating> ratings) {
	this.ratings = ratings;
    }

}
