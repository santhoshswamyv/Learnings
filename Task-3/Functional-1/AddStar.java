package task3.functional1;

import java.util.List;

public class AddStar {
	public static void main(String[] args) {
		AddStar s = new AddStar();
		System.out.println(s.addStar(null));
	}

	public List<String> addStar(List<String> strings) {
		strings.replaceAll(n -> n + "*");
		return strings;
	}

}
