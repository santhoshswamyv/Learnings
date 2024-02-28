package logic1;

public class Less20 {
	public static void main(String[] args) {
		Less20 s = new Less20();
		System.out.println(s.less20(0));
	}

	public boolean less20(int n) {
		return ((n + 1) % 20 == 0 || (n + 2) % 20 == 0);
	}

}
