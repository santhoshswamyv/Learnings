package task1;

public class BunnyEars {
	public static void main(String[] args) {
		BunnyEars s = new BunnyEars();
		System.out.println(s.bunnyEars(4));
	}

	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return bunnies;
		} else {
			return bunnyEars(bunnies - 1) + 2;
		}

	}

}
