package logic1;

public class Love6 {
	public static void main(String[] args) {
		Love6 s = new Love6();
		System.out.println(s.love6(0, 0));
	}

	public boolean love6(int a, int b) {
		if (a != 6 && b != 6 && Math.abs(a - b) != 6 && a + b != 6)
			return false;

		return true;
	}

}
