package logic1;

public class More20 {
	public static void main(String[] args) {
		More20 s = new More20();
		System.out.println(s.more20(20));
	}

	public boolean more20(int n) {
		return (n % 20 == 1 || n % 20 == 2);
	}

}
