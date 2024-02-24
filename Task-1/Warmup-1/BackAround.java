package warmup1;

public class BackAround {
	public static void main(String[] args) {
		BackAround s = new BackAround();
		System.out.println(s.backAround("cat"));
	}

	public String backAround(String str) {
		return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
	}

}
