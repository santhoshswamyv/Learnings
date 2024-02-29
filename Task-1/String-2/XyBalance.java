package string2;

public class XyBalance {
	public static void main(String[] args) {
		XyBalance s = new XyBalance();
		System.out.println(s.xyBalance("xxxy"));
	}

	public boolean xyBalance(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x' || str.charAt(i) == 'y')
				res += str.charAt(i);
		}

		if (res.length() == 0)
			return true;

		return (res.charAt(res.length() - 1) == 'y');
	}

}
