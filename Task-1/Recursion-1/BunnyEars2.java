package task1;

public class BunnyEars2 {
	public static void main(String[] args) {
		BunnyEars2 s = new BunnyEars2();
		System.out.println(s.bunnyEars2(0));
	}

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0)
			return 0;
		if (bunnies % 2 != 0) {
			return 2 + bunnyEars2(bunnies - 1);
		} else {
			return 3 + bunnyEars2(bunnies - 1);
		}
	}
}
