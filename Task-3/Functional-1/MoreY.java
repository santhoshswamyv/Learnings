package task3.functional1;

import java.util.List;

public class MoreY {
	public static void main(String[] args) {
		MoreY s = new MoreY();
		System.out.println(s.moreY(null));
	}

	public List<String> moreY(List<String> strings) {
		strings.replaceAll(n -> "y" + n + "y");
		return strings;
	}

}
