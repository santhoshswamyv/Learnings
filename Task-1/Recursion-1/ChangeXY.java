package task1;

public class ChangeXY {
	public static void main(String[] args) {
		ChangeXY s = new ChangeXY();
		System.out.println(s.changeXY("xyxyxy"));
	}

	public String changeXY(String str) {
		if (str.length() == 0)
			return "";
		if (str.charAt(0) == 'x')
			return "y" + changeXY(str.substring(1));
		return str.charAt(0) + changeXY(str.substring(1));
	}

}
