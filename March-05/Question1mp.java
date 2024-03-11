package march05;

public class Question1mp {
	public static void main(String[] args) {
		String str = "aaaaa";
		System.out.println(pairStar(str));
	}

	public static String pairStar(String str) {
	
		if(str.length()<=1) {
			return str;
		}
		
		if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		} else {
			return str.charAt(0) + pairStar(str.substring(1));
		}

	}
}
