package march05;

public class Question3mp {
	public static void main(String[] args) {
		int base = 3;
		int power = 3;
		System.out.println(powerN(base, power));
	}

	public static int powerN(int base, int power) {
		if (power == 0) {
			return 1;
		} else {
			return base * powerN(base, power - 1);
		}
	}

}
