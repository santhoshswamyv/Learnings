package logic1;

public class Old35 {
	public static void main(String[] args) {
		Old35 s = new Old35();
		System.out.println(s.old35(0));
	}

	public boolean old35(int n) {
		return (n % 3 == 0 && n % 5 != 0 || n % 5 == 0 && n % 3 != 0);
	}

}
