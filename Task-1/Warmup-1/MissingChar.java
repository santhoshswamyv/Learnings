package warmup1;

public class MissingChar {
	
	public static void main(String[] args) {
		MissingChar s=new MissingChar();
		System.out.println(s.missingChar("kitten", 0));
	}
	public String missingChar(String str, int n) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i != n)
				result += str.charAt(i);
		}
		return result;
	}

}

/*
 * 
 *   String front = str.substring(0, n);
 *   String back = str.substring(n+1, str.length());
 *   return front + back;
 *
 */
