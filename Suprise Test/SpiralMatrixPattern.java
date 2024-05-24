package suprisetest;

public class SpiralMatrixPattern {
	public static void main(String[] args) {
		int n = 7;
		int topLeft = 0;
		int topRight = n - 1;
		int bottomRight = n - 1;
		int bottomLeft = 0;

		int spiral[][] = new int[n][n];

		int value = 1;

		while (value <= n * n) {
			for (int i = topLeft; i <= topRight; i++) {
				spiral[topLeft][i] = value++;
			}

			topLeft++;

			for (int i = topLeft; i <= bottomRight; i++) {
				spiral[i][topRight] = value++;
			}

			topRight--;

			for (int i = bottomRight - 1; i >= bottomLeft; i--) {
				spiral[bottomRight][i] = value++;
			}

			bottomRight--;

			for (int i = bottomRight; i >= topLeft; i--) {
				spiral[i][bottomLeft] = value++;
			}

			bottomLeft++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(spiral[i][j] + " ");
			}
			System.out.println();
		}
	}
}
