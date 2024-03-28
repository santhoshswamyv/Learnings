package javaassignment8.question5;

public class User {
	int id;
	String name;
	LibraryManagementSystem libraryManagementSystem;
	Account account;

	User() {
		libraryManagementSystem = new LibraryManagementSystem(this);
	}

	User(Account account) {
		this.account = account;
	}

	void verify() {
	}

	void checkAccount() {
		// Implement functionality
	}

	void getBookInfo() {
		// Implement functionality
	}
}
