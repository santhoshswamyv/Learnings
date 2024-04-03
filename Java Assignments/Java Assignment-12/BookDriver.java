package javaassignment12;

import java.util.Scanner;

abstract class Authorization {
	abstract boolean authorize(String username, String password);
}

public class BookDriver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Book book = new Book();
		System.out.println(book.toString());
		boolean b = true;
		do {
			System.out.print("Enter the Username : ");
			String username = sc.nextLine();
			System.out.print("Enter the Password : ");
			String password = sc.nextLine();
			if (book.authorize(username, password)) {
				book.showAlert("\nYou are Authorized can change the Details\n");
				System.out.print("Enter the Author Name : ");
				String author = sc.nextLine();
				book.setBookAuthor(author);
				System.out.println(book.toString());
				b = false;
			} else {
				book.showAlert("\nYou are Unauthorized or Incorrect Credentials\n");
			}
		} while (b);
	}
}

class Book extends Authorization {
	String name = "The Invisible Man";
	String bId = "BK001";
	String author = "H.G Wells";

	public void setBookAuthor(String author) {
		this.author = author;
	}

	public void showAlert(String alert) {
		System.err.println(alert);
	}

	boolean authorize(String username, String password) {
		String authorizedUsername = "admin@gmail.com";
		String authorizedPassword = "admin@123";
		return (username.equals(authorizedUsername)) && (password.equals(authorizedPassword));
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", bId=" + bId + ", author=" + author + "]";
	}

}