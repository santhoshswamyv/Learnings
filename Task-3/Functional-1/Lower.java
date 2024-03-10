package task3.functional1;

import java.util.List;

public class Lower {
	public static void main(String[] args) {
		Lower s = new Lower();
		System.out.println(s.lower(null));
	}

	public List<String> lower(List<String> strings) {
		strings.replaceAll(n -> n.toLowerCase());
		return strings;
	}

}
