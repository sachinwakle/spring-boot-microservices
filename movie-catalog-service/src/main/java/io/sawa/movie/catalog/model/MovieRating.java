package io.sawa.movie.catalog.model;

public class MovieRating {
    private String movieName;
    private String rating;
    private String description;

    public MovieRating() {

    }

    public MovieRating(String movieName, String rating, String description) {
	this.movieName = movieName;
	this.rating = rating;
	this.description = description;
    }

    public String getMovieName() {
	return movieName;
    }

    public void setMovieName(String movieName) {
	this.movieName = movieName;
    }

    public String getRating() {
	return rating;
    }

    public void setRating(String rating) {
	this.rating = rating;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }
}
