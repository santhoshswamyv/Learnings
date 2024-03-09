package task1;

public class ChangePi {
	public static void main(String[] args) {
		ChangePi s = new ChangePi();
		System.out.println(s.changePi("3.14"));
	}

	public String changePi(String str) {
		if (str.length() <= 1)
			return str;
		if (str.substring(0, 2).equals("pi"))
			return "3.14" + changePi(str.substring(2));
		return str.charAt(0) + changePi(str.substring(1));
	}
}
