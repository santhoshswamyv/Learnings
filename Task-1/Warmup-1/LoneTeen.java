package warmup1;

public class LoneTeen {
	public static void main(String[] args) {
		LoneTeen s = new LoneTeen();
		System.out.println(s.loneTeen(0, 0));
	}

	public boolean loneTeen(int a, int b) {
		if (a >= 13 && a <= 19 && !(b >= 13 && b <= 19))
			return true;

		if (b >= 13 && b <= 19 && !(a >= 13 && a <= 19))
			return true;

		return false;
	}

}
