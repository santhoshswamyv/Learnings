package logic1;

public class TwoAsOne {
	public static void main(String[] args) {
		TwoAsOne s = new TwoAsOne();
		System.out.println(s.twoAsOne(0, 0, 0));
	}

	public boolean twoAsOne(int a, int b, int c) {
		return (a + b == c) || (a + c == b) || (b + c == a);
	}

}
