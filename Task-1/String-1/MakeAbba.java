package string1;

public class MakeAbba {
	public static void main(String[] args) {
		MakeAbba s = new MakeAbba();
		System.out.println(s.makeAbba("Sandy", "Hi"));
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

}
