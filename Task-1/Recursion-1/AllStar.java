package task1;

public class AllStar {
	public static void main(String[] args) {
		AllStar s = new AllStar();
		System.out.println(s.allStar("ababababa"));
	}

	public String allStar(String str) {
		if (str.length() <= 1)
			return str;
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}

}
