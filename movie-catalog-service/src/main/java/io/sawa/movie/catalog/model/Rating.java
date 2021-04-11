package io.sawa.movie.catalog.model;

public class Rating {
    private String movieId;
    private String movieRating;

    public Rating() {
    }

    public Rating(String movieName, String movieRating) {
	this.movieId = movieName;
	this.movieRating = movieRating;
    }

    public String getMovieName() {
	return movieId;
    }

    public void setMovieName(String movieName) {
	this.movieId = movieName;
    }

    public String getRating() {
	return movieRating;
    }

    public void setRating(String rating) {
	this.movieRating = rating;
    }

}
