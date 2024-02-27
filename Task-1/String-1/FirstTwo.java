package string1;

public class FirstTwo {
	public static void main(String[] args) {
		FirstTwo s = new FirstTwo();
		System.out.println(s.firstTwo("Sandy"));
	}

	public String firstTwo(String str) {
		if (str.length() <= 2)
			return str;

		return str.substring(0, 2);
	}

}
