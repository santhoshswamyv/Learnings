package warmup1;

public class IntMax {
	public static void main(String[] args) {
		IntMax s = new IntMax();
		System.out.println(s.intMax(0, 0, 0));
	}

	public int intMax(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}

}
