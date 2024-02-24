package warmup1;

public class Makes10 {
	public static void main(String[] args) {
		Makes10 s = new Makes10();
		System.out.println(s.makes10(0, 0));
	}

	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10)
			return true;

		return false;
	}

}
