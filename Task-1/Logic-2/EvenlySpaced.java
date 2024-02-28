package logic2;

public class EvenlySpaced {
	public static void main(String[] args) {
		EvenlySpaced s = new EvenlySpaced();
		System.out.println(s.evenlySpaced(0, 0, 0));
	}

	public boolean evenlySpaced(int a, int b, int c) {
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int mid = a + b + c - min - max;

		return mid - min == max - mid;
	}

}
