package warmup1;

public class StartHi {
	public static void main(String[] args) {
		StartHi s = new StartHi();
		System.out.println(s.startHi("Hi"));
	}

	public boolean startHi(String str) {
		if (str.length() >= 2)
			return str.substring(0, 2).equals("hi");

		return false;
	}

}
