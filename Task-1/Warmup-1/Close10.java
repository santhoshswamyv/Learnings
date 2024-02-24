package warmup1;

public class Close10 {

	public static void main(String[] args) {
		Close10 s = new Close10();
		System.out.println(s.close10(0, 0));
	}

	public int close10(int a, int b) {
		if (Math.abs(a - 10) < Math.abs(b - 10))
			return a;
		else if (Math.abs(a - 10) > Math.abs(b - 10))
			return b;

		return 0;
	}

}
