package task3.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
	public static void main(String[] args) {
		NoYY s = new NoYY();
		System.out.println(s.noYY(null));
	}

	public List<String> noYY(List<String> strings) {
		return strings.stream().map(s -> s + "y").filter(s -> !s.contains("yy")).collect(Collectors.toList());
	}

}
