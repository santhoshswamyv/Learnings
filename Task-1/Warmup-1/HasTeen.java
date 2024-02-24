package warmup1;

public class HasTeen {
	public static void main(String[] args) {
		HasTeen s = new HasTeen();
		System.out.println(s.hasTeen(0, 0, 0));
	}

	public boolean hasTeen(int a, int b, int c) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19)
			return true;

		return false;
	}

}
