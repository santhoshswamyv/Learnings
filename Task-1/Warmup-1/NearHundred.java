package warmup1;

public class NearHundred {
	public static void main(String[] args) {
		NearHundred s = new NearHundred();
		System.out.println(s.nearHundred(0));
	}

	public boolean nearHundred(int n) {
		if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10)
			return true;

		return false;
	}

}
