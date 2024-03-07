package task2;

public class Question21 {
	public static void main(String[] args) {
		int n = 9;
		int k = n;
		for (int i = 1; i <= n; i++, k--) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = k; j <= n; j++) {
				System.out.print(j + " ");
			}
			for (int j = n - 1; j >= k; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
