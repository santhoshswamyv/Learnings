package javaassignment7;

public class Movie {
	// Instance variables
	private String title;
	private String director;
	private int releaseYear;
	private double rating;

	// Static variable
	private static int totalMovies;

	// Constructor
	public Movie(String title, String director, int releaseYear, double rating) {
		this.title = title;
		this.director = director;
		this.releaseYear = releaseYear;
		this.rating = rating;
		totalMovies++; // Increment the static variable
	}

	// Getter for title
	public String getTitle() {
		return title;
	}

	// Getter for director
	public String getDirector() {
		return director;
	}

	// Getter for releaseYear
	public int getReleaseYear() {
		return releaseYear;
	}

	// Getter for rating
	public double getRating() {
		return rating;
	}

	// Static method to get the total number of movies
	public static int getTotalMovies() {
		return totalMovies;
	}
}
