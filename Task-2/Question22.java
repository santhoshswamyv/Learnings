package task2;

public class Question22 {
	public static void main(String[] args) {
		int n = 9;
		for (int i = n; i > 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i - 1); j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
	}
}
