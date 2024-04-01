package javaassignment11;

public class Question5 {
	public static void main(String[] args) {
		try {
			// Declaring a 0 size array
			int arr[] = new int[0];

			// Trying to add a integer in 0th Index
			arr[0] = 7;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
}
