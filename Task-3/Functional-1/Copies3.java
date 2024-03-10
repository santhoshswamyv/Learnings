package task3.functional1;

import java.util.List;

public class Copies3 {
	public static void main(String[] args) {
		Copies3 s = new Copies3();
		System.out.println(s.copies3(null));
	}

	public List<String> copies3(List<String> strings) {
		strings.replaceAll(n -> n + n + n);
		return strings;
	}

}
