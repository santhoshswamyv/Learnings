package task1;

public class NoX {
	public static void main(String[] args) {
		NoX s = new NoX();
		System.out.println(s.noX("asfasfasf"));
	}

	public String noX(String str) {
		if (str.length() == 0)
			return str;
		if (str.charAt(0) == 'x')
			return noX(str.substring(1));
		return str.charAt(0) + noX(str.substring(1));
	}

}
