package string1;

public class FirstHalf {
	public static void main(String[] args) {
		FirstHalf s = new FirstHalf();
		System.out.println(s.firstHalf("HelloThere"));
	}

	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

}
