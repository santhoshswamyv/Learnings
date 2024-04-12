package javaassignment13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Question 1 & 2
public class BookDriver {
	static Scanner scanner = new Scanner(System.in);

	ArrayList<Book> bList = new ArrayList<>();
	static BookDriver bookDriver = new BookDriver();

	public static void main(String[] args) {
		boolean b = true;
		do {
			System.out.println("Add Books  (Yes/No)");
			String cfrm = scanner.next();
			if (cfrm.equalsIgnoreCase("yes")) {
				String bookId = "BK" + Book.id;
				System.out.println("Book ID : " + bookId);
				System.out.print("Enter the Title : ");
				String title = scanner.next();
				System.out.print("Enter the ISBN : ");
				String isbn = scanner.next();
				System.out.print("Enter the Price : ");
				double price = scanner.nextDouble();
				Book book = bookDriver.addBook(bookId, title, isbn, price);
				bookDriver.bList.add(book);
				System.err.println("Book Added Successfully..!");
			} else if (cfrm.equalsIgnoreCase("no")) {
				b = false;
			} else {
				System.err.println("Wrong Input..!");
			}
		} while (b);

		System.out.println();
		b = true;
		do {
			System.out.println("1) View Books \n2) Modify Book \n3) Remove Book \n4) Exit");
			String opt = scanner.next();
			switch (opt) {
			case "1":
				if (bookDriver.bList.isEmpty()) {
					System.err.println("Book list is empty..!");
					break;
				}
				System.err.println("Book Details..!");
				for (Book book : bookDriver.bList) {
					System.out.println(book.toString());
					System.out.println();
				}
				break;
			case "2":
				System.out.print("Enter the Book Id : ");
				String bkId = scanner.next();
				if (bookDriver.modifyBook(bkId)) {
					System.out.println("Book modified successfully..!");
					System.out.println();
				}
				break;
			case "3":
				System.out.print("Enter the Book Id : ");
				bkId = scanner.next();
				if (bookDriver.removeBook(bkId)) {
					System.out.println("Book removed successfully..!");
					System.out.println();
				}
				break;

			case "4":
				b = false;
				break;
			default:
				System.out.println("Choose a valid Option..!");
				break;
			}
		} while (b);
	}

	public Book addBook(String bookId, String title, String isbn, double price) {
		return new Book(bookId, title, isbn, price);
	}

	public boolean removeBook(String bookId) {
		Iterator<Book> iterator = bookDriver.bList.iterator();
		while (iterator.hasNext()) {
			Book bkBook = iterator.next();
			if (bkBook.getBookId().equals(bookId)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	public boolean modifyBook(String bookId) {
		Book bkBook = null;
		for (Book book : bookDriver.bList) {
			if (book.getBookId().equals(bookId)) {
				bkBook = book;
				break;
			}
		}

		if (bkBook == null) {
			System.out.println("Book not Found..!");
		} else {
			System.out.println("1) Modify Title \n2) Modify Price \n3-9) Return");
			String sopt = scanner.next();
			switch (sopt) {
			case "1":
				System.out.print("Enter the Book Title : ");
				String title = scanner.next();
				bkBook.setTitle(title);
				System.err.println("Book Title Modified..!");
				return true;
			case "2":
				System.out.print("Enter the Book Price : ");
				double price = scanner.nextDouble();
				bkBook.setPrice(price);
				System.err.println("Book Price Modified..!");
				return true;
			default:
				break;
			}
		}
		return false;
	}

	class Book {
		private String bookId;
		private String title;
		private String isbn;
		private double price;

		static int id = 100;

		public String getBookId() {
			return bookId;
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

		public Book(String bookId, String title, String isbn, double price) {
			this.bookId = bookId;
			this.title = title;
			this.isbn = isbn;
			this.price = price;
			id++;
		}

		public Book() {
		}

		@Override
		public String toString() {
			return "Book ID : " + bookId + "\nBook Title : " + title + "\nBook ISBN : " + isbn + "\nBook Price : "
					+ price;
		}
	}
}