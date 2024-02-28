package logic1;

public class LessBy10 {
	public static void main(String[] args) {
		LessBy10 s = new LessBy10();
		System.out.println(s.lessBy10(0, 0, 0));
	}

	public boolean lessBy10(int a, int b, int c) {
		return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
	}

}
