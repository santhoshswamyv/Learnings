package task1;

public class Count11 {
	public static void main(String[] args) {
		Count11 s = new Count11();
		System.out.println(s.count11("111111111111111"));
	}

	public int count11(String str) {
		if (str.length() <= 1) {
			return 0;
		}

		if (str.substring(0, 2).equals("11")) {
			return 1 + count11(str.substring(2));
		} else {
			return count11(str.substring(1));
		}
	}

}
