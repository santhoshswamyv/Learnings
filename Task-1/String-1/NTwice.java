package string1;

public class NTwice {
	public static void main(String[] args) {
		NTwice s = new NTwice();
		System.out.println(s.nTwice("Hello", 2));
	}

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n);
	}

}
