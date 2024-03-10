package task3.functional2;

import java.util.List;

public class No34 {
	public static void main(String[] args) {
		No34 s = new No34();
		System.out.println(s.no34(null));
	}

	public List<String> no34(List<String> strings) {
		strings.removeIf(n -> n.length() == 3 || n.length() == 4);
		return strings;
	}

}
