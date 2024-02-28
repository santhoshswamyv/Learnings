package logic2;

public class CloseFar {
	public static void main(String[] args) {
		CloseFar s = new CloseFar();
		System.out.println(s.closeFar(0, 0, 0));
	}

	public boolean closeFar(int a, int b, int c) {
		if (Math.abs(a - b) <= 1 && Math.abs(b - c) >= 2 && Math.abs(a - c) >= 2)
			return true;
		else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2)
			return true;

		return false;

	}

}
