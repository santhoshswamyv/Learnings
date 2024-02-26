package warmup2;

public class FrontTimes {
	public static void main(String[] args) {
		FrontTimes s=new FrontTimes();
		System.out.println(s.frontTimes("Sandy", 1));
	}
	public String frontTimes(String str, int n) {
		String res = "";
		if (str.length() < 3) {
			for (int i = 0; i < n; i++)
				res += str;
		} else {
			String first = str.substring(0, 3);
			for (int i = 0; i < n; i++)
				res += first;
		}
		return res;
	}

}
