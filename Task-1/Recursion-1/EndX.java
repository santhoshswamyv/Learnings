package task1;

public class EndX {
	public static void main(String[] args) {
		EndX s = new EndX();
		System.out.println(s.endX("xxxxx"));
	}

	public String endX(String str) {
		if (str.length() == 0)
			return str;
		if (str.charAt(0) != 'x')
			return (char) (str.charAt(0)) + endX(str.substring(1));
		return endX(str.substring(1)) + "x";
	}

}
