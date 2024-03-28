package javaassignment8.question5;

public class Account {
	int noBorrowedBooks, noReservedBooks, noReturnedBooks, noLostBooks;
	double fine_amount;
	User user;

	public Account() {
		this.user = new User(this);
	}

	void calculateFine() {
		// Implement functionality
	}
}
