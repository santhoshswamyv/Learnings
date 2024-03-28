package javaassignment8.question5;

public class LibraryManagementSystem {
	String userType, userName, password;

	User user;
	Book book;
	Librarian librarian;

	LibraryManagementSystem(User user) {
		this.user = user;
	}

	LibraryManagementSystem(Book book) {
		this.book = book;
	}

	LibraryManagementSystem(Librarian librarian) {
		this.librarian = librarian;
	}

	void login() {
		// Implement functionality
	}

	void register() {
		// Implement functionality
	}

	void logout() {
		// Implement functionality
	}
}
