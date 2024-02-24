package warmup1;

public class Diff21 {

	public static void main(String[] args) {
		Diff21 s = new Diff21();
		System.out.println(s.diff21(0));
	}

	public int diff21(int n) {
		if (n > 21)
			return (n - 21) * 2;

		return 21 - n;
	}

}
