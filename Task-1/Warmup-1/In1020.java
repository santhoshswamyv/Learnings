package warmup1;

public class In1020 {
	public static void main(String[] args) {
		In1020 s = new In1020();
		System.out.println(s.in1020(12, 0));
	}

	public boolean in1020(int a, int b) {
		if (a >= 10 && a <= 20 || b >= 10 && b <= 20)
			return true;

		return false;
	}

}
