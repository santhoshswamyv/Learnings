package string1;

public class MiddleTwo {
	public static void main(String[] args) {
		MiddleTwo s = new MiddleTwo();
		System.out.println(s.middleTwo("Hello"));
	}

	public String middleTwo(String str) {
		int index = str.length() / 2;
		return str.substring(index - 1, index + 1);
	}

}
