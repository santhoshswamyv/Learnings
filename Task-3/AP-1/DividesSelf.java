package task3.ap1;

public class DividesSelf {
	public static void main(String[] args) {
		DividesSelf s = new DividesSelf();
		System.out.println(s.dividesSelf(0));
	}

	public boolean dividesSelf(int n) {
		if ((n + "").contains("0"))
			return false;

		int temp = n;
		while (temp > 0) {
			int last = temp % 10;
			if (n % last != 0)
				return false;

			temp /= 10;
		}

		return true;
	}

}
