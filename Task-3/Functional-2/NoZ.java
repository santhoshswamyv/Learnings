package task3.functional2;

import java.util.List;

public class NoZ {
	public static void main(String[] args) {
		NoZ s = new NoZ();
		System.out.println(s.noZ(null));
	}

	public List<String> noZ(List<String> strings) {
		strings.removeIf(n -> n.contains("z"));
		return strings;
	}

}
