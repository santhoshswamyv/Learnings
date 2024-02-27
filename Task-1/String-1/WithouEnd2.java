package string1;

public class WithouEnd2 {
	public static void main(String[] args) {
		WithouEnd2 s = new WithouEnd2();
		System.out.println(s.withouEnd2("Hello"));
	}

	public String withouEnd2(String str) {
		if (str.length() <= 1)
			return "";
		return str.substring(1, str.length() - 1);
	}

}
