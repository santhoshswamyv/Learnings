package logic1;

public class ShareDigit {
	public static void main(String[] args) {
		ShareDigit s = new ShareDigit();
		System.out.println(s.shareDigit(0, 0));
	}

	public boolean shareDigit(int a, int b) {
		return (a % 10 == b % 10) || (a / 10 == b / 10) || (a % 10 == b / 10) || (a / 10 == b % 10);
	}

}
