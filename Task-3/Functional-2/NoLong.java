package task3.functional2;

import java.util.List;

public class NoLong {
	public static void main(String[] args) {
		NoLong s = new NoLong();
		System.out.println(s.noLong(null));
	}

	public List<String> noLong(List<String> strings) {
		strings.removeIf(n -> n.length() >= 4);
		return strings;
	}

}
