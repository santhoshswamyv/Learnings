package warmup1;

public class In3050 {
	public static void main(String[] args) {
		In3050 s = new In3050();
		System.out.println(s.in3050(0, 0));
	}

	public boolean in3050(int a, int b) {
		if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
			return true;
		}
		if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
			return true;
		}
		return false;
	}

}
