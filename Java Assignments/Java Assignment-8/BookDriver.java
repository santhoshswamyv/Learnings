package javaassignment8;

import java.util.Scanner;

class BookDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalBooks = sc.nextInt();
		sc.nextLine();
		Book books[] = new Book[totalBooks];
		for (int i = 0; i < books.length; i++) {
			System.out.print("Enter the Book Title : ");
			String title = sc.next();
			System.out.print("Enter the Book ISBN : ");
			String isbn = sc.next();
			System.out.print("Enter the Book Price : ");
			double price = sc.nextDouble();
			books[i] = new Book(title, isbn, price);
		}
		sc.close();
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
}

class Book {
	private String title;
	private String isbn;
	private double price;

	private static int numberOfBooks;

	public Book(String title, String isbn, double price) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		numberOfBooks++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getNumberOfBooks() {
		return numberOfBooks;
	}

	@Override
	public String toString() {
		return "Book Details : \n\nBook Title : " + title + "\nBook ISBN : " + isbn + "\nBook Price : " + price;
	}
}
