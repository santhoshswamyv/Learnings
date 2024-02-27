package string1;

public class ExtraEnd {
	public static void main(String[] args) {
		ExtraEnd s = new ExtraEnd();
		System.out.println(s.extraEnd("Sandy"));
	}

	public String extraEnd(String str) {
		String last = str.substring(str.length() - 2);
		return last + last + last;
	}

}
