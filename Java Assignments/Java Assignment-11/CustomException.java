package javaassignment11;

public class CustomException extends Exception {

	public static void main(String[] args) {
		try {
			throw new CustomException();
		} catch (CustomException e) {
			System.out.println("Custom Exception has been thrown and Catched..!");
		}
	}
}
