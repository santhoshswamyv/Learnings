package task3.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
	public static void main(String[] args) {
		NoX s = new NoX();
		System.out.println(s.noX(null));
	}

	public List<String> noX(List<String> strings) {
		return strings.stream().map(s -> s.replace("x", "")).collect(Collectors.toList());
	}

}
