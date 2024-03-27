package javaassignment7;

public class Book {
	// Instance variables
	private String title;
	private String isbn;
	private double price;

	// Static variable
	private static int numberOfBooks;

	// Constructor
	public Book(String title, String isbn, double price) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		numberOfBooks++; // Increment the static variable
	}

	// Getter for title
	public String getTitle() {
		return title;
	}

	// Setter for title
	public void setTitle(String title) {
		this.title = title;
	}

	// Getter for isbn
	public String getIsbn() {
		return isbn;
	}

	// Setter for isbn
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	// Getter for price
	public double getPrice() {
		return price;
	}

	// Setter for price
	public void setPrice(double price) {
		this.price = price;
	}

	// Static method to get the total number of books
	public static int getNumberOfBooks() {
		return numberOfBooks;
	}
}
