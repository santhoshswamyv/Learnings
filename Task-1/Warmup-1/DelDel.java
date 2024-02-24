package warmup1;

public class DelDel {
	public static void main(String[] args) {
		DelDel s = new DelDel();
		System.out.println(s.delDel("adelsad"));
	}

	public String delDel(String str) {
		if (str.length() > 3) {
			String s = str.substring(1, 4);
			if (s.equals("del")) {
				return str.substring(0, 1) + str.substring(4);
			}
		}

		return str;
	}

}
