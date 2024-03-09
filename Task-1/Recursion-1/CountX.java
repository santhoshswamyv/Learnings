package task1;

public class CountX {
	public static void main(String[] args) {
		CountX s = new CountX();
		System.out.println(s.countX("xcxcxxxxx"));
	}

	public int countX(String str) {
		if (str.length() == 0)
			return 0;
		if (str.charAt(0) == 'x')
			return 1 + countX(str.substring(1));

		return countX(str.substring(1));
	}

}
