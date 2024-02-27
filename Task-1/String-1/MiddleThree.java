package string1;

public class MiddleThree {
	public static void main(String[] args) {
		MiddleThree s = new MiddleThree();
		System.out.println(s.middleThree("Sandy"));
	}

	public String middleThree(String str) {
		int index = str.length() / 2;
		return str.substring(index - 1, index + 2);
	}

}
