package string1;

public class NonStart {
	public static void main(String[] args) {
		NonStart s = new NonStart();
		System.out.println(s.nonStart("HHello ", "SSandy"));
	}

	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

}
