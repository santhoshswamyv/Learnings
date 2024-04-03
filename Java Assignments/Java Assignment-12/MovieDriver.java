package javaassignment12;

public class MovieDriver {
	public static void main(String[] args) {
		Movie actionMovie = new ActionMovie("Leo", 2023, 10000000);
		Movie comedyMovie = new ComedyMovie("The Hangover", 2009, 200000000);

		actionMovie.displayInfo();
		System.out.println();

		comedyMovie.displayInfo();
	}
}

abstract class Movie {
	String title;
	int year;

	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public abstract String getGenre();

	public void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Year: " + year);
		System.out.println("Genre: " + getGenre());
	}
}

class ActionMovie extends Movie {
	double budget;

	public ActionMovie(String title, int year, double budget) {
		super(title, year);
		this.budget = budget;
	}

	@Override
	public String getGenre() {
		return "Action";
	}

}

class ComedyMovie extends Movie {
	double revenueGenerated;

	public ComedyMovie(String title, int year, double revenueGenerated) {
		super(title, year);
		this.revenueGenerated = revenueGenerated;
	}

	@Override
	public String getGenre() {
		return "Comedy";
	}
}
