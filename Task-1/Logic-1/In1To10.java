package logic1;

public class In1To10 {
	public static void main(String[] args) {
		In1To10 s = new In1To10();
		System.out.println(s.in1To10(0, false));
	}

	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode) {
			return (n <= 1 || n >= 10);
		} else {
			return (n >= 1 && n <= 10);
		}
	}

}
